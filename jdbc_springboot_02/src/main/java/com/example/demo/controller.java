package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@Autowired
service s;

@PostMapping("/abc")
String insert(@RequestBody pojo o) {
	int i=s.insert(o);
	try {
		if(i>0) {
			return "inserted";
			}
		else {
			return "not inserted";
		}
	}
	catch (Exception e) {
		// TODO: handle exception
		return e.getMessage();
	}
	
}

}
