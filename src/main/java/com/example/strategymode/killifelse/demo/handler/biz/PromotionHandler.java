package com.example.strategymode.killifelse.demo.handler.biz;

import com.example.strategymode.killifelse.demo.handler.AbstractHandler;
import com.example.strategymode.killifelse.demo.handler.HandlerType;
import com.example.strategymode.killifelse.demo.model.OrderDTO;
import org.springframework.stereotype.Component;

/**
 * @Author: Eric.He
 * @Description: 促销订单处理器
 * @Date: Created in 20:30 2020/01/17
 */
@Component
@HandlerType("3")
public class PromotionHandler extends AbstractHandler {

    @Override
    public String handle(OrderDTO dto) {
        return "处理促销订单";
    }

}
