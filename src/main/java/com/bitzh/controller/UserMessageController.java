package com.bitzh.controller;
import com.bitzh.domain.UserMessageCustom;
import com.bitzh.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserMessageController {
    @Autowired
    private UserMessageService userMessageService;

    /**
     * 查询所有留言信息
     * @param model
     * @return
     */
    @RequestMapping("/userMessage/selectAll")
    public String selectAll(Model model){
        List<UserMessageCustom> userMessageList = userMessageService.selectAll();
        model.addAttribute("userMessageList",userMessageList);
        return "userMessage";
    }

    /**
     * 模糊查询
     * @param model
     * @param name
     * @return
     */
    @RequestMapping("/userMeassage/findByName")
    public String findByName(Model model, String name){
        List<UserMessageCustom> userMessageCustoms = userMessageService.findByName(name);
        model.addAttribute("userMessages",userMessageCustoms);
        return "userMessagefind";
    }

    /**
     * 删除留言信息
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/userMeassage/delete")
    public String delete(Model model,int id){
        model.addAttribute("userMeassage",userMessageService.delete(id));
        return "redirect:/userMessage/selectAll";
    }
}
