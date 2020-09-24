package com.bitzh.service;

import com.bitzh.domain.Order;
import com.bitzh.domain.OrderCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {
    /**
     * 查询订单信息
     * @return
     */
   public List<OrderCustom> selectAll();

    /**
     * 删除订单
     */

    public int delete(int id);

    /**
     * 模糊查询
     * @param name
     * @return
     */
    public List<OrderCustom> findByName(String name);



    /**
     * 更改订单状态
     */

    public int update(OrderCustom order);

    public OrderCustom get(int oId);
}
