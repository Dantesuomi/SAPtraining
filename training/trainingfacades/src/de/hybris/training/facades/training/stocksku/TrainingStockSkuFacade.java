package de.hybris.training.facades.training.stocksku;

import de.hybris.platform.warehousingfacades.product.data.StockLevelData;
import de.hybris.training.core.model.TrainingSkuData;

import java.util.List;

public interface TrainingStockSkuFacade {


    List<StockLevelData> getSkuProductDetails();
}
