package com.bitzh.service;

import com.bitzh.domain.TCustomer;

import java.util.List;

public interface TCustomerService{


    boolean deleteByPrimaryKey(Integer uId);

    int insert(TCustomer record);

    int insertSelective(TCustomer record);

    TCustomer selectByPrimaryKey(Integer uId);

    boolean updateByPrimaryKeySelective(TCustomer record);

    int updateByPrimaryKey(TCustomer record);

    List<TCustomer> findAll();

    TCustomer login(TCustomer tCustomer);

}
