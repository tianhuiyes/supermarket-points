package com.twschool.practice;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Goods> goodsList = new ArrayList<>();
    private int points;

    public void addGoods(Goods goods) {
        goodsList.add(goods);
    }


    public int calcultePoints() {
        points = goodsList.stream().mapToInt(goods -> goods.getPrice()).sum();
        return points;
    }
}
