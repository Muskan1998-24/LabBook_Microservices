package com.cg.ecommerce.cartmgt.dao;

import org.springframework.stereotype.Repository;

import com.cg.ecommerce.cartmgt.entities.CartItem;

import java.util.*;

@Repository
public class CartDaoImpl implements ICartDao{
    private Map<Integer,CartItem> store = new HashMap<>();

    @Override
    public List<CartItem> fetchCartItems(int userId) {
        Collection<CartItem> items = store.values();
        List<CartItem> desired = new ArrayList<>();
        for(CartItem item : items){
            if(item.getUserId()==userId){
                desired.add(item);
            }
        }
        return desired;
    }

    @Override
    public CartItem save(CartItem item) {
        int id = generateId();
        item.setId(id);
        store.put(item.getId(),item);
        return item;
    }

    private int generatedId;
    private int generateId(){
        return ++generatedId;
    }
}
