package de.hybris.training.core.attributehandlers;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import de.hybris.training.core.model.InternModel;

import java.util.Date;

public class TrainingMonthAtOrganizationHandler implements DynamicAttributeHandler<Integer, InternModel> {
    @Override
    public Integer get(final InternModel model) {
        Date creationTime = model.getCreationtime();
        Date currentTime = new Date();

        long diffInMilliseconds = Math.abs(currentTime.getTime() - creationTime.getTime());
        long diffInMonths = diffInMilliseconds / (30L * 24L * 60L * 60L * 1000L);

        return (int) diffInMonths;
    }

    @Override
    public void set(InternModel model, Integer integer) {
        throw new UnsupportedOperationException("Setting the value is not supported for this attribute");
    }
}
