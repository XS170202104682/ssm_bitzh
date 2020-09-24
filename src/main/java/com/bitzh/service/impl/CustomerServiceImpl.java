package com.bitzh.service.impl;
import com.bitzh.dao.CustomerDao;
import com.bitzh.domain.Customer;
import com.bitzh.domain.UserMessage;
import com.bitzh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    /**
     * 查询所有顾客信息
     * @return
     */
    @Override
    public List<Customer> selectAll(){
        customerDao.selectAll();
        return customerDao.selectAll();
    }

    /**
     * 模糊查询
     * @param name
     * @return
     */
    @Override
    public List<Customer> findByName(String name){
        return customerDao.findByName(name);
    }

    /**
     * 删除订单
     * @return
     */

    @Override
    public int delete(int id) {
        customerDao.delete(id);
        return customerDao.delete(id);
    }

}
