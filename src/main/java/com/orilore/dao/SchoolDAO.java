package com.orilore.dao;

import java.util.List;
import java.util.Map;


import org.springframework.jdbc.core.JdbcTemplate;


public class SchoolDAO implements ISchoolDAO{
	private JdbcTemplate template;
	public void setTemplate(JdbcTemplate template){
		this.template = template;
	}
	
	@Override
	public List<Map<String,Object>> select() {
		return this.template.queryForList("select * from school");
	}
}
