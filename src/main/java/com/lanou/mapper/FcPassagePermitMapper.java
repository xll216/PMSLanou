package com.lanou.mapper;

import com.lanou.domain.FcPassagePermit;

public interface FcPassagePermitMapper {
    int deleteByPrimaryKey(String fcpassPerId);

    int insert(FcPassagePermit record);

    int insertSelective(FcPassagePermit record);

    FcPassagePermit selectByPrimaryKey(String fcpassPerId);

    int updateByPrimaryKeySelective(FcPassagePermit record);

    int updateByPrimaryKey(FcPassagePermit record);
}