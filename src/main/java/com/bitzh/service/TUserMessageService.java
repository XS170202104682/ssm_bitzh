package com.bitzh.service;

import com.bitzh.domain.TUserMessage;

import java.util.List;

public interface TUserMessageService {


    int deleteByPrimaryKey(Integer mId);

    int insert(TUserMessage record);

    int insertSelective(TUserMessage record);

    TUserMessage selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(TUserMessage record);

    int updateByPrimaryKey(TUserMessage record);

    List<TUserMessage> findAll();

}

