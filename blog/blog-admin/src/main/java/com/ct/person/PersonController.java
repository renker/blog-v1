package com.ct.person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/person")
public class PersonController {
	
	@RequestMapping("index")
	public String index(){
		return "person/index";
	}
}
