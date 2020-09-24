package com.bitzh.dao;

import com.bitzh.domain.Caete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author coppolo
 */
@Repository
public interface CaeteDao {
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
    int deleteCaeteById(@Param("cId") int id);

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
    Caete selectCaeteById(@Param("cId") int id);

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
