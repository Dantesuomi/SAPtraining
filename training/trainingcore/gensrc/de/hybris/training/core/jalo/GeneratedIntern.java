/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2023. gada 2. dec. 17:47:43                 ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.Employee Intern}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedIntern extends Employee
{
	/** Qualifier of the <code>Intern.monthAtOrganization</code> attribute **/
	public static final String MONTHATORGANIZATION = "monthAtOrganization";
	/** Qualifier of the <code>Intern.collegeName</code> attribute **/
	public static final String COLLEGENAME = "collegeName";
	/** Qualifier of the <code>Intern.projectName</code> attribute **/
	public static final String PROJECTNAME = "projectName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Employee.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MONTHATORGANIZATION, AttributeMode.INITIAL);
		tmp.put(COLLEGENAME, AttributeMode.INITIAL);
		tmp.put(PROJECTNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Intern.collegeName</code> attribute.
	 * @return the collegeName
	 */
	public String getCollegeName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COLLEGENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Intern.collegeName</code> attribute.
	 * @return the collegeName
	 */
	public String getCollegeName()
	{
		return getCollegeName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Intern.collegeName</code> attribute. 
	 * @param value the collegeName
	 */
	public void setCollegeName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COLLEGENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Intern.collegeName</code> attribute. 
	 * @param value the collegeName
	 */
	public void setCollegeName(final String value)
	{
		setCollegeName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Intern.monthAtOrganization</code> attribute.
	 * @return the monthAtOrganization
	 */
	public Integer getMonthAtOrganization(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MONTHATORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Intern.monthAtOrganization</code> attribute.
	 * @return the monthAtOrganization
	 */
	public Integer getMonthAtOrganization()
	{
		return getMonthAtOrganization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Intern.monthAtOrganization</code> attribute. 
	 * @return the monthAtOrganization
	 */
	public int getMonthAtOrganizationAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMonthAtOrganization( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Intern.monthAtOrganization</code> attribute. 
	 * @return the monthAtOrganization
	 */
	public int getMonthAtOrganizationAsPrimitive()
	{
		return getMonthAtOrganizationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Intern.monthAtOrganization</code> attribute. 
	 * @param value the monthAtOrganization
	 */
	public void setMonthAtOrganization(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MONTHATORGANIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Intern.monthAtOrganization</code> attribute. 
	 * @param value the monthAtOrganization
	 */
	public void setMonthAtOrganization(final Integer value)
	{
		setMonthAtOrganization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Intern.monthAtOrganization</code> attribute. 
	 * @param value the monthAtOrganization
	 */
	public void setMonthAtOrganization(final SessionContext ctx, final int value)
	{
		setMonthAtOrganization( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Intern.monthAtOrganization</code> attribute. 
	 * @param value the monthAtOrganization
	 */
	public void setMonthAtOrganization(final int value)
	{
		setMonthAtOrganization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Intern.projectName</code> attribute.
	 * @return the projectName
	 */
	public String getProjectName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PROJECTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Intern.projectName</code> attribute.
	 * @return the projectName
	 */
	public String getProjectName()
	{
		return getProjectName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Intern.projectName</code> attribute. 
	 * @param value the projectName
	 */
	public void setProjectName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PROJECTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Intern.projectName</code> attribute. 
	 * @param value the projectName
	 */
	public void setProjectName(final String value)
	{
		setProjectName( getSession().getSessionContext(), value );
	}
	
}
