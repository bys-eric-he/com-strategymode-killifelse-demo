package com.example.strategymode.killifelse.demo.handler;

import com.example.strategymode.killifelse.demo.util.ApplicationContextTool;

import java.util.Map;

/**
 * @author Eric.He
 * @description 处理器上下文，根据类型获取相应的处理器
 * @date: Created in 19:55 2020/01/17
 */
public class HandlerContext {

    private Map<String, Class> handlerMap;

    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public AbstractHandler getInstance(String type) {
        Class clazz = handlerMap.get(type);
        if (clazz == null) {
            throw new IllegalArgumentException("not found handler for type: " + type);
        }
        return (AbstractHandler) ApplicationContextTool.getBean(clazz);
    }

}
