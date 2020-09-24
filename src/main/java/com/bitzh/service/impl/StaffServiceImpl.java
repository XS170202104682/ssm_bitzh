package com.bitzh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.bitzh.domain.Staff;
import com.bitzh.dao.StaffMapper;
import com.bitzh.service.StaffService;

import java.util.List;
/**
 * @author coppolo
 */
@Service
public class StaffServiceImpl implements StaffService{

    @Autowired
    private StaffMapper staffMapper;

    public void setStaffMapper(StaffMapper staffMapper) {
        this.staffMapper = staffMapper;
    }

    /**
     * 删除员工
     * @param sId
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer sId) {
        return staffMapper.deleteByPrimaryKey(sId);
    }

    /**
     * 添加员工
     * @param record
     * @return
     */
    @Override
    public int insert(Staff record) {
        return staffMapper.insert(record);
    }

    /**
     * 查询一个员工
     * @param sId
     * @return
     */
    @Override
    public Staff selectByPrimaryKey(Integer sId) {
        return staffMapper.selectByPrimaryKey(sId);
    }

    /**
     * 更新员工信息
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(Staff record) {
        return staffMapper.updateByPrimaryKey(record);
    }

    /**
     * 查询所有员工
     * @return
     */
    @Override
    public List<Staff> findAllStaff() {
        return staffMapper.findAllStaff();
    }

    /**
     * 模糊查询员工
     * @param sName
     * @return
     */
    @Override
    public List<Staff> findByName(String sName) {
        return staffMapper.findByName(sName);
    }

}
