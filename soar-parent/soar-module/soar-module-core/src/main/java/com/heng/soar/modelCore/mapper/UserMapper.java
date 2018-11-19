package com.heng.soar.modelCore.mapper;

import java.util.List;

import com.heng.soar.model.Role;
import com.heng.soar.model.User;

public interface UserMapper {
	User getUserByName(String name);
	
	List<Role> getRolesByUser(User user);
	
}