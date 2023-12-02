/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.extensiontraining2.controller;

import static org.extensiontraining2.constants.Extensiontraining2Constants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.extensiontraining2.service.Extensiontraining2Service;


@Controller
public class Extensiontraining2HelloController
{
	@Autowired
	private Extensiontraining2Service extensiontraining2Service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", extensiontraining2Service.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
