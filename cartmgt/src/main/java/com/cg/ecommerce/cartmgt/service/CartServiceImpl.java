package com.cg.ecommerce.cartmgt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ecommerce.cartmgt.dao.ICartDao;
import com.cg.ecommerce.cartmgt.entities.CartItem;

import java.util.List;

@Service
public class CartServiceImpl implements ICartService{

    private ICartDao dao;

    public ICartDao getDao() {
        return dao;
    }

    @Autowired
    public void setDao(ICartDao dao) {
        this.dao = dao;
    }

    @Override
    public List<CartItem> fetchCartItems(int userId) {
        List<CartItem> items = dao.fetchCartItems(userId);
        return items;
    }

    @Override
    public CartItem save(CartItem item) {
        return dao.save(item);
    }
}
