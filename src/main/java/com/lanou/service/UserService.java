package com.lanou.service;

import com.lanou.domain.PMSBaseDepartment;
import com.lanou.util.SearchBean;

import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public interface UserService {

    List<PMSBaseDepartment> selectAll();

    List<PMSBaseDepartment> selectBySelecttive(SearchBean searchBean);
}
