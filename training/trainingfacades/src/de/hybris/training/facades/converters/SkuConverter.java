package de.hybris.training.facades.converters;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.ordersplitting.model.StockLevelModel;
import de.hybris.platform.ordersplitting.model.WarehouseModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.TrainingSkuData;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public class SkuConverter implements Converter<ProductModel, TrainingSkuData>{
    @Override
    public TrainingSkuData convert(final ProductModel productModel) throws ConversionException {
        final TrainingSkuData data = new TrainingSkuData();
        return convert(productModel, data);
    }

    @Override
    public TrainingSkuData convert(final ProductModel productModel, final TrainingSkuData trainingSkuData) throws ConversionException {
        trainingSkuData.setDescription(productModel.getDescription());
        trainingSkuData.setName(productModel.getName() + " (" + productModel.getCode() + ")");
        trainingSkuData.setStatusSKU(productModel.getApprovalStatus());
        List<WarehouseModel> warehouseList = new ArrayList<>();
        for (StockLevelModel stockLevelModel: productModel.getStockLevels()) {
            warehouseList.add(stockLevelModel.getWarehouse());
        }
        trainingSkuData.setWarehouseList(warehouseList);
        return trainingSkuData;
    }
}
