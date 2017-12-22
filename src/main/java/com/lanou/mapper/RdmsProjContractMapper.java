package com.lanou.mapper;

import com.lanou.domain.RdmsProjContract;

public interface RdmsProjContractMapper {
    int deleteByPrimaryKey(String contractId);

    int insert(RdmsProjContract record);

    int insertSelective(RdmsProjContract record);

    RdmsProjContract selectByPrimaryKey(String contractId);

    int updateByPrimaryKeySelective(RdmsProjContract record);

    int updateByPrimaryKey(RdmsProjContract record);
}