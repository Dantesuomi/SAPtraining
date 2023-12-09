package de.hybris.training.facades.training.stocksku.impl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.training.core.dao.TrainingProductSkuDao;
import de.hybris.training.core.model.TrainingSkuData;
import de.hybris.training.core.service.TrainingSkuService;
import de.hybris.training.facades.converters.SkuConverter;
import de.hybris.training.facades.training.stocksku.TrainingStockSkuFacade;

import java.util.List;

public class TrainingStockSkuFacadeImpl implements TrainingStockSkuFacade {

    private TrainingSkuService trainingSkuService;

    private SkuConverter skuConverter;

    @Override
    public List<TrainingSkuData> getSkuProductDetails() {
        List<ProductModel> stockLevelData = trainingSkuService.getProductSkuData();
        return Converters.convertAll(stockLevelData, skuConverter);
    }

    public void setTrainingSkuService(final TrainingSkuService trainingSkuService)
    {
        this.trainingSkuService = trainingSkuService;
    }

    public void setSkuConverter(final SkuConverter skuConverter)
    {
        this.skuConverter = skuConverter;
    }
}
