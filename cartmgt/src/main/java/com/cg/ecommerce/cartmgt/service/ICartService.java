package com.cg.ecommerce.cartmgt.service;

import java.util.List;

import com.cg.ecommerce.cartmgt.entities.CartItem;

public interface ICartService {
    List<CartItem> fetchCartItems(int userId);

    CartItem save(CartItem item);
}
