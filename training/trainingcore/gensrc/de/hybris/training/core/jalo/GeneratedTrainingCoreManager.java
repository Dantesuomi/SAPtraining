/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2023. gada 3. dec. 22:31:52                 ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.ApparelProduct;
import de.hybris.training.core.jalo.ApparelSizeVariantProduct;
import de.hybris.training.core.jalo.ApparelStyleVariantProduct;
import de.hybris.training.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.training.core.jalo.Intern;
import de.hybris.training.core.jalo.UnapprovedProductListCronJob;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>TrainingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("nickname", AttributeMode.INITIAL);
		tmp.put("marketingEmailFlag", AttributeMode.INITIAL);
		tmp.put("panNumber", AttributeMode.INITIAL);
		tmp.put("loyaltyCardNumber", AttributeMode.INITIAL);
		tmp.put("secondaryEmail", AttributeMode.INITIAL);
		tmp.put("vehicleNumber", AttributeMode.INITIAL);
		tmp.put("vehicleType", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Intern createIntern(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.INTERN );
			return (Intern)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Intern : "+e.getMessage(), 0 );
		}
	}
	
	public Intern createIntern(final Map attributeValues)
	{
		return createIntern( getSession().getSessionContext(), attributeValues );
	}
	
	public UnapprovedProductListCronJob createUnapprovedProductListCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.UNAPPROVEDPRODUCTLISTCRONJOB );
			return (UnapprovedProductListCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating UnapprovedProductListCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public UnapprovedProductListCronJob createUnapprovedProductListCronJob(final Map attributeValues)
	{
		return createUnapprovedProductListCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return TrainingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.loyaltyCardNumber</code> attribute.
	 * @return the loyaltyCardNumber - loyalty card number attribute
	 */
	public String getLoyaltyCardNumber(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.LOYALTYCARDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.loyaltyCardNumber</code> attribute.
	 * @return the loyaltyCardNumber - loyalty card number attribute
	 */
	public String getLoyaltyCardNumber(final Customer item)
	{
		return getLoyaltyCardNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.loyaltyCardNumber</code> attribute. 
	 * @param value the loyaltyCardNumber - loyalty card number attribute
	 */
	public void setLoyaltyCardNumber(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.LOYALTYCARDNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.loyaltyCardNumber</code> attribute. 
	 * @param value the loyaltyCardNumber - loyalty card number attribute
	 */
	public void setLoyaltyCardNumber(final Customer item, final String value)
	{
		setLoyaltyCardNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.marketingEmailFlag</code> attribute.
	 * @return the marketingEmailFlag - marketing email flag attribute
	 */
	public Boolean isMarketingEmailFlag(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.MARKETINGEMAILFLAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.marketingEmailFlag</code> attribute.
	 * @return the marketingEmailFlag - marketing email flag attribute
	 */
	public Boolean isMarketingEmailFlag(final Customer item)
	{
		return isMarketingEmailFlag( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.marketingEmailFlag</code> attribute. 
	 * @return the marketingEmailFlag - marketing email flag attribute
	 */
	public boolean isMarketingEmailFlagAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isMarketingEmailFlag( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.marketingEmailFlag</code> attribute. 
	 * @return the marketingEmailFlag - marketing email flag attribute
	 */
	public boolean isMarketingEmailFlagAsPrimitive(final Customer item)
	{
		return isMarketingEmailFlagAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.marketingEmailFlag</code> attribute. 
	 * @param value the marketingEmailFlag - marketing email flag attribute
	 */
	public void setMarketingEmailFlag(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.MARKETINGEMAILFLAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.marketingEmailFlag</code> attribute. 
	 * @param value the marketingEmailFlag - marketing email flag attribute
	 */
	public void setMarketingEmailFlag(final Customer item, final Boolean value)
	{
		setMarketingEmailFlag( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.marketingEmailFlag</code> attribute. 
	 * @param value the marketingEmailFlag - marketing email flag attribute
	 */
	public void setMarketingEmailFlag(final SessionContext ctx, final Customer item, final boolean value)
	{
		setMarketingEmailFlag( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.marketingEmailFlag</code> attribute. 
	 * @param value the marketingEmailFlag - marketing email flag attribute
	 */
	public void setMarketingEmailFlag(final Customer item, final boolean value)
	{
		setMarketingEmailFlag( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.nickname</code> attribute.
	 * @return the nickname - nickname attribute
	 */
	public String getNickname(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.NICKNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.nickname</code> attribute.
	 * @return the nickname - nickname attribute
	 */
	public String getNickname(final Customer item)
	{
		return getNickname( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.nickname</code> attribute. 
	 * @param value the nickname - nickname attribute
	 */
	public void setNickname(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.NICKNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.nickname</code> attribute. 
	 * @param value the nickname - nickname attribute
	 */
	public void setNickname(final Customer item, final String value)
	{
		setNickname( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.panNumber</code> attribute.
	 * @return the panNumber - pan number attribute
	 */
	public String getPanNumber(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.PANNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.panNumber</code> attribute.
	 * @return the panNumber - pan number attribute
	 */
	public String getPanNumber(final Customer item)
	{
		return getPanNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.panNumber</code> attribute. 
	 * @param value the panNumber - pan number attribute
	 */
	public void setPanNumber(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.PANNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.panNumber</code> attribute. 
	 * @param value the panNumber - pan number attribute
	 */
	public void setPanNumber(final Customer item, final String value)
	{
		setPanNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.secondaryEmail</code> attribute.
	 * @return the secondaryEmail - secondary email attribute
	 */
	public String getSecondaryEmail(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.SECONDARYEMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.secondaryEmail</code> attribute.
	 * @return the secondaryEmail - secondary email attribute
	 */
	public String getSecondaryEmail(final Customer item)
	{
		return getSecondaryEmail( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.secondaryEmail</code> attribute. 
	 * @param value the secondaryEmail - secondary email attribute
	 */
	public void setSecondaryEmail(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.SECONDARYEMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.secondaryEmail</code> attribute. 
	 * @param value the secondaryEmail - secondary email attribute
	 */
	public void setSecondaryEmail(final Customer item, final String value)
	{
		setSecondaryEmail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.vehicleNumber</code> attribute.
	 * @return the vehicleNumber - vehicle number attribute
	 */
	public String getVehicleNumber(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.VEHICLENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.vehicleNumber</code> attribute.
	 * @return the vehicleNumber - vehicle number attribute
	 */
	public String getVehicleNumber(final Customer item)
	{
		return getVehicleNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.vehicleNumber</code> attribute. 
	 * @param value the vehicleNumber - vehicle number attribute
	 */
	public void setVehicleNumber(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.VEHICLENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.vehicleNumber</code> attribute. 
	 * @param value the vehicleNumber - vehicle number attribute
	 */
	public void setVehicleNumber(final Customer item, final String value)
	{
		setVehicleNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.vehicleType</code> attribute.
	 * @return the vehicleType - vehicle type attribute
	 */
	public EnumerationValue getVehicleType(final SessionContext ctx, final Customer item)
	{
		return (EnumerationValue)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.VEHICLETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.vehicleType</code> attribute.
	 * @return the vehicleType - vehicle type attribute
	 */
	public EnumerationValue getVehicleType(final Customer item)
	{
		return getVehicleType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.vehicleType</code> attribute. 
	 * @param value the vehicleType - vehicle type attribute
	 */
	public void setVehicleType(final SessionContext ctx, final Customer item, final EnumerationValue value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.VEHICLETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.vehicleType</code> attribute. 
	 * @param value the vehicleType - vehicle type attribute
	 */
	public void setVehicleType(final Customer item, final EnumerationValue value)
	{
		setVehicleType( getSession().getSessionContext(), item, value );
	}
	
}
