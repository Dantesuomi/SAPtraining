package de.hybris.training.facades.training.stocksku;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.training.core.model.TrainingSkuData;

import java.util.List;

public interface TrainingStockSkuFacade {


    List<TrainingSkuData> getSkuProductDetails();
}
