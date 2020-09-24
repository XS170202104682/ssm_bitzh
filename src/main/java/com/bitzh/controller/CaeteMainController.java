package com.bitzh.controller;

import com.bitzh.domain.*;
import com.bitzh.service.CaeteMainService;
import com.bitzh.service.TUserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @庾君成
 * @菜品展示控制器
 */
@Controller
@RequestMapping("/caete")
public class CaeteMainController {
    @Autowired
    @Qualifier("CaeteMainServiceImpl")
    private CaeteMainService caeteService;
    //查询全部--庾君成
    @RequestMapping("/caete_display_yjc")
    public String caidan(Model model){
        List<Caete> list = caeteService.queryAllCaete();
        model.addAttribute("listall",list);
        return "caete_display_yjc";
    }

    //添加菜到购物车,跳到本身--庾君成
    @RequestMapping("/addShopping")
    public String addShopping(Integer cId){
        Caete caete = caeteService.queryCaeteById(cId);
        caeteService.addShopping(caete);
            return "redirect:caete_display_yjc";
    }


    //添加菜到购物车,跳到本身--庾君成
    @RequestMapping("/addShopping1")
    public String addShopping1( Integer cId){
        Caete caete = caeteService.queryCaeteById(cId);
        caeteService.addShopping(caete);
        return "redirect:/caete/findFruits";
    }

    //添加菜到购物车,跳到本身--庾君成
    @RequestMapping("/addShopping2")
    public String addShopping2(Integer cId){
        Caete caete = caeteService.queryCaeteById(cId);
        caeteService.addShopping(caete);
        return "redirect:/caete/findMeat";
    }

    //添加菜到购物车,跳到本身--庾君成
    @RequestMapping("/addShopping3")
    public String addShopping3(Integer cId){
        Caete caete = caeteService.queryCaeteById(cId);
        caeteService.addShopping(caete);
        return "redirect:/caete/findDrinks";
    }

    //添加菜到购物车,跳到本身--庾君成
    @RequestMapping("/addShopping4")
    public String addShopping4(Integer cId){
        Caete caete = caeteService.queryCaeteById(cId);
        caeteService.addShopping(caete);
        return "redirect:/caete/findVegetable";
    }

    //添加菜到购物车,跳到本身--庾君成
    @RequestMapping("/addShopping5")
    public String addShopping5(Integer cId){
        Caete caete = caeteService.queryCaeteById(cId);
        caeteService.addShopping(caete);
        return "redirect:/caete/findOthers";
    }

    //添加菜到购物车,跳到本身--庾君成
    @RequestMapping("/addShopping6")
    public String addShopping6(Integer cId){
        Caete caete = caeteService.queryCaeteById(cId);
        caeteService.addShopping(caete);
        return "redirect:/caete/findName";
    }



    //显示购物车信息--庾君成
    @RequestMapping("/selectShopping")
    public String selectShopping(Model model){
        List<Shopping> list = caeteService.selectShopping();
        model.addAttribute("listshopping",list);
        return "shoppingcaete_yjc";
    }


    //删除菜--庾君成
    @RequestMapping("/deleteShopping/{cId}")
    public String deleteShopping(@PathVariable("cId") int cId){
        caeteService.deleteShopping(cId);
            return "redirect:/caete/selectShopping";
    }

    //呼叫服务员--庾君成
    @RequestMapping("/oderpage_yjc")
    public String callwaiter(){
        return "order_yjc";
    }

    //服务员录入下单信息--庾君成
    @RequestMapping("/writeOrder")
    public String writeOrder(Order order){
        Date oTime = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH: mm: ss");
        String current = simpleDateFormat.format(oTime);
        order.setoTime(current);
        caeteService.addOrder(order);
        return "order_success_yjc";
    }

    //下订单以后的返回菜单按钮--庾君成
    @RequestMapping("/toCaete")
    public String toCaete(){
        return "formpage";
    }

    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        List<Order> orderList = caeteService.selectAll();
        model.addAttribute("orderList1",orderList);
        return "searchOrder_yjc";
    }


    //根据名字中的关键字段查询菜品-刘梓靖
    @RequestMapping("/findName")
    public  String findName(Caete caete ,Model model){
        System.out.println("根据菜名查询");
        System.out.println(caete);
        List<Caete> caeteList1 = caeteService.findName(caete);
        model.addAttribute("findNameList",caeteList1);
        return "findName";
    }

    //查找水果类-刘梓靖
    @RequestMapping("/findFruits")
    public  String findFruits(Caete caete,Model model){
        System.out.println("查找水果类");
        System.out.println(caete);
        List<Caete> caeteList2 = caeteService.findFruits(caete);
        model.addAttribute("findFruitsList",caeteList2);
        return "sort";
    }

    //查找荤菜类-刘梓靖
    @RequestMapping("/findMeat")
    public  String findMeat(Caete caete,Model model) {
        System.out.println("查找荤菜类");
        System.out.println(caete);
        List<Caete> caeteList3 = caeteService.findMeat(caete);
        model.addAttribute("findMeatList", caeteList3);
        return "sort";
    }

    //查找饮料类-刘梓靖
    @RequestMapping("/findDrinks")
    public String findDrinks(Caete caete,Model model){
        System.out.println("查找饮料类");
        System.out.println(caete);
        List<Caete> caeteList4 = caeteService.findDrinks(caete);
        model.addAttribute("findDrinksList",caeteList4);
        return "sort";
    }

    //查找素菜类-刘梓靖
    @RequestMapping("/findVegetable")
    public String findVegetable(Caete caete,Model model){
        System.out.println("查找素菜类");
        System.out.println(caete);
        List<Caete> caeteList5 = caeteService.findVegetable(caete);
        model.addAttribute("findVegetableList",caeteList5);
        return "sort";
    }

    //查找其他类-刘梓靖
    @RequestMapping("/findOthers")
    public  String findOthers(Caete caete,Model model){
        System.out.println("查找其他类");
        System.out.println(caete);
        List<Caete> caeteList6 = caeteService.findOthers(caete);
        model.addAttribute("findOthersList",caeteList6);
        return "sort";
    }

    @RequestMapping("/order_success_yjc")
    public String order_success_yjc(){
        return "order_success_yjc";
    }

}
