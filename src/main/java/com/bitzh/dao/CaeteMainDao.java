package com.bitzh.dao;
import com.bitzh.domain.Order;
import com.bitzh.domain.Caete;
import com.bitzh.domain.OrderCustom;
import com.bitzh.domain.Shopping;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;
/*
*@庾君成
 */
public interface CaeteMainDao {

    //查看订单状态--庾君成
    @Select("select * from t_order o ,t_customer u,t_caete c where o.O_UserID=u.U_ID and o.O_MenuID=c.C_ID")
    List<Order>  selectAll();

    //服务员下单--庾君成
    int addOrder(Order order);

    //搜索购物车里的菜--庾君成
    Shopping selectShoppingById(int cId);

    //删除购物车里的菜--庾君成
    int deleteShopping(@Param("cId") int cId);

    //搜索购物车--庾君成
    List<Shopping> selectShopping();

    //将菜加入购物车--庾君成
    int addShopping(Caete caete);

    //查ID返回一个菜--庾君成
    Caete queryCaeteById(Integer cId);

    //查询全部--庾君成
    List<Caete> queryAllCaete();

    @Select("select * from t_caete where C_Name like CONCAT('%',#{cName},'%')")
    public List<Caete> findName(Caete caete);

    //查找水果类-刘梓靖
    @Select("select * from t_caete where C_Type ='水果'")
    public  List<Caete> findFruits(Caete caete);

    //查找荤菜类-刘梓靖
    @Select("select * from t_caete where C_Type = '荤菜'")
    public List<Caete>  findMeat(Caete caete);

    //查找饮料类-刘梓靖
    @Select("select * from t_caete where C_Type = '饮料'")
    public List<Caete>  findDrinks(Caete caete);

    //查找素菜类-刘梓靖
    @Select("select * from t_caete where C_Type = '素菜'")
    public List<Caete>  findVegetable(Caete caete);

    //查找其他类-刘梓靖
    @Select("select * from t_caete where C_Type = '其他'")
    public List<Caete>  findOthers(Caete caete);

}
