package com.tszj.dashboard.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created with IntelliJ IDEA.
 * User: ck01-392
 * Date: 13-12-2
 * Time: 下午3:22
 * To change this template use File | Settings | File Templates.
 */
public class AuthRole implements GrantedAuthority {

	private int id;
	private boolean enable;
	private String role;

	@Override
	public String getAuthority() {
		return getRole();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
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
