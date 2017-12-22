package com.lanou.mapper;

import com.lanou.domain.hradiation_risk_analy;

public interface hradiation_risk_analyMapper {
    int deleteByPrimaryKey(String riskanalyId);

    int insert(hradiation_risk_analy record);

    int insertSelective(hradiation_risk_analy record);

    hradiation_risk_analy selectByPrimaryKey(String riskanalyId);

    int updateByPrimaryKeySelective(hradiation_risk_analy record);

    int updateByPrimaryKey(hradiation_risk_analy record);
}