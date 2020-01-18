package com.example.strategymode.killifelse.demo.service.impl;

import com.example.strategymode.killifelse.demo.handler.AbstractHandler;
import com.example.strategymode.killifelse.demo.handler.HandlerContext;
import com.example.strategymode.killifelse.demo.model.OrderDTO;
import com.example.strategymode.killifelse.demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Eric.He
 * @Description:
 * @Date: Created in 20:54 2020/01/17
 */
@Service("orderServiceV2")
public class OrderServiceV2Impl implements IOrderService {

    @Autowired
    private HandlerContext handlerContext;

    @Override
    public String handle(OrderDTO dto) {
        AbstractHandler handler = handlerContext.getInstance(dto.getType());
        return handler.handle(dto);
    }

}