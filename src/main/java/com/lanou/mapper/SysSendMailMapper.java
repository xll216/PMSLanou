package com.lanou.mapper;

import com.lanou.domain.SysSendMail;

public interface SysSendMailMapper {
    int deleteByPrimaryKey(String emailId);

    int insert(SysSendMail record);

    int insertSelective(SysSendMail record);

    SysSendMail selectByPrimaryKey(String emailId);

    int updateByPrimaryKeySelective(SysSendMail record);

    int updateByPrimaryKey(SysSendMail record);
}