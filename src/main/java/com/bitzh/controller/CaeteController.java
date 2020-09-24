package com.bitzh.controller;

import com.bitzh.domain.Caete;
import com.bitzh.service.CaeteService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coppolo
 */
@Controller
@RequestMapping("/caete")
public class CaeteController {

    @Autowired
    @Qualifier("CaeteServiceImpl")
    private CaeteService caeteService;

    /**
     * 查询全部菜品并返回页面
     * @param model
     * @return
     */
    @RequestMapping("/allCaete")
    public String selectAll(@RequestParam(defaultValue = "1",value="page") Integer page,Model model){
        System.out.println("Controller，查询所有账户...");
        PageHelper.startPage(page, 5);
        List<Caete> list = caeteService.selectAll();
        PageInfo pageInfo = new PageInfo(list);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("list",list);
        return "allCaete";
    }

    /**
     * 跳转到添加菜品页面
     * @return
     */
    @RequestMapping("/toaddCaete")
    public String toaddCaete(){
        return "addCaete";
    }

    /**
     * 添加菜品请求
     * @param caete
     * @return
     */
    @RequestMapping("/addCaete")
    public String addCaete(Caete caete){
        System.out.println("添加信息"+caete);
        caeteService.addCaete(caete);
        return "redirect:/caete/allCaete";
    }

    /**
     * 跳转到修改页面
     * @return
     */
    @RequestMapping("toUpdate")
    public String toUpdateCaete(int id, Model model){
        Caete caete = caeteService.selectCaeteById(id);
        model.addAttribute("Scaete",caete);
        return "updateCaete";
    }

    /**
     * 修改菜品请求
     * @param caete
     * @return
     */
    @RequestMapping("updateCaete")
    public String updateCaete(Caete caete){
        System.out.println("修改菜品"+caete);
        caeteService.updateCaete(caete);
        return "redirect:/caete/allCaete";
    }

    /**
     * 删除菜品请求
     * @param id
     * @return
     */
    @RequestMapping("/deleteCaete/{cId}")
    public String deleteCaete(@PathVariable("cId") int id){
        caeteService.deleteCaeteById(id);
        return "redirect:/caete/allCaete";
    }

    /**
     * 分页模糊查询员工信息
     * @param page
     * @param findcaete
     * @param model
     * @return
     */
    @RequestMapping("/find")
    public String findCaete(@RequestParam(defaultValue = "1",value = "page") Integer page,String findcaete,Model model){
        PageHelper.startPage(page, 5);
        List<Caete> list = caeteService.findCaeteByName(findcaete);
        PageInfo pageinfo = new PageInfo(list);

        if(list == null){
            list = caeteService.selectAll();
            model.addAttribute("error","没有该类菜品");
        }

        model.addAttribute("pageInfo", pageinfo);
        model.addAttribute("list",list);
        return "allCaete";
    }

}
