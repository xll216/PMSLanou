package com.lanou.mapper;

import com.lanou.domain.PmsFlowappOperlog;

public interface PmsFlowappOperlogMapper {
    int deleteByPrimaryKey(String operlogId);

    int insert(PmsFlowappOperlog record);

    int insertSelective(PmsFlowappOperlog record);

    PmsFlowappOperlog selectByPrimaryKey(String operlogId);

    int updateByPrimaryKeySelective(PmsFlowappOperlog record);

    int updateByPrimaryKey(PmsFlowappOperlog record);
}