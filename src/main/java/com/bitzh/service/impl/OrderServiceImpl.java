package com.bitzh.service.impl;


import com.bitzh.dao.OrderDao;
import com.bitzh.domain.Order;
import com.bitzh.domain.OrderCustom;
import com.bitzh.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    /**
     * 查询订单
     * @return
     */
    @Override
    public List<OrderCustom> selectAll(){
        orderDao.selectAll();
        return orderDao.selectAll();
    }

    /**
     * 删除订单
     * @return
     */

    @Override
    public int delete(int id) {
        orderDao.delete(id);
        return orderDao.delete(id);
    }

    /**
     * 模糊查询
     */
    @Override
    public List<OrderCustom> findByName(String  name) {
        return orderDao.findByName(name);
    }

    /**
     * 更新订单状态
     */
    @Override
    public int update(OrderCustom order) {
        return orderDao.update(order);
    }
    @Override
    public OrderCustom get(int oId){
        return orderDao.get(oId);
    }

}
