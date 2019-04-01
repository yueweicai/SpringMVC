package com.orilore.service;

import java.util.List;
import java.util.Map;

import com.orilore.dao.ISchoolDAO;

public class SchoolService implements ISchoolService {
	private ISchoolDAO dao;
	public void setDao(ISchoolDAO dao){
		this.dao = dao;
	}
	
	@Override
	public List<Map<String,Object>> query() {
		return this.dao.select();
	}
}
