package com.bitzh.controller;

import com.bitzh.domain.Staff;
import com.bitzh.service.StaffService;
import com.github.pagehelper.Page;
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
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    @Qualifier("StaffServiceImpl")
    private StaffService staffService;

    /**
     * 查询全部员工
     * @param model
     * @return
     */
    @RequestMapping("/allStaff")
    public String findAll(@RequestParam(defaultValue = "1",value = "pn") Integer pn, Model model){
        PageHelper.startPage(pn, 5);
        List<Staff> stafflist = staffService.findAllStaff();
        PageInfo pi = new PageInfo(stafflist);
        model.addAttribute("pi", pi);
        model.addAttribute("stafflist",stafflist);
        return "allStaff";
    }


    /**
     * 添加员工请求
     * @return
     */
    @RequestMapping("/toAddStaff")
    public String toAddStaff(){
        return "addStaff";
    }

    /**
     * 插入员工信息
     * @param record
     * @return
     */
    @RequestMapping("/insert")
    public String insert(Staff record){
        staffService.insert(record);
        return "redirect:/staff/allStaff";
    }

    /**
     * 更新员工信息请求
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("toUpdate")
    public String toUpdateStaff(int id,Model model){
        Staff record = staffService.selectByPrimaryKey(id);
        model.addAttribute("SStaff", record);
        return "updateStaff";
    }

    /**
     * 更新员工信息页面
     * @param record
     * @return
     */
    @RequestMapping("updateStaff")
    public String updateByPrimaryKey(Staff record){
        staffService.updateByPrimaryKey(record);
        return "redirect:/staff/allStaff";
    }

    /**
     * 删除员工
     * @param id
     * @return
     */
    @RequestMapping("/deleteStaff/{sId}")
    public String deleteByPrimaryKey(@PathVariable("sId") int id){
        staffService.deleteByPrimaryKey(id);
        return "redirect:/staff/allStaff";
    }

    /**
     * 模糊查询员工信息
     * @param pn
     * @param findStaff
     * @param model
     * @return
     */
    @RequestMapping("/find")
    public String findStaff(@RequestParam(defaultValue = "1",value = "pn") Integer pn,String findStaff,Model model){
        PageHelper.startPage(pn, 5);
        List<Staff> stafflist = staffService.findByName(findStaff);
        PageInfo pi = new PageInfo(stafflist);
        model.addAttribute("pi", pi);
        model.addAttribute("stafflist", stafflist);
        return "allStaff";
    }
}
