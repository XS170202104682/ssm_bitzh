package com.bitzh.dao;

import com.bitzh.domain.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {
    Admin findAdmin(@Param("aAccount") String aAccount,
                           @Param("aPassword") String aPassword);
}
