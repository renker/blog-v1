package com.ct.person.dao;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ct.base.mapper.BaseMapper;
import com.ct.person.entity.Person;

@Repository
public interface PersonMapper{
    int deleteByPrimaryKey(Long id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
    
    Person selectByAccount(String account);
	
	Person selectByAccountAndPassword(@Param("account")String account,@Param("password")String password);
}