package com.bitzh.service;

import com.bitzh.domain.UserMessageCustom;


import java.util.List;


public interface UserMessageService {
    /**
     * 查询留言信息
     */

    List<UserMessageCustom> selectAll();

    /**
     * 模糊查询
     *
     */
    List<UserMessageCustom> findByName(String name);


    /**
     * 删除留言信息
     */
    int delete(int id);
}
