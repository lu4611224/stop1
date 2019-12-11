package com.myjdbc.dao;

import java.util.List;
import java.util.Set;

import com.myjdbc.bean.Login;
import com.myjdbc.bean.User;

public interface UserDao {
	public int addUser(User user);
	public List<User> getAll();
	public Login getLogin(String username,String password);

}
