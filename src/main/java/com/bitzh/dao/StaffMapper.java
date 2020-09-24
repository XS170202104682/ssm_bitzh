package com.bitzh.dao;

import com.bitzh.domain.Staff;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author coppolo
 */
@Repository
public interface StaffMapper {
    /**
     * 删除菜品
     * @param sId
     * @return
     */
    int deleteByPrimaryKey(Integer sId);

    /**
     * 添加员工
     * @param record
     * @return
     */
    int insert(Staff record);

    /**
     * 查询一个员工
     * @param sId
     * @return
     */
    Staff selectByPrimaryKey(Integer sId);

    /**
     * 修改员工信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Staff record);

    /**
     * 查询所有员工
     * @return
     */
    List<Staff> findAllStaff();


    /**
     * 模糊查询员工信息
     * @param sName
     * @return
     */
    List<Staff> findByName(@Param("sName") String sName);
}