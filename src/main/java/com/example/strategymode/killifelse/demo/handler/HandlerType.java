package com.example.strategymode.killifelse.demo.handler;

import java.lang.annotation.*;

/**
 * @Author: Eric.He
 * @Description:
 * @Date: Created in 20:07 2020/01/17
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerType {
    String value();
}