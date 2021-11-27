package com.yl.dockerdemo.core.strategy;

import com.yl.dockerdemo.common.exceptions.BusinessException;

/**
 * @author: zhangfh@yealink.com
 * @date: 2021/11/25 14:17
 */
public class StrategyFactory {

    public static Strategy getBean(String className) {
        Class<?> aClass;
        try {
            aClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new BusinessException("class.forName出错", e);
        }
        try {
            return (Strategy)aClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BusinessException("对象实例化失败", e);
        }
    }
}
