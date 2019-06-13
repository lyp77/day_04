package com.test.Service;

import com.test.DAO.UserDao;

public class UserService {
	private UserDao userDao;

		public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

		public void add() {
			System.out.println("ser1");
			userDao.add();
		}
}
