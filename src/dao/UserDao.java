package dao;

import java.util.List;

import domain.User;

public interface UserDao {
	
	public List<User> getAll();

	public List<User> getAllOnline();

	public void save(User user);

}
