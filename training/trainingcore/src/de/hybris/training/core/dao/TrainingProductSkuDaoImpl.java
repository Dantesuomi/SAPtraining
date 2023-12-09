package de.hybris.training.core.dao;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.ordersplitting.model.StockLevelModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

public class TrainingProductSkuDaoImpl implements TrainingProductSkuDao{

    private FlexibleSearchService flexibleSearchService;

    public void setFlexibleSearchService ( final FlexibleSearchService flexibleSearchService)
    {
        this.flexibleSearchService = flexibleSearchService;
    }

    @Override
    public List<ProductModel> getProducts() {

        String productQuery = "SELECT {p.PK} FROM {Product AS p} WHERE" +
                " EXISTS ({{SELECT * FROM {StockLevel as s} WHERE" +
                " {s.productCode} = {p.code} AND {s.available} <= '5' }})";
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(productQuery);
        return flexibleSearchService.<ProductModel>search(flexibleSearchQuery).getResult();
    }

}
