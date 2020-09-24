package com.bitzh.service.impl;

import com.bitzh.service.TCustomerService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.bitzh.dao.TCustomerMapper;
import com.bitzh.domain.TCustomer;

import java.util.List;

@Service("tCustomerService")
public class TCustomerServiceImpl implements TCustomerService {

    @Resource
    private TCustomerMapper tCustomerMapper;

    @Override
    public boolean deleteByPrimaryKey(Integer uId) {
        return tCustomerMapper.deleteByPrimaryKey(uId);
    }

    /**
     * 添加数据
     */
    @Override
    public int insert(TCustomer record) {
        return tCustomerMapper.insert(record);
    }

    @Override
    public int insertSelective(TCustomer record) {
        return tCustomerMapper.insertSelective(record);
    }

    @Override
    public TCustomer selectByPrimaryKey(Integer uId) {
        return tCustomerMapper.selectByPrimaryKey(uId);
    }

    @Override
    public boolean updateByPrimaryKeySelective(TCustomer record) {
        return tCustomerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCustomer record) {
        return tCustomerMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TCustomer> findAll() {
            return tCustomerMapper.findAll();
    }

    @Override
    public TCustomer login(TCustomer tCustomer){
        return tCustomerMapper.login(tCustomer);
    }


}
