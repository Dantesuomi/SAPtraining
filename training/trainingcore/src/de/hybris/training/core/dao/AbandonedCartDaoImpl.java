package de.hybris.training.core.dao;

import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

public class AbandonedCartDaoImpl implements AbandonedCartDao{

    private FlexibleSearchService flexibleSearchService;

    public void setFlexibleSearchService ( final FlexibleSearchService flexibleSearchService)
    {
        this.flexibleSearchService = flexibleSearchService;
    }
    @Override
    public List<CartModel> getAllCarts() {
        String productQuery = "SELECT {pk} FROM {Cart}";
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(productQuery);
        return flexibleSearchService.<CartModel>search(flexibleSearchQuery).getResult();
    }
}
