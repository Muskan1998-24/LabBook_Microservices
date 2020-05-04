package com.cg.ecommerce.cartmgt.dao;

import java.util.List;

import com.cg.ecommerce.cartmgt.entities.CartItem;
public interface ICartDao 
{
    List<CartItem> fetchCartItems(int userId);

    CartItem save(CartItem item);
}
