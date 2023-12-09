package de.hybris.training.core.model;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.ordersplitting.model.WarehouseModel;

import java.util.List;

public class TrainingSkuData {

    private String name;
    private String description;
    private List<WarehouseSku> warehouseList;
    //enum
    private ArticleApprovalStatus statusSKU;

    public TrainingSkuData(String name, String description, List<WarehouseSku> warehouseList, ArticleApprovalStatus statusSKU) {
        this.name = name;
        this.description = description;
        this.warehouseList = warehouseList;
        this.statusSKU = statusSKU;
    }

    public TrainingSkuData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<WarehouseSku> getWarehouseList() {
        return warehouseList;
    }

    public void setWarehouseList(List<WarehouseSku> warehouseList) {
        this.warehouseList = warehouseList;
    }

    public ArticleApprovalStatus getStatusSKU() {
        return statusSKU;
    }

    public void setStatusSKU(ArticleApprovalStatus statusSKU) {
        this.statusSKU = statusSKU;
    }


}
