package com.lanou.mapper;

import com.lanou.domain.BimsBusiObj;

public interface BimsBusiObjMapper {
    int deleteByPrimaryKey(String bimsId);

    int insert(BimsBusiObj record);

    int insertSelective(BimsBusiObj record);

    BimsBusiObj selectByPrimaryKey(String bimsId);

    int updateByPrimaryKeySelective(BimsBusiObj record);

    int updateByPrimaryKey(BimsBusiObj record);
}