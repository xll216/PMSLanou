package com.lanou.mapper;

import com.lanou.domain.PmsRelaStaff;

public interface PmsRelaStaffMapper {
    int deleteByPrimaryKey(String relaId);

    int insert(PmsRelaStaff record);

    int insertSelective(PmsRelaStaff record);

    PmsRelaStaff selectByPrimaryKey(String relaId);

    int updateByPrimaryKeySelective(PmsRelaStaff record);

    int updateByPrimaryKey(PmsRelaStaff record);
}