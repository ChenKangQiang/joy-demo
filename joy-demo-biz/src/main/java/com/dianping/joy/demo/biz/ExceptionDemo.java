package com.dianping.joy.demo.biz;

/**
 * @Description:
 * @Author: chenkangqiang
 * @Date: 2018/6/22
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            System.out.println(getResult());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("截获异常catch");
        } finally {
            System.out.println("异常处理finally");
        }
    }

    public static int getResult() throws Exception {
        int a = 100;
        try {
            a = a + 10;
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("截获异常并重新抛出异常");
            throw new Exception();
        } finally {
            return a;
        }
    }


}
