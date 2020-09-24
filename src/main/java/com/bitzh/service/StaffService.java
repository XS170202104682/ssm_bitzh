package com.bitzh.service;

import com.bitzh.domain.Staff;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author coppolo
 */
public interface StaffService{

    /**
     * 删除员工
     * @param sId
     * @return
     */
    int deleteByPrimaryKey(Integer sId);

    /**
     * 插入员工
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
     * 模糊查询员工
     * @param sName
     * @return
     */
    List<Staff> findByName(@Param("sName") String sName);

}
