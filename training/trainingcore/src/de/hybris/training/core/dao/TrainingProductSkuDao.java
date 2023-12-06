package de.hybris.training.core.dao;

import de.hybris.platform.warehousingfacades.product.data.StockLevelData;

import java.util.List;

public interface TrainingProductSkuDao {
    List<StockLevelData> getStockLevelData();
}
