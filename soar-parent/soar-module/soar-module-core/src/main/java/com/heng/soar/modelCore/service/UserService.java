package com.heng.soar.modelCore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heng.soar.model.Role;
import com.heng.soar.model.User;
import com.heng.soar.modelCore.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public User getUserByName(String name) {
		return userMapper.getUserByName(name);
	}

	/**
	 * 获取用户的角色及权限信息
	 * 
	 * @param user
	 * @return
	 */
	public List<Role> getRolesByUser(User user) {

		return userMapper.getRolesByUser(user);

	}
}
