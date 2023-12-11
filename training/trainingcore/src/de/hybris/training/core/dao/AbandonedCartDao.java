package de.hybris.training.core.dao;

import de.hybris.platform.core.model.order.CartModel;

import java.util.List;

public interface AbandonedCartDao {

    List<CartModel> getAllCarts();
}
