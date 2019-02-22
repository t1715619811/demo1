package com.baizhi.service;



import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminDao adminDao;

	public List<Admin> getAll() {
		return adminDao.getAll();
	}


}
