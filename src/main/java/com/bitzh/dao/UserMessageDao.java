package com.bitzh.dao;
import com.bitzh.domain.UserMessageCustom;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMessageDao {
    /**
     * 查询所有留言信息
     * @return
     */
    @Select("select m.*,c.u_Name from t_user_message m ,t_customer c where m.M_UserID=c.U_ID")
    public List<UserMessageCustom> selectAll();

    /**
     * 模糊查询
     */
    @Select("select m.*,c.u_Name from t_user_message m ,t_customer c where m.M_UserID=c.U_ID and c.U_Name like CONCAT(CONCAT('%',#{name},'%'))")
    public List<UserMessageCustom> findByName(String name);

    /**
     * 删除留言信息
     */
    @Delete("delete from t_user_message where M_ID = #{id}")
    int delete(int id);
}
