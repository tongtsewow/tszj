package com.tszj.dashboard.service.impl;


import com.tszj.dashboard.dao.AuthUserDAO;
import com.tszj.dashboard.model.AuthCongfigAttribute;
import com.tszj.dashboard.model.AuthResource;
import com.tszj.dashboard.model.AuthUser;
import com.tszj.dashboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: ck01-392
 * Date: 13-12-2
 * Time: 下午12:07
 *
 * @author tong
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	AuthUserDAO dao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AuthUser user = dao.getAuthUserByName(username);
		user.setAuthRoles(dao.getAuthRoleByName(username));
		return user;
	}

	@Override
	public List<AuthCongfigAttribute> getAllAuthCongfigAttribute() {
		return dao.getAllAuthCongfigAttribute();
	}

	@Override
	public List<AuthCongfigAttribute> getAuthCongfigAttributeByResource(String url) {
		return dao.getAuthCongfigAttributeByResource(url);
	}

	@Override
	public List<AuthResource> getAuthResources(String userName) {
		return dao.getAuthResources(userName);
	}
}
