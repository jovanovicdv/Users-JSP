package service.impl;

import java.util.List;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import domain.User;
import service.UserService;

public class UserServiceImpl implements UserService {
	private final UserDao userDao;
	
	

	public UserServiceImpl() {
		super();
		this.userDao = new UserDaoImpl();
	}



	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}



	@Override
	public List<User> getAllOnline() {
		
		return userDao.getAllOnline();
	}



	@Override
	public void save(User user) {
		userDao.save(user);
		
	}

}
