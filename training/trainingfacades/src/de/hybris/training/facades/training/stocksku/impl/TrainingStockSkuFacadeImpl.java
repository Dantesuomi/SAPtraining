package de.hybris.training.facades.training.stocksku.impl;

import de.hybris.platform.warehousingfacades.product.data.StockLevelData;
import de.hybris.training.core.dao.TrainingProductSkuDao;
import de.hybris.training.core.model.TrainingSkuData;
import de.hybris.training.facades.training.stocksku.TrainingStockSkuFacade;

import java.util.List;

public class TrainingStockSkuFacadeImpl implements TrainingStockSkuFacade {

    private TrainingProductSkuDao trainingProductSkuDao;

    @Override
    public List<StockLevelData> getSkuProductDetails() {
        List<StockLevelData> stockLevelData = trainingProductSkuDao.getStockLevelData();
        return stockLevelData;
    }

    public void setTrainingProductSkuDao(final TrainingProductSkuDao trainingProductSkuDao)
    {
        this.trainingProductSkuDao = trainingProductSkuDao;
    }
}
