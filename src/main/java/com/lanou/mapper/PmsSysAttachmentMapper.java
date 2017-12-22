package com.lanou.mapper;

import com.lanou.domain.PmsSysAttachment;

public interface PmsSysAttachmentMapper {
    int deleteByPrimaryKey(String attId);

    int insert(PmsSysAttachment record);

    int insertSelective(PmsSysAttachment record);

    PmsSysAttachment selectByPrimaryKey(String attId);

    int updateByPrimaryKeySelective(PmsSysAttachment record);

    int updateByPrimaryKey(PmsSysAttachment record);
}