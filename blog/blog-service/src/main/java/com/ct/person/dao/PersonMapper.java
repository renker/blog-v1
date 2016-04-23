package com.ct.person.dao;


import com.ct.base.mapper.BaseMapper;
import com.ct.person.entity.Person;

public interface PersonMapper extends BaseMapper{
    int deleteByPrimaryKey(Long id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}