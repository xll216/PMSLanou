package com.lanou.mapper;

import com.lanou.domain.PmsRoom;

public interface PmsRoomMapper {
    int deleteByPrimaryKey(String roomId);

    int insert(PmsRoom record);

    int insertSelective(PmsRoom record);

    PmsRoom selectByPrimaryKey(String roomId);

    int updateByPrimaryKeySelective(PmsRoom record);

    int updateByPrimaryKey(PmsRoom record);
}