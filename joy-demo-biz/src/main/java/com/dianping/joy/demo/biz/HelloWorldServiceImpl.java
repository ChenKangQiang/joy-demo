package com.dianping.joy.demo.biz;

import com.dianping.joy.demo.biz.utils.LogAspect;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: chenkangqiang
 * @Date: 2018/6/14
 */
@Component
public class HelloWorldServiceImpl {

    public String helloWorld() {
        return "Hello World!";
    }

    @LogAspect.PrintInputArgs
    @LogAspect.PrintReturnArgs
    public String helloWorld(Integer index) {
        return "Hello World! " + index;
    }

}
