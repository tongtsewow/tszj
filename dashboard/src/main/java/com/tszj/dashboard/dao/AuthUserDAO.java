package com.tszj.dashboard.dao;

import com.tszj.dashboard.model.AuthCongfigAttribute;
import com.tszj.dashboard.model.AuthResource;
import com.tszj.dashboard.model.AuthRole;
import com.tszj.dashboard.model.AuthUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: ck01-392
 * Date: 13-12-2
 * Time: 下午2:45
 */

@Service
public interface AuthUserDAO {

	public static String userTable = "dashboard_users";

	public static String roleTable = "dashboard_roles";
	public static String resourcesTable = "dashboard_resources";
	public static String RRTable = "dashboard_roles_resources";
	public static String URTable = "dashboard_users_roles";


	@Select("select * from " + userTable + " where ACCOUNT = #{userName}")
	public AuthUser getAuthUserByName(@Param("userName") String userName);

	@Select("select r.id  id,r.enable  enable, r.name  role from " + userTable + "  u,"+roleTable+"  r,users_roles  ur where u.account = #{userName} and ur.account_id=u.id and ur.rid = r.id")
	public List<AuthRole> getAuthRoleByName(@Param("userName") String userName);

	@Select("SELECT name  role FROM "+roleTable)
	public List<AuthCongfigAttribute> getAllAuthCongfigAttribute();

	@Select("SELECT r.name  role FROM roles  r ,resources  re,roles_resources  rre where r.id = rre.rid and re.ID = rre.rsid and re.url = #{url}")
	public List<AuthCongfigAttribute> getAuthCongfigAttributeByResource(@Param("url") String url);

	@Select("select distinct rs.id, rs.memo,rs.category,rs.url from " + userTable + "  u ,roles  r,resources  rs ,users_roles  ur , roles_resources  rr where u.ID = ur.account_id and ur.rid = r.id and r.id = rr.rid and rr.rsid=rs.ID and u.account = #{userName} order by rs.id")
	public List<AuthResource> getAuthResources(@Param("userName") String userName);


}
