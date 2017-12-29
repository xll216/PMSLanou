package com.lanou.mapper;

import com.lanou.domain.RdmsProjBudget;

public interface RdmsProjBudgetMapper {
    int deleteByPrimaryKey(String budDetailId);

    int insert(RdmsProjBudget record);

    int insertSelective(RdmsProjBudget record);

    RdmsProjBudget selectByPrimaryKey(String budDetailId);

    int updateByPrimaryKeySelective(RdmsProjBudget record);

    int updateByPrimaryKey(RdmsProjBudget record);

    String selectMaxKey();
}