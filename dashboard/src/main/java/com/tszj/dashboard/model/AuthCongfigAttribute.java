package com.tszj.dashboard.model;

import org.springframework.security.access.ConfigAttribute;

/**
 * Created with IntelliJ IDEA.
 * User: ck01-392
 * Date: 13-12-2
 * Time: 下午3:22
 * To change this template use File | Settings | File Templates.
 */
public class AuthCongfigAttribute implements ConfigAttribute {

	private String role;

	@Override
	public String getAttribute() {
		return getRole();
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "AuthRole{" +
				"role='" + role + '\'' +
				'}';
	}
}
