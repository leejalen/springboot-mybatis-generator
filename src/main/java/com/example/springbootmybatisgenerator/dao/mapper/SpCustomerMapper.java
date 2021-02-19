package com.example.springbootmybatisgenerator.dao.mapper;

import com.example.springbootmybatisgenerator.dao.entity.SpCustomer;

public interface SpCustomerMapper {
    int deleteByPrimaryKey(String customerId);

    int insert(SpCustomer record);

    int insertSelective(SpCustomer record);

    SpCustomer selectByPrimaryKey(String customerId);

    int updateByPrimaryKeySelective(SpCustomer record);

    int updateByPrimaryKey(SpCustomer record);
}