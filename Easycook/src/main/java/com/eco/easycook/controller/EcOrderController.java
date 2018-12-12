package com.eco.easycook.controller;

import com.eco.easycook.ResponseVo.Vo;
import com.eco.easycook.pojo.EcOrder;
import com.eco.easycook.service.EcOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class EcOrderController {

    @Autowired
    private EcOrderService ecOrderService;

    /**
     * 根据用户id查询订单信息
     * @param gid
     * @return
     */
    @GetMapping("/selectOrderById")
    public Vo selectOrderById(int gid) {

        return ecOrderService.selectOrderById(gid);
    }

    /**
     * 添加订单
     */
    @PostMapping("/addOrder")
    public Vo addOrder(EcOrder ecOrder) {

        return ecOrderService.addOrder(ecOrder);
    }

    /**
     * 根据订单id删除订单
     */
    @DeleteMapping("/delOrder")
    public Vo delOrder(int oid) {

        return ecOrderService.delOrder(oid);
    }
}
