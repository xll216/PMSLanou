package com.lanou.mapper;

import com.lanou.domain.HradiationWorkCheck;

public interface HradiationWorkCheckMapper {
    int deleteByPrimaryKey(String workcheckId);

    int insert(HradiationWorkCheck record);

    int insertSelective(HradiationWorkCheck record);

    HradiationWorkCheck selectByPrimaryKey(String workcheckId);

    int updateByPrimaryKeySelective(HradiationWorkCheck record);

    int updateByPrimaryKey(HradiationWorkCheck record);
}