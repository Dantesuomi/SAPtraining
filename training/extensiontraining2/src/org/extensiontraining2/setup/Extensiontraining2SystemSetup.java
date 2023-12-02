/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.extensiontraining2.setup;

import static org.extensiontraining2.constants.Extensiontraining2Constants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import org.extensiontraining2.constants.Extensiontraining2Constants;
import org.extensiontraining2.service.Extensiontraining2Service;


@SystemSetup(extension = Extensiontraining2Constants.EXTENSIONNAME)
public class Extensiontraining2SystemSetup
{
	private final Extensiontraining2Service extensiontraining2Service;

	public Extensiontraining2SystemSetup(final Extensiontraining2Service extensiontraining2Service)
	{
		this.extensiontraining2Service = extensiontraining2Service;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		extensiontraining2Service.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return Extensiontraining2SystemSetup.class.getResourceAsStream("/extensiontraining2/sap-hybris-platform.png");
	}
}
