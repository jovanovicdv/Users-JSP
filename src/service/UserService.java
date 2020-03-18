package service;

import java.util.List;

import domain.User;

public interface UserService {

	List<User> getAll();
	List<User> getAllOnline();
	void save (User user);

}
