package com.example.strategymode.killifelse.demo;

import com.example.strategymode.killifelse.demo.model.OrderDTO;
import com.example.strategymode.killifelse.demo.service.IOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComExampleStrategymodeKillifelseDemoApplicationTests {
    @Autowired
    private IOrderService orderService;
    @Autowired
    private IOrderService orderServiceV2;
    @Test
    void handlerProcess(){
        OrderDTO orderDTO = new OrderDTO();
        String result;
        orderDTO.setType("2");
        result = orderService.handle(orderDTO);
        System.out.println(result);
        orderDTO.setType("3");
        result = orderServiceV2.handle(orderDTO);
        System.out.println(result);
    }

}
