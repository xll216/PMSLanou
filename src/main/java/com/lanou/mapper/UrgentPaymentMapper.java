package com.lanou.mapper;

import com.lanou.domain.UrgentPayment;

public interface UrgentPaymentMapper {
    int deleteByPrimaryKey(String urgpaymentId);

    int insert(UrgentPayment record);

    int insertSelective(UrgentPayment record);

    UrgentPayment selectByPrimaryKey(String urgpaymentId);

    int updateByPrimaryKeySelective(UrgentPayment record);

    int updateByPrimaryKey(UrgentPayment record);
}