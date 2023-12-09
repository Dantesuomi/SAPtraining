package de.hybris.training.core.dao;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.ordersplitting.model.StockLevelModel;
import de.hybris.platform.warehousingfacades.product.data.StockLevelData;
import de.hybris.training.core.model.TrainingSkuData;

import java.util.List;

public interface TrainingProductSkuDao {
    List<ProductModel> getProducts();
}
