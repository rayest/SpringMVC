package com.ucardstore;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by Rayest on 2016/9/13 0013.
 */
public class Application {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "lee");
        jsonObject.put("age", 20);
        System.out.println(jsonObject.toString()); // {"name":"lee","age":20}
        System.out.println(jsonObject.toJSONString()); // {"name":"lee","age":20}
        System.out.println(jsonObject); // {"name":"lee","age":20}
    }
}
