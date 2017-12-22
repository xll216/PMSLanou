package com.lanou.mapper;

import com.lanou.domain.FireProtectiveDetail;

public interface FireProtectiveDetailMapper {
    int deleteByPrimaryKey(String detailId);

    int insert(FireProtectiveDetail record);

    int insertSelective(FireProtectiveDetail record);

    FireProtectiveDetail selectByPrimaryKey(String detailId);

    int updateByPrimaryKeySelective(FireProtectiveDetail record);

    int updateByPrimaryKey(FireProtectiveDetail record);
}