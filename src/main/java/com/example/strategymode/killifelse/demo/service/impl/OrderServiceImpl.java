package com.example.strategymode.killifelse.demo.service.impl;

import com.example.strategymode.killifelse.demo.handler.AbstractHandler;
import com.example.strategymode.killifelse.demo.handler.biz.GroupHandler;
import com.example.strategymode.killifelse.demo.handler.biz.NormalHandler;
import com.example.strategymode.killifelse.demo.handler.biz.PromotionHandler;
import com.example.strategymode.killifelse.demo.model.OrderDTO;
import com.example.strategymode.killifelse.demo.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * @Author: Eric.He
 * @Description:
 * @Date: Created in 20:54 2020/1/17
 */
@Service("orderService")
public class OrderServiceImpl implements IOrderService {

    @Override
    public String handle(OrderDTO dto) {
        String type = dto.getType();
        AbstractHandler handler;
        if ("1".equals(type)) {
            handler = new NormalHandler();
            return handler.handle(new OrderDTO());
        } else if ("2".equals(type)) {
            handler = new GroupHandler();
            return handler.handle(new OrderDTO());
        } else if ("3".equals(type)) {
            handler = new PromotionHandler();
            return handler.handle(new OrderDTO());
        }
        return null;
    }

}