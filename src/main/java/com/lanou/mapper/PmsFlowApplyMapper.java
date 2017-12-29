package com.lanou.mapper;

import com.lanou.domain.PmsFlowApply;

public interface PmsFlowApplyMapper {
    int deleteByPrimaryKey(String appId);

    int insert(PmsFlowApply record);

    int insertSelective(PmsFlowApply record);

    PmsFlowApply selectByPrimaryKey(String appId);

    int updateByPrimaryKeySelective(PmsFlowApply record);

    int updateByPrimaryKey(PmsFlowApply record);

    String selectMaxKey();
}