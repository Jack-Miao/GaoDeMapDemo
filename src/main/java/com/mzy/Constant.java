package com.mzy;

/**
 * @Description
 * @Author MiaoZhuoYang
 * @Date 2020-01-2020/1/30 15:47
 */
public class Constant {

    /**
     * 高德地图请求秘钥
     */
    private static final String KEY = "233724e1edb9abd44b3075edc68ea135";
    /**
     * 返回值类型
     */
    private static final String OUTPUT = "JSON";
    /**
     * 根据地名获取高德经纬度Api
     */
    private static final String GET_LNG_LAT_URL = "http://restapi.amap.com/v3/geocode/geo";
    /**
     * 根据高德经纬度获取地名Api
     */
    private static final String GET_ADDRESS_URL = "http://restapi.amap.com/v3/geocode/regeo";

}
