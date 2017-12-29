package com.lanou.mapper;

import com.lanou.domain.PMSBaseDepartment;
import com.lanou.util.SearchBean;

import java.util.List;

public interface PMSBaseDepartmentMapper {
    int deleteByPrimaryKey(Integer depid);

    int insert(PMSBaseDepartment record);

    int insertSelective(PMSBaseDepartment record);

    PMSBaseDepartment selectByPrimaryKey(Integer depid);

    int updateByPrimaryKeySelective(PMSBaseDepartment record);

    int updateByPrimaryKey(PMSBaseDepartment record);

    List<PMSBaseDepartment> selectAll();

    List<PMSBaseDepartment> selectBySelecttive(SearchBean searchBean);

    String selectMaxKey();
}