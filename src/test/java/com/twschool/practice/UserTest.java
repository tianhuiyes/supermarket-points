package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTest {
    @Test
    public void should_return_points_when_calcultePoints_given_a_user_and_goods() {
        //given
        Goods goodsA = new Goods(100);
        Goods goodsB = new Goods(10);
        User user = new User();

        //when
        user.addGoods(goodsA);
        user.addGoods(goodsB);
        int points = user.calcultePoints();

        //then
        Assert.assertEquals(110,points);

    }
}
