package com.twschool.practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Goods {

    private String goodsType;
    private int price;
    private List<Promotion> PromotionGoods = Arrays.asList(Promotion.APPLE, Promotion.WATERMELON, Promotion.BEEF,Promotion.TELEVISON);

    public Goods(String goodsType, int price) {
        this.goodsType = goodsType;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getPromotionPoints() {
        return price * 2;
    }

    public int getPriceOverOneThouSandPoints() {
        return 1000 + (price - 1000) / 20;
    }

    public int getPromotionAndPriceOverOneThousandPoints() {
        return 1000 * 2 + (price - 1000);
    }

    public boolean isPromotion() {
        for (Promotion promotion : PromotionGoods) {
            if (promotion.toString().equals(goodsType)) {
                return true;
            }
        }
        return false;
    }

    public boolean priceOverOneThouSand() {
        if(price > 1000){
            return true;
        }
        return false;
    }



}
