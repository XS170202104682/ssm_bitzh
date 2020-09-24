package com.bitzh.service.impl;
import com.bitzh.dao.UserMessageDao;
import com.bitzh.domain.UserMessageCustom;
import com.bitzh.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserMessageService")
public class UserMessageServiceImpl implements UserMessageService {

    @Autowired
    private UserMessageDao userMessageDao;

    /**
     * 查询所有留言信息
     * @return
     */
    @Override
    public List<UserMessageCustom> selectAll() {
        userMessageDao.selectAll();
        return userMessageDao.selectAll();
    }

    /**
     * 模糊查询
     * @param name
     * @return
     */
    @Override
    public List<UserMessageCustom> findByName(String name){
        return userMessageDao.findByName(name);
    }

    /**
     * 删除订单
     * @return
     */

    @Override
    public int delete(int id) {
        userMessageDao.delete(id);
        return userMessageDao.delete(id);
    }
}
