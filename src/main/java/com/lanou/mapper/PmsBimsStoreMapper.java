package com.lanou.mapper;

import com.lanou.domain.PmsBimsStore;

public interface PmsBimsStoreMapper {
    int deleteByPrimaryKey(String bimsStoreId);

    int insert(PmsBimsStore record);

    int insertSelective(PmsBimsStore record);

    PmsBimsStore selectByPrimaryKey(String bimsStoreId);

    int updateByPrimaryKeySelective(PmsBimsStore record);

    int updateByPrimaryKey(PmsBimsStore record);
}