package com.lanou.mapper;

import com.lanou.domain.PMSBasePost;

public interface PMSBasePostMapper {
    int deleteByPrimaryKey(Integer postid);

    int insert(PMSBasePost record);

    int insertSelective(PMSBasePost record);

    PMSBasePost selectByPrimaryKey(Integer postid);

    int updateByPrimaryKeySelective(PMSBasePost record);

    int updateByPrimaryKey(PMSBasePost record);
}