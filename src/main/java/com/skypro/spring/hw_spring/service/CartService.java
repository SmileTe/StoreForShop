package com.skypro.spring.hw_spring.service;

import com.skypro.spring.hw_spring.reporitory.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void addToCart(List<Integer> ids){
       this.cartRepository.addToCart(ids);
   }
   public List<Integer> getCart(){
       return this.cartRepository.getCart();
    }
}
