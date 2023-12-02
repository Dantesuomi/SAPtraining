/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.extensiontraining2.service;

public interface Extensiontraining2Service
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
