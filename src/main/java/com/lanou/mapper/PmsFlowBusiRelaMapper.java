package com.lanou.mapper;

import com.lanou.domain.PmsFlowBusiRela;

public interface PmsFlowBusiRelaMapper {
    int deleteByPrimaryKey(String relaId);

    int insert(PmsFlowBusiRela record);

    int insertSelective(PmsFlowBusiRela record);

    PmsFlowBusiRela selectByPrimaryKey(String relaId);

    int updateByPrimaryKeySelective(PmsFlowBusiRela record);

    int updateByPrimaryKey(PmsFlowBusiRela record);
}