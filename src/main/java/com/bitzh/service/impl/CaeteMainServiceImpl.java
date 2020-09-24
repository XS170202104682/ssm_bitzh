package com.bitzh.service.impl;

import com.bitzh.dao.CaeteMainDao;
import com.bitzh.domain.Caete;
import com.bitzh.domain.Order;
import com.bitzh.domain.Shopping;
import com.bitzh.service.CaeteMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
 *@庾君成
 * @菜品业务层
 */
@Service("caeteMainService")
@Transactional
public class CaeteMainServiceImpl implements CaeteMainService {
    @Autowired
    private CaeteMainDao caeteMainDao;

    public void setCaeteMainDao(CaeteMainDao caeteMainDao) {
        this.caeteMainDao = caeteMainDao;
    }

    //查看订单状态
    public List<Order> selectAll(){return  caeteMainDao.selectAll();};

    //查找菜，再加入购物车--庾君成
    @Override
    public Caete queryCaeteById(Integer cId) {
        return caeteMainDao.queryCaeteById(cId);
    }

    //查询全部--庾君成
    @Override
    public List<Caete> queryAllCaete() {
        return caeteMainDao.queryAllCaete();
    }

    //将菜加入购物车--庾君成
    @Override
    public int addShopping(Caete caete) {
        return caeteMainDao.addShopping(caete);
    }

    //搜索购物车--庾君成
    @Override
    public List<Shopping> selectShopping(){
        return caeteMainDao.selectShopping();
    }

    //删除购物车里的菜--庾君成
    @Override
    public int deleteShopping(Integer cId){
        return caeteMainDao.deleteShopping(cId);
    }

    //搜索购物车里的菜--庾君成
    @Override
    public Shopping selectShoppingById(Integer cId){
        return caeteMainDao.selectShoppingById(cId);
    }

    //服务员下单--庾君成
    @Override
    public int addOrder(Order order){
        return caeteMainDao.addOrder(order);
    }

    //根据名字中的关键字段查询菜品-刘梓靖
    @Override
    public List<Caete> findName(Caete caete) {
        return this.caeteMainDao.findName(caete);
    }

    //查找水果类-刘梓靖
    @Override
    public List<Caete> findFruits(Caete caete) {
        return  this.caeteMainDao.findFruits(caete);
    }

    //查找荤菜类-刘梓靖
    @Override
    public List<Caete> findMeat(Caete caete) {
        return this.caeteMainDao.findMeat(caete);
    }

    //查找饮料类-刘梓靖
    @Override
    public List<Caete> findDrinks(Caete caete) {
        return  this.caeteMainDao.findDrinks(caete);
    }

    //查找素菜类-刘梓靖
    @Override
    public List<Caete> findVegetable(Caete caete) {
        return this.caeteMainDao.findVegetable(caete);
    }

    //查找其他类-刘梓靖
    @Override
    public List<Caete> findOthers(Caete caete) {
        return this.caeteMainDao.findOthers(caete);
    }
}
