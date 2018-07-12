package com.xwx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xwx.dao.UserMapper;
import com.xwx.model.User;
@Service("userService")
public class UserService {
	
	@Autowired
	private UserMapper UserMapper;
	
	public UserMapper getUserMapper() {
		return UserMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		UserMapper = userMapper;
	}

	public User getUserById(int id){
		User u = UserMapper.selectByPrimaryKey(id);
		return u;
	}
	
	public int updateByPrimaryKey(User user){
		return UserMapper.updateByPrimaryKey(user);
	}

	public List<User> selectAll(User user) {
		return  UserMapper.selectAll(user);
	}
	
	public int insert(User user){
		return UserMapper.insert(user);
	}
	
	public int deleteByPrimaryKey(int id){
		return UserMapper.deleteByPrimaryKey(id);
	}
}
