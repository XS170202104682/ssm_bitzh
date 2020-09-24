package com.bitzh.service;

import com.bitzh.domain.Caete;
import com.bitzh.domain.Order;
import com.bitzh.domain.OrderCustom;
import com.bitzh.domain.Shopping;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 *@庾君成
 * @菜品业务层
 */
public interface CaeteMainService {

    //查看订单状态
    public List<Order> selectAll();

    //服务员下单
    int addOrder(Order order);

    //搜索购物车里的菜
    Shopping selectShoppingById(Integer cId);

    //删除购物车里的菜
    int deleteShopping(Integer cId);

    //搜索购物车
    List<Shopping> selectShopping();

    //将菜加入购物车
    int addShopping(Caete caete);

    //查找菜，再加入购物车
    Caete queryCaeteById(Integer cId);

    //查询全部
    List<Caete> queryAllCaete();

    /**
     * 根据菜名模糊查询-刘梓靖
     * @param caete
     * @return
     */
    List<Caete> findName(Caete caete);

    /**
     * 查找水果类-刘梓靖
     * @param caete
     * @return
     */
    List<Caete> findFruits(Caete caete);

    /**
     * 查找荤菜类-刘梓靖
     * @param caete
     * @return
     */
    List<Caete> findMeat(Caete caete);

    /**
     * 查找查找饮料类-刘梓靖
     * @param caete
     * @return
     */
    List<Caete> findDrinks(Caete caete);

    /**
     * 查找素菜类-刘梓靖
     * @param caete
     * @return
     */
    List<Caete> findVegetable(Caete caete);

    /**
     * 查找其他类-刘梓靖
     * @param caete
     * @return
     */
    List<Caete> findOthers(Caete caete);
}
