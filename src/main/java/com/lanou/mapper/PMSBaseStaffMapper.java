package com.lanou.mapper;

import com.lanou.domain.PMSBaseStaff;
import com.lanou.util.SearchBean;

import java.util.List;

public interface PMSBaseStaffMapper {
    int deleteByPrimaryKey(Integer staffid);

    int insert(PMSBaseStaff record);

    int insertSelective(PMSBaseStaff record);

    PMSBaseStaff selectByPrimaryKey(Integer staffid);

    int updateByPrimaryKeySelective(PMSBaseStaff record);

    int updateByPrimaryKey(PMSBaseStaff record);

    List<PMSBaseStaff> selectBySelecttive(SearchBean searchBean);
}