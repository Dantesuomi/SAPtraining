package de.hybris.training.facades.converters;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.ordersplitting.model.StockLevelModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.stock.StockService;
import de.hybris.training.core.model.TrainingSkuData;
import de.hybris.training.core.model.WarehouseSku;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SkuConverter implements Converter<ProductModel, TrainingSkuData>{

    private StockService stockService;

    @Override
    public TrainingSkuData convert(final ProductModel productModel) throws ConversionException {
        final TrainingSkuData data = new TrainingSkuData();
        return convert(productModel, data);
    }

    @Override
    public TrainingSkuData convert(final ProductModel productModel, final TrainingSkuData trainingSkuData) throws ConversionException {
        trainingSkuData.setDescription(productModel.getDescription());
        trainingSkuData.setName(productModel.getName());
        trainingSkuData.setStatusSKU(productModel.getApprovalStatus());
        List<WarehouseSku> warehouseList = new ArrayList<>();

        Collection<StockLevelModel> stockLevels = stockService.getAllStockLevels(productModel);
        for (StockLevelModel stockLevel: stockLevels) {
            if (stockLevel.getAvailable() <= 5){
                WarehouseSku warehouseSku = new WarehouseSku();
                warehouseSku.setStockLevel(stockLevel.getAvailable());
                warehouseSku.setWarehouseName(stockLevel.getWarehouse().getName());
                warehouseList.add(warehouseSku);
            }
        }
        trainingSkuData.setWarehouseList(warehouseList);
        return trainingSkuData;
    }

    public void setStockService(final StockService stockService)
    {
        this.stockService = stockService;
    }

}
