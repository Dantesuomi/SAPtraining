/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2023. gada 12. dec. 13:55:04                ---
 * ----------------------------------------------------------------
 */
package org.extensiontraining2.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import java.util.HashMap;
import java.util.Map;
import org.extensiontraining2.constants.Extensiontraining2Constants;

/**
 * Generated class for type <code>Extensiontraining2Manager</code>.
 */
@SuppressWarnings({"unused","cast"})
@SLDSafe
public class Extensiontraining2Manager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
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
	
	public static final Extensiontraining2Manager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Extensiontraining2Manager) em.getExtension(Extensiontraining2Constants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return Extensiontraining2Constants.EXTENSIONNAME;
	}
	
}
