package com.bitzh.controller;

import com.bitzh.domain.TCustomer;
import com.bitzh.service.TCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TCustomerController {

    @Autowired
    private TCustomerService tCustomerService;
    /**
     * 获取所有信息
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/customer/getAllCustomer")
    public String getAllCustomer(HttpServletRequest request, Model model){
        List<TCustomer> customer=tCustomerService.findAll();
        System.out.println(customer);
        model.addAttribute("list",customer);
        request.setAttribute("list",customer);
        return "AllCustomer";
    }



    /**
     * 添加信息
     * @param customer
     * @param model
     * @return
     */
    @RequestMapping("/customer/addUser")
    public String addUser(TCustomer customer, Model model){
        tCustomerService.insertSelective(customer);
        return "redirect:/customer/getAllCustomer";
    }

    /**
     * 修改信息
     * @param customer
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/customer/updateUser")
    public String updateUser(TCustomer customer, HttpServletRequest request, Model model){
        if(tCustomerService.updateByPrimaryKeySelective(customer)){
            customer=tCustomerService.selectByPrimaryKey(customer.getuId());
            request.setAttribute("customer",customer);
            model.addAttribute("customer",customer);
            return "redirect:/customer/getAllCustomer";
        }else{
            return "error";
        }
    }

    /**
     * 根据U_ID查询
     * @param uId
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/customer/getCustomer")
    public String getCustomer(Integer uId, HttpServletRequest request, Model model){
        request.setAttribute("customer",tCustomerService.selectByPrimaryKey(uId));
        model.addAttribute("customer",tCustomerService.selectByPrimaryKey(uId));
        return "editUser";
    }

    /**
     * 删除用户
     * @param uId
     */
    @RequestMapping("/customer/delCustomer")
    public String delCustomer(Integer uId){
        tCustomerService.deleteByPrimaryKey(uId);
        return "redirect:/customer/getAllCustomer";
    }

    /**
     * 注册账号
     * @param customer
     * @param model
     * @return
     */
    @RequestMapping("/customer/register")
    public String register(TCustomer customer, Model model){
        tCustomerService.insertSelective(customer);
        return "login";
    }

/*    @RequestMapping("/customer/login")
    public String login(TCustomer tCustomer,Model model) {
        TCustomer ad=tCustomerService.login(tCustomer);
        if(ad!=null){
            return "redirect:/customer/getAllCustomer";
        }else{
            return "error";
        }
    }
*/
    @RequestMapping("/customer/login")
    public String login(TCustomer tCustomer,Model model) {
        TCustomer ad=tCustomerService.login(tCustomer);
            if(ad!=null){
                return "formpage";
            }else{
                return "error";
    }
}

    @RequestMapping("tologin")
    public  String tologin(){
        return "login";
    }

    @RequestMapping("toregister")
    public  String toregister(){
        return "register";
    }


}


