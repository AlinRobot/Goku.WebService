package com.goku.webapi.controller;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/15.
 */
public interface SysUserController {
    String getUserByOrgid(String orgid, Integer pageNo, Integer pageSize, String orderSort, String orderFiled);
    String getUserByid(String id);
}
