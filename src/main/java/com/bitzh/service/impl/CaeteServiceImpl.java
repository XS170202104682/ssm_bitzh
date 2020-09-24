package com.bitzh.service.impl;

import com.bitzh.dao.CaeteDao;
import com.bitzh.domain.Caete;
import com.bitzh.service.CaeteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author COPPOLO
 */
@Service
public class CaeteServiceImpl implements CaeteService {

    @Autowired
    private CaeteDao caeteDao;

    public void setCaeteDao(CaeteDao caeteDao){
        this.caeteDao = caeteDao;
    }

    /**
     * 添加菜品
     * @param caete
     * @return
     */
    @Override
    public int addCaete(Caete caete) {
        return caeteDao.addCaete(caete);
    }

    /**
     * 删除菜品
     * @param id
     * @return
     */
    @Override
    public int deleteCaeteById(int id) {
        return caeteDao.deleteCaeteById(id);
    }

    /**
     * 更新菜品信息
     * @param caete
     * @return
     */
    @Override
    public int updateCaete(Caete caete) {
        return caeteDao.updateCaete(caete);
    }

    /**
     * 查询一个菜品
     * @param id
     * @return
     */
    @Override
    public Caete selectCaeteById(int id) {
        return caeteDao.selectCaeteById(id);
    }

    /**
     * 查询所有菜品
     * @return
     */
    @Override
    public List<Caete> selectAll() {
        return caeteDao.selectAll();
    }

    /**
     * 模糊查询菜品
     * @param cName
     * @return
     */
    @Override
    public List<Caete> findCaeteByName(String cName) {
        return caeteDao.findCaeteByName(cName);
    }
}
