package com.dianping.joy.demo.biz.demo;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Data;
import org.apache.commons.text.StringEscapeUtils;


/**
 * @Description:
 * @Author: chenkangqiang
 * @Date: 2018/6/15
 */
public class UnicodeDemo {

    public static void main(String[] args) {
        System.out.println(StringEscapeUtils.escapeJava("哈哈"));
        System.out.println("\\u54C8\\u54C8");
        System.out.println("￥: " + StringEscapeUtils.escapeJava("￥"));
        System.out.println("\uFFE5");

        System.out.println(JSON.toJSONString(new Dog(), SerializerFeature.BrowserCompatible));
        System.out.println(JSON.toJSONString(new Dog()));
    }

    @Data
    public static class Dog {
        String name = StringEscapeUtils.escapeJava("哈哈");
        String nickName = "\u54C8\u54C8";
    }

}
