package com.example.springbootmybatisgenerator.dao.mapper;

import com.example.springbootmybatisgenerator.dao.entity.SpSchool;

public interface SpSchoolMapper {
    int deleteByPrimaryKey(String schoolId);

    int insert(SpSchool record);

    int insertSelective(SpSchool record);

    SpSchool selectByPrimaryKey(String schoolId);

    int updateByPrimaryKeySelective(SpSchool record);

    int updateByPrimaryKey(SpSchool record);
}