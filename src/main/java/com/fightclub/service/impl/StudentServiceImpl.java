package com.fightclub.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fightclub.dao.UserDao;
import com.fightclub.model.User;
import com.fightclub.service.UserService;

@Service
public class StudentServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Transactional
	public void add(User user) {
		userDao.add(user);
	}

	@Transactional
	public void edit(User user) {
		userDao.edit(user);
	}

	@Transactional
	public void delete(int id) {
		userDao.delete(id);
	}

	@Transactional
	public User getUser(int id) {
		return userDao.getUser(id);
	}

	@Transactional
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

}
