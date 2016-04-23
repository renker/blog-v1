package com.ct.person.dao;

import com.ct.person.entity.Person;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonMapper {

    int insertSelective(Person record);

    int updateByPrimaryKeySelective(Person record);
}