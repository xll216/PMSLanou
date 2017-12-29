package com.lanou.mapper;

import com.lanou.domain.RdmsProjBase;

public interface RdmsProjBaseMapper {
    int deleteByPrimaryKey(String projId);

    int insert(RdmsProjBase record);

    int insertSelective(RdmsProjBase record);

    RdmsProjBase selectByPrimaryKey(String projId);

    int updateByPrimaryKeySelective(RdmsProjBase record);

    int updateByPrimaryKey(RdmsProjBase record);

    String selectMaxKey();
}