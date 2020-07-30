package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTest {
    @Test
    public void should_return_points_when_calcultePoints_given_a_user_and_goods() {
        //given
        Goods goodsA = new Goods("LANURY", 100);
        Goods goodsB = new Goods("LANURY", 10);
        User user = new User();

        //when
        user.addGoods(goodsA);
        user.addGoods(goodsB);
        int points = user.calcultePoints();

        //then
        Assert.assertEquals(110,points);

    }

    @Test
    public void should_return_points_is_100_when_calcultePoints_given_user_buy_apple_watermelon_laundry_and_promotion_is_apple_and_watermelon() {
        //given
        Goods goodsApple = new Goods("APPLE",10);
        Goods goodsWaterMelon = new Goods("WATERMELON",30);
        Goods goodsLaundry = new Goods("LAUNDRY",20);
        User user = new User();


        //when
        user.addGoods(goodsApple);
        user.addGoods(goodsWaterMelon);
        user.addGoods(goodsLaundry);
        int points = user.calcultePoints();

        //then
        Assert.assertEquals(100,points);


    }

    @Test
    public void should_return_points_is_1067_when_calcultePoints_given_user_buy_Refrigerator_and_price_is_2350() {
        //given
        Goods goodsRefirgerator = new Goods("REFRIGERATOR",2350);
        User user = new User();

        //when
        user.addGoods(goodsRefirgerator);
        int points = user.calcultePoints();

        //then
        Assert.assertEquals(1067,points);

    }

    @Test
    public void should_return_points_is_3000_when_calcultePoints_given_user_buy_television_and_price_is_2000_and_television_is_promotion() {
        //given
        Goods goodsTelevision = new Goods("TELEVISON",2000);
        User user = new User();

        //when
        user.addGoods(goodsTelevision);
        int points = user.calcultePoints();

        //then
        Assert.assertEquals(3000,points);

    }

}
