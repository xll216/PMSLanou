package com.lanou.mapper;

import com.lanou.domain.GuaranteePermit;

public interface GuaranteePermitMapper {
    int deleteByPrimaryKey(String guaranteeId);

    int insert(GuaranteePermit record);

    int insertSelective(GuaranteePermit record);

    GuaranteePermit selectByPrimaryKey(String guaranteeId);

    int updateByPrimaryKeySelective(GuaranteePermit record);

    int updateByPrimaryKey(GuaranteePermit record);
}