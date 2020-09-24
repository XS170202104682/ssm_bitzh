package com.bitzh.dao;


import com.bitzh.domain.Order;
import com.bitzh.domain.OrderCustom;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface OrderDao {
    /**
     * 查询订单信息
     * @return
     */
    @Select("select * from t_order o ,t_customer u,t_caete c where o.O_UserID=u.U_ID and o.O_MenuID=c.C_ID")
     List<OrderCustom>  selectAll();


/**
 * 删除订单
 *
 */
@Delete("delete from t_order where O_ID = #{id}")
   int delete(int id);


/**
 * 模糊查询
 */

    @Select("select * from t_order o ,t_customer u,t_caete c where o.O_UserID=u.U_ID and o.O_MenuID=c.C_ID and u.U_Name like CONCAT(CONCAT('%',#{name},'%')) ")
     List<OrderCustom> findByName(String name);

    /**
     * 修改订单状态
     */
    @Update("update t_order set O_Status = #{oStatus} where O_ID = #{oId}")
     int update(OrderCustom order);

    /**
     * 修改前查询
     * @param oId
     * @return
     */
    @Select("select * from t_order where O_ID= #{oId}")
     OrderCustom get(@Param("oId") int oId);
}