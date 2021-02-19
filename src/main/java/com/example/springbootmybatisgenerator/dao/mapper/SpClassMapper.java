package com.example.springbootmybatisgenerator.dao.mapper;

import com.example.springbootmybatisgenerator.dao.entity.SpClass;

public interface SpClassMapper {
    int deleteByPrimaryKey(String classId);

    int insert(SpClass record);

    int insertSelective(SpClass record);

    SpClass selectByPrimaryKey(String classId);

    int updateByPrimaryKeySelective(SpClass record);

    int updateByPrimaryKey(SpClass record);
}