package com.bitzh.controller;


import com.bitzh.domain.Order;
import com.bitzh.domain.OrderCustom;
import com.bitzh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 查询所有订单信息
     * @param model
     * @return
     */
    @RequestMapping("/order/selectAll")
    public String selectAll(Model model){
        List<OrderCustom> orderList = orderService.selectAll();
        model.addAttribute("orderList",orderList);
        return "order";
    }

    /**
     * 删除订单信息
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/order/delete")
    public String delete(Model model,int id){
        model.addAttribute("order",orderService.delete(id));
        return "redirect:/order/selectAll";
    }

    /**
     * 模糊查询
     * @param model
     * @param name
     * @return
     */
    @RequestMapping("/order/findByName")
    public String findByName( Model model,String name){
        List<OrderCustom> orderCustomList = orderService.findByName(name);
        model.addAttribute("orderCustomList",orderCustomList);
        return "orderFind";
    }

    /**
     * 更新订单状态
     */
    @RequestMapping("/order/update")
    public String update(OrderCustom order){
        orderService.update(order);
        return "redirect:/order/selectAll";
    }

    @RequestMapping("/order/updateGo")
    public String get(int oId,Model model){
        OrderCustom order = orderService.get(oId);
        model.addAttribute("order",order);
        return "orderUpdate";
    }

}
