package com.lanou.mapper;

import com.lanou.domain.ArtificialMacDrill;

public interface ArtificialMacDrillMapper {
    int deleteByPrimaryKey(String drillId);

    int insert(ArtificialMacDrill record);

    int insertSelective(ArtificialMacDrill record);

    ArtificialMacDrill selectByPrimaryKey(String drillId);

    int updateByPrimaryKeySelective(ArtificialMacDrill record);

    int updateByPrimaryKey(ArtificialMacDrill record);
}