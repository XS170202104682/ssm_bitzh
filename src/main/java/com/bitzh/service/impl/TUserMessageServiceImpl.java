package com.bitzh.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.bitzh.domain.TUserMessage;
import com.bitzh.dao.TUserMessageMapper;
import com.bitzh.service.TUserMessageService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("tUserMessageService")
public class TUserMessageServiceImpl implements TUserMessageService {

    @Resource
    private TUserMessageMapper tUserMessageMapper;

    @Override
    public int deleteByPrimaryKey(Integer mId) {
        return tUserMessageMapper.deleteByPrimaryKey(mId);
    }

    @Override
    public int insert(TUserMessage record) {
        return tUserMessageMapper.insert(record);
    }

    @Override
    public int insertSelective(TUserMessage record) {
        return tUserMessageMapper.insertSelective(record);
    }

    @Override
    public TUserMessage selectByPrimaryKey(Integer mId) {
        return tUserMessageMapper.selectByPrimaryKey(mId);
    }

    @Override
    public int updateByPrimaryKeySelective(TUserMessage record) {
        return tUserMessageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TUserMessage record) {
        return tUserMessageMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TUserMessage> findAll() {
        return tUserMessageMapper.findAll();
    }

}

