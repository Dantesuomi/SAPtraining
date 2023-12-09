package de.hybris.training.core.service;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.ordersplitting.model.StockLevelModel;
import de.hybris.training.core.dao.TrainingProductSkuDao;
import de.hybris.training.core.model.TrainingSkuData;

import java.util.List;

public class TrainingSkuServiceImpl implements TrainingSkuService{

    private TrainingProductSkuDao trainingProductSkuDao;

    public void setTrainingProductSkuDao(final TrainingProductSkuDao trainingProductSkuDao)
    {
        this.trainingProductSkuDao = trainingProductSkuDao;
    }
    @Override
    public List<ProductModel> getProductSkuData() {
        return trainingProductSkuDao.getProducts();
    }
}
