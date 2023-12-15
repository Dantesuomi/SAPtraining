package de.hybris.training.storefront.controllers.cms;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController;
import de.hybris.training.core.model.CustomOffersComponentModel;
import de.hybris.training.storefront.controllers.ControllerConstants;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller("CustomOffersComponentController")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.CustomOffersComponent)
public class CustomOffersComponentController extends AbstractCMSComponentController<CustomOffersComponentModel>
{
    @Override
    protected void fillModel(final HttpServletRequest request, final Model model, final CustomOffersComponentModel component)
    {
        model.addAttribute("offerImageLinks", component.getOfferImageLink());

        model.addAttribute("offerImage", component.getOfferImage());

        model.addAttribute("headerText", component.getHeadrerText());

        model.addAttribute("footerText", component.getFooterText());
    }

    @Override
    protected String getView(final CustomOffersComponentModel component)
    {
        return ControllerConstants.Views.Cms.ComponentPrefix + StringUtils.lowerCase(getTypeCode(component));

    }
}
