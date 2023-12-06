package de.hybris.training.storefront.controllers;

import de.hybris.platform.warehousingfacades.product.data.StockLevelData;
import de.hybris.training.facades.training.stocksku.TrainingStockSkuFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TraningStockController  {

    @Resource
    private TrainingStockSkuFacade trainingStockSkuFacade;

    @RequestMapping(value = "/lowStockSKU", method = RequestMethod.GET)
    public List<StockLevelData> getLowStockSku(){
        List<StockLevelData> stockLevelData = trainingStockSkuFacade.getSkuProductDetails();
        return stockLevelData;
    }
}
