package de.hybris.training.core.dao;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.ordersplitting.jalo.StockLevel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.warehousingfacades.product.data.StockLevelData;
import de.hybris.training.core.model.TrainingSkuData;

import java.util.List;
//public class TrainingProductSkuDaoImpl extends DefaultGenericDao implements TrainingProductSkuDao
public class TrainingProductSkuDaoImpl implements TrainingProductSkuDao{

    //remove later
//    private ProductModel productModel;
//    private StockLevel stockLevel;
//
//    private TrainingSkuData trainingSkuData;

    private FlexibleSearchService flexibleSearchService;

//    public TrainingProductSkuDaoImpl(String typecode) {
//        super(typecode);
//    }

    //https://apparel-uk.local:9002/trainingstorefront/lowStockSKU
    @Override
    public List<StockLevelData> getStockLevelData() {

       // productModel.getStockLevels();
        //stockLevel.getAvailableAsPrimitive();
        String stockLevelQuery = "SELECT {pk} FROM {StockLevel} WHERE {Available} < 10";
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(stockLevelQuery);
        flexibleSearchQuery.setCount(10); // testing
        return flexibleSearchService.<StockLevelData>search(flexibleSearchQuery).getResult();
    }

    public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
    {
        this.flexibleSearchService = flexibleSearchService;
    }
}
