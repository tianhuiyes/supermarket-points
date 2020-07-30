package com.twschool.practice;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Goods> goodsList = new ArrayList<>();
    private int points = 0;


    public void addGoods(Goods goods) {
        goodsList.add(goods);
    }


    public int calcultePoints() {
        goodsList.forEach(goods -> {
            points = calculteCurrentGoodsPoints(goods);
        });
        return points;
    }

    private int calculteCurrentGoodsPoints(Goods goods) {
        if(goods.priceOverOneThouSand()){
            return points += goods.getPriceOverOneThouSandPoints();
        }
        if(goods.isPromotion()){
            points += goods.getPromotionPoints();
        }else{
            points += goods.getPrice();
        }
        return points;
    }


}
