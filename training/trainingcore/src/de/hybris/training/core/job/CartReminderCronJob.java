package de.hybris.training.core.job;

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.util.mail.MailUtils;
import de.hybris.training.core.dao.AbandonedCartDao;
import de.hybris.training.core.model.CartReminderCronJobModel;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class CartReminderCronJob extends AbstractJobPerformable<CartReminderCronJobModel> {

    private final static Logger LOG = Logger.getLogger(CartReminderCronJob.class.getName());

    private AbandonedCartDao abandonedCartDao;

    public void setAbandonedCartDao(final AbandonedCartDao abandonedCartDao)
    {
        this.abandonedCartDao = abandonedCartDao;
    }


    @Override
    public PerformResult perform(CartReminderCronJobModel cartReminderCronJobModel) {
        LOG.info("Started Cart Reminder cronjob");
        try {
            final int remindDurationHours = cartReminderCronJobModel.getRemindDurationHours();
            Date currentTime = new Date();
            Calendar reminderDateCalendar = Calendar.getInstance();
            reminderDateCalendar.setTime(currentTime);
            reminderDateCalendar.add(Calendar.HOUR_OF_DAY, remindDurationHours);

            List<CartModel> allCarts = abandonedCartDao.getAllCarts();
            for (CartModel cartModel:allCarts) {

                Date cartModifiedTime = cartModel.getModifiedtime();
                Calendar cardModifiedCalendar = Calendar.getInstance();
                cardModifiedCalendar.setTime(cartModifiedTime);
                int comparisonResult = reminderDateCalendar.compareTo(cardModifiedCalendar);

                if (comparisonResult > 0){
                    LOG.info("Cart with code: " + cartModel.getCode() + " is abandoned, sending reminder email");

                    UserModel user = cartModel.getUser();
                    String userName = user.getName();
                    String email = user.getUid();
                    List<AbstractOrderEntryModel> cartItems = cartModel.getEntries();

                    String emailMessage = generateEmail(userName, cartItems);
                    sendEmail(emailMessage, email);
                }

            }
            LOG.info("Finished Cart Reminder cronjob");
            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
        } catch (Exception e){
            LOG.warning(e.getMessage());
            return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
        }
    }

    private String generateEmail(String userName, List<AbstractOrderEntryModel> cartItems) {
        final StringBuilder mailContentBuilder = new StringBuilder(2000);
        mailContentBuilder.append("Hi, ").append(userName).append("\n\n");
        mailContentBuilder.append("You have items in your cart: \n\n");
        for (AbstractOrderEntryModel entry : cartItems){
            mailContentBuilder.append(entry.getProduct().getName()).append(" ").append(entry.getBasePrice()).append(entry.getOrder().getCurrency().getSymbol()).append("\n");
        }
        return mailContentBuilder.toString();
    }

    private void sendEmail(final String message, final String recipient) throws EmailException
    {
        final String subject = "Items in cart";

        final Email email = MailUtils.getPreConfiguredEmail();

        email.addTo(recipient);
        email.setSubject(subject);
        email.setMsg(message);
        LOG.info("Sending abandonedCartEmail to: " + recipient);
        email.send();
    }
}
