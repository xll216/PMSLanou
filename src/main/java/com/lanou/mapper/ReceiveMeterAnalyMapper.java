package com.lanou.mapper;

import com.lanou.domain.ReceiveMeterAnaly;

public interface ReceiveMeterAnalyMapper {
    int deleteByPrimaryKey(String meteranalyId);

    int insert(ReceiveMeterAnaly record);

    int insertSelective(ReceiveMeterAnaly record);

    ReceiveMeterAnaly selectByPrimaryKey(String meteranalyId);

    int updateByPrimaryKeySelective(ReceiveMeterAnaly record);

    int updateByPrimaryKey(ReceiveMeterAnaly record);
}