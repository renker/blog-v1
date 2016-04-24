package com.ct.person.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ct.person.dao.PersonMapper;
import com.ct.person.entity.Person;
import com.ct.person.service.IPersonService;

@Service
@Transactional
public class PersonService implements IPersonService {

	@Resource
	private PersonMapper personMapper;
	public Person login(String account) {
		return personMapper.selectByAccount(account);
	}

	public Person login(String account, String password) {
		return personMapper.selectByAccountAndPassword(account, password);
	}
	
}
