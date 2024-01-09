package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class service {
@Autowired
JdbcTemplate jt;
int insert(@RequestBody pojo o) {
	int id=o.getId();
	String name=o.getName();
	String branch=o.getBranch();
	String sql="insert into clginfo values(?,?,?)";
	return jt.update(sql,id,name,branch);
}

}
