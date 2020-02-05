package com.mzy;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class TestJuLi {
    public static Long getDistance(String startLonLat, String endLonLat, String key) {
        //返回起始地startAddr与目的地endAddr之间的距离，单位：米
        Long result = 0L;
        String queryUrl = "http://restapi.amap.com/v3/distance?key=" + key + "&origins=" + startLonLat + "&destination=" + endLonLat;
        String queryResult = getResponse(queryUrl);
        JSONObject jsonObject = JSONObject.parseObject(queryResult);
        JSONArray results = jsonObject.getJSONArray("results");
        String s = result.toString();
        Object obj = JSONObject.parseObject(results.getString(0)).get("distance");
   /*     JSONObject jo = JSONObject.fromObject(queryResult);
        JSONArray ja = jo.getJSONArray("results");
        Object obj = JSONObject.fromObject(ja.getString(0)).get("distance");*/
        if (obj == null) {
            return result;
        }
        result = Long.parseLong(obj.toString());
        return result;
    }

    private static String getResponse(String serverUrl) {
        //用JAVA发起http请求，并返回json格式的结果
        StringBuffer result = new StringBuffer();
        try {
            URL url = new URL(serverUrl);
            URLConnection conn = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
            in.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public static void main(String[] args) {
        //永济坐标
        String startLonLat = "110.447549,34.867050";
        //焦作坐标
        String endLonLat = "113.241823,35.215892";
        //郑州坐标
        String zhengzhou = "113.625368,34.746599";
        String key = "233724e1edb9abd44b3075edc68ea135";

        System.out.println(startLonLat);
        System.out.println(endLonLat);
        Long dis = getDistance(startLonLat, zhengzhou, key);
        long juli = dis/500;
        long time = juli/125;
        System.out.println("永济到郑州距离:"+dis+"米,"+juli+"里,开车大概用时:"+time+"小时");
    }
}