package com.bitzh.service;

import com.bitzh.domain.Admin;


public interface AdminService {
    Admin findAdmin(String aAccount, String aPassword);
}
