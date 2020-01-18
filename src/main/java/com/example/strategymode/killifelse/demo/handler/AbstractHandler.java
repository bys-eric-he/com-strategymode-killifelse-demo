package com.example.strategymode.killifelse.demo.handler;

import com.example.strategymode.killifelse.demo.model.OrderDTO;

public abstract class AbstractHandler {
    abstract public String handle(OrderDTO dto);
}
