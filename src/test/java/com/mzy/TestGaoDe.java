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
        //永济 110.447549,34.867050
        //焦作 113.241823,35.215892
        String city = GaoDeMapUtils.getLonLarByAddress("郑州市");

        System.out.println(city);
    }

    @Test
    public void test2(){

        String addressByLonLat = GaoDeMapUtils.getAddressByLonLat(110.447549, 34.867050);

        System.out.println(addressByLonLat);
    }
}
