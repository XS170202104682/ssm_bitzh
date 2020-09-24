package com.bitzh.controller;

import com.bitzh.domain.Admin;
import com.bitzh.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpSession;
/**
 * @author coppolo
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    @Qualifier("AdminServiceImpl")
    private AdminService adminService;

    @RequestMapping("/main")
    public String main(){
        return "tmain";
    }

    @RequestMapping("/toindex")
    public String index(){
        return "index";
    }


    @RequestMapping("/loginInfo")
    public String adminLogin(){
        return "Alogin";
    }

    @RequestMapping("/getlogin")
    public String login(@Param("aAccount") String aAccount,@Param("aPassword") String aPassword, Model model, HttpSession session) {
        Admin admin = adminService.findAdmin(aAccount, aPassword);
        if(aAccount==null || "".equals(aAccount)){
            model.addAttribute("msg1","请输入账户!");
        }else if (aAccount==null || "".trim().equals(aAccount)){
            model.addAttribute("msg1", "账户不存在!");
            return "Alogin";
        }else if (admin!=null && (aPassword==null || "".equals(aPassword))){
            model.addAttribute("msg2", "请输入密码");
        }else if(admin!=null && !(admin.getaPassword().equals(aPassword))){
            model.addAttribute("msg2", "密码错误");
        }else if (admin!=null && admin.getaPassword().equals(aPassword)){
            return "redirect:/admin/main";
        }
        return "Alogin";
    }
}