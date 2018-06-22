package com.dianping.joy.demo.biz.demo;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.io.IOException;
import java.text.DecimalFormat;

/**
 * @Description:
 * @Author: chenkangqiang
 * @Date: 2018/6/17
 */
public class StringUtilsDemo {


    public static void main(String[] args) {
        System.out.println(StringUtils.isNumeric("124"));
        System.out.println(StringUtils.isNumeric("-124"));
        System.out.println(StringUtils.isNumeric("+124"));

        System.out.println(NumberUtils.isNumber("-124"));
        System.out.println(NumberUtils.isCreatable("+124"));

        System.out.println(null + "");


        String distance1 = "202.389589718178333333333333";
        String distance2 = "";

        System.out.println(Double.parseDouble(distance1));
        //System.out.println(Double.parseDouble(distance2)); //异常

//        double a = 202.7345666;
//        System.out.println((int) a);
//
//        int distance = 1620;
//
//        String distanceStr = (float) (Math.round((float) distance / 1000 * 10)) / 10 + "km";
//        System.out.println("distanceStr:" + distanceStr);

        System.out.println("103.38989 -> " + transformDistance(103.38989));
        System.out.println("103.78989 -> " + transformDistance(103.78989));
        System.out.println("999.78 -> " + transformDistance(999.78));
        System.out.println("995.78 -> " + transformDistance(995.78));
        System.out.println("208 -> " + transformDistance(208));
        System.out.println("1000 -> " + transformDistance(1000));
        System.out.println("1030.38989 -> " + transformDistance(1030.38989));
        System.out.println("56.908989 -> " + transformDistance(56.908989));
        System.out.println("1260 -> " + transformDistance(1260));
        System.out.println("1230 -> " + transformDistance(1230));



        Double aaa = 3000d;
        System.out.println(aaa + "");
        System.out.println(null + "");


//        DecimalFormat df = new DecimalFormat("#");
//        double distance = 999.78;
//        System.out.println(df.format(distance));

        System.out.println(String.format("获取推荐的餐饮商户异常, method=%s, reqDTO=%s", "get", "123"));

        try {
            throwException2();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public static void throwException1() throws IOException {
        throw new IOException();
    }


    public static void throwException2() throws IOException {
        System.out.println("123");
        throwException1();
        System.out.println("456");
    }


    public static String transformDistance(double distance) {
        String distanceStr = "";
        if (distance < 1000) {
            distanceStr = (int) distance + "m";
        } else {
            DecimalFormat df = new DecimalFormat("#.0");
            distanceStr = df.format(distance / 1000) + "km";
        }
        return distanceStr;
    }

}
