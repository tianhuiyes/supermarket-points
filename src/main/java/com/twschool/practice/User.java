package com.twschool.practice;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Goods> goodsList = new ArrayList<>();
    private int points = 0;

    public void addGoods(Goods goods) {
        goodsList.add(goods);
    }


    public int calcultePoints() {
        goodsList.forEach(goods -> {
            if(goods.isPromotion()){
                points += goods.getPrice() * 2;
            }else{
                points += goods.getPrice();
            }
        });
        return points;
    }
}
