package com.tszj.dashboard.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * User: ck01-392
 * Date: 13-12-2
 * Time: 下午3:06
 */
public class AuthUser implements UserDetails {

	private int id;
	private String account;
	private String password;
	private boolean enable;

	private List<AuthRole> authRoles;

	/**
	 * Returns the authorities granted to the user. Cannot return <code>null</code>.
	 *
	 * @return the authorities, sorted by natural key (never <code>null</code>)
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return getAuthRoles();
	}

	@Override
	public String getUsername() {
		return getAccount();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public boolean isEnabled() {
		return isEnable();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public List<AuthRole> getAuthRoles() {
		return authRoles;
	}

	public void setAuthRoles(List<AuthRole> authRoles) {
		this.authRoles = authRoles;
	}

	@Override
	public String toString() {
		return "AuthUser{" +
				"id=" + id +
				", account='" + account + '\'' +
				", password='" + password + '\'' +
				", enable=" + enable +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		AuthUser user = (AuthUser) o;

		if (id != user.id) return false;
		if (!account.equals(user.account)) return false;
		if (!password.equals(user.password)) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + account.hashCode();
		result = 31 * result + password.hashCode();
		return result;
	}
}
