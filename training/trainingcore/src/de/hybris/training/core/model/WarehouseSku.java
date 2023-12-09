package de.hybris.training.core.model;

public class WarehouseSku {

    private String warehouseName;
    private int stockLevel;

    public WarehouseSku() {
    }

    public WarehouseSku(String warehouseName, int stockLevel) {
        this.warehouseName = warehouseName;
        this.stockLevel = stockLevel;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

}
