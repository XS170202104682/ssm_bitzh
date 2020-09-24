package com.bitzh.controller;
import com.bitzh.domain.Customer;
import com.bitzh.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * 查询所有顾客信息
     * @param model
     * @return
     */
    @RequestMapping("/customer/selectAll")
    public String selectAll(Model model ){
        List<Customer> customerList = customerService.selectAll();
        model.addAttribute("customerList",customerList);
        return "customer";
    }

    /**
     * 返回主页
     * @return
     */
    @RequestMapping("/main")
    public String main(){
        return "tmain";
    }

    /**
     * 模糊查询
     * @param model
     * @param name
     * @return
     */
    @RequestMapping("/customer/findByName")
    public String findByName( Model model,String name){
        List<Customer> customers = customerService.findByName(name);
        model.addAttribute("customers",customers);
        return "customerFind";
    }

    /**
     * 删除顾客信息
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/customer/delete")
    public String delete(Model model,int id){
        model.addAttribute("customers",customerService.delete(id));
        return "redirect:/customer/selectAll";
    }
}
