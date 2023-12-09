package de.hybris.training.core.service;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.ordersplitting.model.StockLevelModel;
import de.hybris.training.core.model.TrainingSkuData;

import java.util.List;

public interface TrainingSkuService {

    List<ProductModel> getProductSkuData();
}
