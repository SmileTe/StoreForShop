package com.skypro.spring.hw_spring.reporitory;

import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class CartRepository {
    private final List<Integer> idList = new ArrayList<>();

    public void addToCart(List<Integer> ids){
        this.idList.addAll(ids);
    }
    public List<Integer> getCart(){
        return this.idList;
    }
}
