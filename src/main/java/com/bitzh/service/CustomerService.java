package com.bitzh.service;

import com.bitzh.domain.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CustomerService {
    /**
     * 查询顾客信息
     */

    List<Customer> selectAll();

    /**
     * 模糊查询
     */
    List<Customer> findByName(String name);

    /**
     * 删除顾客信息
     */
    int delete(int id);

}
