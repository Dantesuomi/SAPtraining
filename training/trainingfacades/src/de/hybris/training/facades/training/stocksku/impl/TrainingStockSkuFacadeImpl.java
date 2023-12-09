package de.hybris.training.facades.training.stocksku.impl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.training.core.dao.TrainingProductSkuDao;
import de.hybris.training.core.model.TrainingSkuData;
import de.hybris.training.facades.converters.SkuConverter;
import de.hybris.training.facades.training.stocksku.TrainingStockSkuFacade;

import java.util.List;

public class TrainingStockSkuFacadeImpl implements TrainingStockSkuFacade {

    private TrainingProductSkuDao trainingProductSkuDao;

    private SkuConverter skuConverter;

    @Override
    public List<TrainingSkuData> getSkuProductDetails() {
        List<ProductModel> stockLevelData = trainingProductSkuDao.getProducts();
        return Converters.convertAll(stockLevelData, skuConverter);
    }

    public void setTrainingProductSkuDao(final TrainingProductSkuDao trainingProductSkuDao)
    {
        this.trainingProductSkuDao = trainingProductSkuDao;
    }

    public void setSkuConverter(final SkuConverter skuConverter)
    {
        this.skuConverter = skuConverter;
    }
}
