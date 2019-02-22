package com.imooc.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author blackjack
 * @create
 */
public class LoggerUtil {

    private static Logger getLogger(Class clazz){
        return  LoggerFactory.getLogger(clazz);
    }
private  static Logger getLogger(String name){
        return LoggerFactory.getLogger(name);
}


    public static void error(Object source,String message,Object object) {
        getLogger(source.getClass()).error(message,object);
    }
    public static  void info(Object source,String message,Object object) {
        getLogger(source.getClass()).info(message,object);
    }

}
