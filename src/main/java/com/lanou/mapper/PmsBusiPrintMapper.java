package com.lanou.mapper;

import com.lanou.domain.PmsBusiPrint;

public interface PmsBusiPrintMapper {
    int deleteByPrimaryKey(String printId);

    int insert(PmsBusiPrint record);

    int insertSelective(PmsBusiPrint record);

    PmsBusiPrint selectByPrimaryKey(String printId);

    int updateByPrimaryKeySelective(PmsBusiPrint record);

    int updateByPrimaryKey(PmsBusiPrint record);
}