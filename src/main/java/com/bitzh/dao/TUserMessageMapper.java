package com.bitzh.dao;

import com.bitzh.domain.TUserMessage;import java.util.List;

public interface TUserMessageMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(TUserMessage record);

    int insertSelective(TUserMessage record);

    TUserMessage selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(TUserMessage record);

    int updateByPrimaryKey(TUserMessage record);

    List<TUserMessage> findAll();
}