package com.ct.person.service;

import org.apache.ibatis.annotations.Param;

import com.ct.person.entity.Person;

public interface IPersonService {
	Person login(String account);
		
	Person login(@Param("account")String account,@Param("password")String password);
}
