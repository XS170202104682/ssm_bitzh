package com.bitzh.service;

import com.bitzh.domain.Caete;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author coppolo
 */
public interface CaeteService {

    /**
     * 增加菜品
     * @param caete
     * @return
     */
    int addCaete(Caete caete);

    /**
     * 删除菜品
     * @param id
     * @return
     */
    int deleteCaeteById(int id);

    /**
     * 更新菜品
     * @param caete
     * @return
     */
    int updateCaete(Caete caete);

    /**
     * 查询一个菜品
     * @param id
     * @return
     */
    Caete selectCaeteById(int id);

    /**
     * 查询全部菜品
     * @return
     */
    List<Caete> selectAll();

    /**
     * 查询功能
     * @param cName
     * @return
     */
    List<Caete> findCaeteByName(@Param("cName") String cName);
}
