package dao.impl;

import java.util.List;
import java.util.Objects;

import dao.UserDao;
import database.Database;
import domain.User;

@SuppressWarnings("unchecked")
public class UserDaoImpl implements UserDao {

	@Override
	public List<User> getAll() {
		List<User> list = (List<User>) Database.getServletContext().getAttribute("users");
		return list;
	}

	@Override
	public List<User> getAllOnline() {
		List<User> list = (List<User>) Database.getServletContext().getAttribute("onlineUsers");
		return list;
	}

	@Override
	public void save(User user) {
		List<User> list = (List<User>) Database.getServletContext().getAttribute("users");
		list.add(user);
		Database.getServletContext().setAttribute("users", list);
	}

	@Override
	public User findByUsername(String username) {
		for (User user : getAll()) {
			if (Objects.equals(username, user.getUsername())) {
				return user;
			}
		}
		return null;
	}

}
