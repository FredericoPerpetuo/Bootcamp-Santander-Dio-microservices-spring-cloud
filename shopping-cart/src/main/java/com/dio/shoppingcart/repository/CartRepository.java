package com.dio.shoppingcart.repository;

import com.dio.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;


public interface CartRepository extends CrudRepository<Cart, Integer> {
}
