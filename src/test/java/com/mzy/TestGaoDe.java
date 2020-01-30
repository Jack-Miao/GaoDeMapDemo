package com.mzy;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author MiaoZhuoYang
 * @Date 2020-01-2020/1/30 16:35
 */
@SpringBootTest
public class TestGaoDe {


    @Test
    public void test1(){

        String city = GaoDeMapUtils.getLonLarByAddress("永济市");

        System.out.println(city);
    }

    @Test
    public void test2(){

        String addressByLonLat = GaoDeMapUtils.getAddressByLonLat(110.447549, 34.867050);

        System.out.println(addressByLonLat);
    }
}
