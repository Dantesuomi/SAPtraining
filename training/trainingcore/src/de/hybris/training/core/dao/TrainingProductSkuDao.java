package de.hybris.training.core.dao;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

public interface TrainingProductSkuDao {
    List<ProductModel> getProducts();
}
