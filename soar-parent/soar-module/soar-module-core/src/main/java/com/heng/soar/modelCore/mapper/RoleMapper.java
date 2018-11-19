package com.heng.soar.modelCore.mapper;

import java.util.List;

import com.heng.soar.model.Permission;
import com.heng.soar.model.Role;

public interface RoleMapper {
	
	
	List<Permission> getPermisionByRoleId(Role role);

}
