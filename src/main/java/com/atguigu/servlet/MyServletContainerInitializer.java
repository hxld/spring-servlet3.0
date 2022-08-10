package com.atguigu.servlet;

import com.atguigu.service.HelloService;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @author hxld
 * @create 2022-08-10 18:17
 */
//容器启动的时候会将@HandlesTypes指定类型下面的子类（实现类，接口）传递进来；
    //传入感兴趣的类型
@HandlesTypes(value={HelloService.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {

    /**
     * 应用启动的时候，会运行onstartup方法；
     *
     * ServletContext :代表当前web应用的ServletContext；一个web应用对弈一个ServletContext
     * Set<Class<?>> set :感兴趣的类型的所有子类型
     * @param set
     * @param servletContext
     * @throws ServletException
     */


    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("感兴趣的类型：" );
        for (Class  clazz  :set) {
            System.out.println(clazz);
        }
    }
}
