package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@Autowired
service s;
//---------insert----------------------------
@PostMapping("/insert")
String insert(@RequestBody pojo o1) {
	int i=s.insert(o1);
	try {
		if(i>0) {
			return "data inserted";
		}
		else {
			return "not inserted";
		}
	}
	catch (Exception e) {
		return e.toString();
	}
}
//----------delete---------------------------------
@PostMapping("/delete")
String update(@RequestBody pojo o1) {
	int j=s.delete(o1);
	try {
		if(j>0) {
			return "data deleted";
		}
		else {
			return "not deleted";
		}
	}
	catch (Exception e) {
		return e.toString();
	}
	
}

}
