package com.lanou.mapper;

import com.lanou.domain.ControlareaPasspermit;

public interface ControlareaPasspermitMapper {
    int deleteByPrimaryKey(String passId);

    int insert(ControlareaPasspermit record);

    int insertSelective(ControlareaPasspermit record);

    ControlareaPasspermit selectByPrimaryKey(String passId);

    int updateByPrimaryKeySelective(ControlareaPasspermit record);

    int updateByPrimaryKey(ControlareaPasspermit record);
}