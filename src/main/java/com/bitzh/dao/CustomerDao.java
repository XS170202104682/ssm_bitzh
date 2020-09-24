package com.bitzh.dao;
import com.bitzh.domain.Customer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface CustomerDao {
    /**
     * 查询顾客信息
     * @return
     */
    @Select("select * from t_customer")
    public List<Customer> selectAll();

    /**
     * 模糊查询
     */
    @Select("select * from t_customer where U_Name like CONCAT(CONCAT('%',#{name},'%'))")
    public List<Customer> findByName( String name);

    /**
     * 删除顾客信息
     */
    @Delete("delete from t_customer where U_ID = #{id}")
    int delete(int id);

}
