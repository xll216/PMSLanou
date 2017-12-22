package com.lanou.mapper;

import com.lanou.domain.SysBusiAttachment;

public interface SysBusiAttachmentMapper {
    int deleteByPrimaryKey(String attachid);

    int insert(SysBusiAttachment record);

    int insertSelective(SysBusiAttachment record);

    SysBusiAttachment selectByPrimaryKey(String attachid);

    int updateByPrimaryKeySelective(SysBusiAttachment record);

    int updateByPrimaryKey(SysBusiAttachment record);
}