package de.hybris.training.storefront.controllers;

import de.hybris.platform.catalog.impl.DefaultCatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.stock.StockService;
import de.hybris.platform.util.mail.MailUtils;
import de.hybris.training.core.jalo.BackInStockSubscription;
import de.hybris.training.core.job.CartReminderCronJob;
import de.hybris.training.core.model.TrainingSkuData;
import de.hybris.training.facades.training.stocksku.TrainingStockSkuFacade;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class BackInStockController {

    private final static Logger LOG = Logger.getLogger(BackInStockController.class.getName());

    //TODO Add to beans
    @Resource
    private ProductService productService;
    @Resource
    private DefaultCatalogVersionService defaultCatalogVersionService;
    @Resource
    private StockService stockService;
    @Resource
    private BackInStockSubscription backInStockSubscription;
    @Resource
    private UserService userService;


    private final static int OUT_OF_STOCK = 0;

    @RequestMapping(value = "/customer/{customerID}/{productID}", method = {RequestMethod.GET, RequestMethod.PUT})
    public String backInStockSubscription( @PathVariable String customerID,
                                           @PathVariable String productID){

        CatalogVersionModel catalogVersionModel = defaultCatalogVersionService.getCatalogVersion("apparelProductCatalog","Online");
        ProductModel product = productService.getProductForCode(catalogVersionModel, productID);
        if (stockService.getTotalStockLevelAmount(product) == OUT_OF_STOCK){

            UserModel customer = userService.getUserForUID(customerID);

            backInStockSubscription.setCode(productID);
            backInStockSubscription.setCustomerEmail(customerID);
            backInStockSubscription.setCustomerName(customer.getName());

            //TODO Add back in stock logic
//            String emailMessage = generateEmail(userName, cartItems);
//            sendEmail(emailMessage, email);
            return "Subscribed  to back in stock notification";
        }
        return "Not subscribed to nofitication, product is in stock";
    }

    private String generateEmail(String userName, ProductModel product) {
        final StringBuilder mailContentBuilder = new StringBuilder(2000);
        mailContentBuilder.append("Hi, ").append(userName).append("\n\n");
        mailContentBuilder.append("Item is back in stock").append("\n\n");
        mailContentBuilder.append(product.getName()).append(" ");
        //mailContentBuilder.append(entry.getProduct().getName()).append(" ").append(entry.getBasePrice()).append(entry.getOrder().getCurrency().getSymbol()).append("\n");
        return mailContentBuilder.toString();
    }

    private void sendEmail(final String message, final String recipient) throws EmailException
    {
        final String subject = "Item back in stock";

        final Email email = MailUtils.getPreConfiguredEmail();
        try {
            email.addTo(recipient);
            email.setSubject(subject);
            email.setMsg(message);
            LOG.info("Sending Back In Stock Email to: " + recipient);
            email.send();
            LOG.info("Back In Stock Email successfully sent to: " + recipient);
        }catch (EmailException emailException){
            emailException.printStackTrace();
            LOG.warning("Error sending Back In Stock Email to: " + recipient);
        }

    }
}




