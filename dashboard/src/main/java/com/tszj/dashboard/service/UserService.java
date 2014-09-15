package com.tszj.dashboard.service;

import com.tszj.dashboard.model.AuthCongfigAttribute;
import com.tszj.dashboard.model.AuthResource;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * User: ck01-392
 * Date: 13-12-2
 * Time: 下午12:05
 *
 * @author tong
 */
public interface UserService extends UserDetailsService {

	public List<AuthCongfigAttribute> getAllAuthCongfigAttribute();

	public List<AuthCongfigAttribute> getAuthCongfigAttributeByResource(String url);

	public List<AuthResource> getAuthResources(String userName);
}
