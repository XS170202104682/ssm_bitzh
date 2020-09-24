package com.bitzh.controller;

import com.bitzh.domain.TCustomer;
import com.bitzh.domain.TUserMessage;
import com.bitzh.service.TUserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TUserMessageController {
    @Autowired
    private TUserMessageService tUserMessageService;

    @RequestMapping("/userMessage/getAllMessage")
    public String getAllCustomer(HttpServletRequest request, Model model){
        List<TUserMessage> userMessagers=tUserMessageService.findAll();
        System.out.println(userMessagers);
        model.addAttribute("list",userMessagers);
        request.setAttribute("list",userMessagers);
        return "AllCustomer";
    }
    /**
     * 添加信息
     * @param userMessage
     * @param model
     * @return
     */
    @RequestMapping("/userMessage/addMessage")
    public String addMessage(TUserMessage userMessage, Model model){
        tUserMessageService.insertSelective(userMessage);
        return "redirect:/caete/order_success_yjc";
    }
    @RequestMapping("/userMessage/toAddMessage")
    public String toAddMessage(){
        return "userMessage";
    }
}
