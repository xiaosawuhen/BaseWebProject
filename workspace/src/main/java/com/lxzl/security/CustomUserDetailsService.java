package com.lxzl.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.lxzl.db.bean.Customerinfo;
import com.lxzl.service.CustomerinfoService;

public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private CustomerinfoService customerinfoService;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {

		UserDetails user = null;

		try {
			Customerinfo customerinfo = customerinfoService.selectByAliasName(username);

			user = new User(customerinfo.getAliasName(), customerinfo.getPassword().toLowerCase(), true, true, true,
					true, getAuthorities(1));

		} catch (Exception e) {
			e.printStackTrace();
			throw new UsernameNotFoundException("Error in retrieving user");
		}

		return user;
	}

	/**
	 * 获得访问角色权限
	 * 
	 * @param access
	 * @return
	 */
	public Collection<GrantedAuthority> getAuthorities(Integer access) {

		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();

		// 所有的用户默认拥有ROLE_USER权限
		authList.add(new SimpleGrantedAuthority("ROLE_USER"));

		// 如果参数access为1.则拥有ROLE_ADMIN权限
		if (access.compareTo(1) == 0) {
			authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		}

		return authList;
	}
}
