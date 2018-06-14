package com.dianping.joy.demo.biz.utils;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @Description: 日志切面
 *
 * @Author: chenkangqiang
 * @Date: 2018/6/13
 */

@Aspect
@Component
@Slf4j
public class LogAspect {

    @Pointcut(value = "@annotation(com.dianping.joy.demo.biz.utils.LogAspect.PrintInputArgs)")
    public void pointCut1() {

    }

    @Pointcut(value = "@annotation(com.dianping.joy.demo.biz.utils.LogAspect.PrintReturnArgs)")
    public void pointCut2() {

    }

    @Before(value = "@annotation(com.dianping.joy.demo.biz.utils.LogAspect.PrintInputArgs)")
    //@Before(value = "pointCut1()") 另一种写法
    public void printInputArgs(JoinPoint joinPoint) {
        log.info(JSON.toJSONString(joinPoint.getArgs()));
        System.out.println(JSON.toJSONString(joinPoint.getArgs()));
    }


    @AfterReturning(value = "@annotation(com.dianping.joy.demo.biz.utils.LogAspect.PrintReturnArgs)", returning = "obj")
    //@Before(value = "pointCut2()") 另一种写法
    public void printReturnArgs(JoinPoint joinPoint, Object obj) {
        log.info(JSON.toJSONString(obj));
        System.out.println(JSON.toJSONString(obj));
    }


    @Target(value = {ElementType.FIELD, ElementType.METHOD})
    public @interface PrintInputArgs {

    }

    @Target(value = {ElementType.FIELD, ElementType.METHOD})
    public @interface PrintReturnArgs {

    }


}
