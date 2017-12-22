package com.lanou.mapper;

import com.lanou.domain.HradiationRxRiskcontrol;

public interface HradiationRxRiskcontrolMapper {
    int deleteByPrimaryKey(String riskcontrId);

    int insert(HradiationRxRiskcontrol record);

    int insertSelective(HradiationRxRiskcontrol record);

    HradiationRxRiskcontrol selectByPrimaryKey(String riskcontrId);

    int updateByPrimaryKeySelective(HradiationRxRiskcontrol record);

    int updateByPrimaryKey(HradiationRxRiskcontrol record);
}