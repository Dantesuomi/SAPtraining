/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2023. gada 13. dec. 19:03:56                ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.training.core.jalo.CartReminderCronJob CartReminderCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCartReminderCronJob extends CronJob
{
	/** Qualifier of the <code>CartReminderCronJob.remindDurationHours</code> attribute **/
	public static final String REMINDDURATIONHOURS = "remindDurationHours";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(REMINDDURATIONHOURS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CartReminderCronJob.remindDurationHours</code> attribute.
	 * @return the remindDurationHours - Job which sends reminder email to customer about abandoned cart after set amount of time
	 */
	public Integer getRemindDurationHours(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, REMINDDURATIONHOURS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CartReminderCronJob.remindDurationHours</code> attribute.
	 * @return the remindDurationHours - Job which sends reminder email to customer about abandoned cart after set amount of time
	 */
	public Integer getRemindDurationHours()
	{
		return getRemindDurationHours( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CartReminderCronJob.remindDurationHours</code> attribute. 
	 * @return the remindDurationHours - Job which sends reminder email to customer about abandoned cart after set amount of time
	 */
	public int getRemindDurationHoursAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRemindDurationHours( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CartReminderCronJob.remindDurationHours</code> attribute. 
	 * @return the remindDurationHours - Job which sends reminder email to customer about abandoned cart after set amount of time
	 */
	public int getRemindDurationHoursAsPrimitive()
	{
		return getRemindDurationHoursAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CartReminderCronJob.remindDurationHours</code> attribute. 
	 * @param value the remindDurationHours - Job which sends reminder email to customer about abandoned cart after set amount of time
	 */
	public void setRemindDurationHours(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, REMINDDURATIONHOURS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CartReminderCronJob.remindDurationHours</code> attribute. 
	 * @param value the remindDurationHours - Job which sends reminder email to customer about abandoned cart after set amount of time
	 */
	public void setRemindDurationHours(final Integer value)
	{
		setRemindDurationHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CartReminderCronJob.remindDurationHours</code> attribute. 
	 * @param value the remindDurationHours - Job which sends reminder email to customer about abandoned cart after set amount of time
	 */
	public void setRemindDurationHours(final SessionContext ctx, final int value)
	{
		setRemindDurationHours( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CartReminderCronJob.remindDurationHours</code> attribute. 
	 * @param value the remindDurationHours - Job which sends reminder email to customer about abandoned cart after set amount of time
	 */
	public void setRemindDurationHours(final int value)
	{
		setRemindDurationHours( getSession().getSessionContext(), value );
	}
	
}
