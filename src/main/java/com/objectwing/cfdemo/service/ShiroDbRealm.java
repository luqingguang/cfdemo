package com.objectwing.cfdemo.service;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.objectwing.cfdemo.domain.Person;
import com.objectwing.cfdemo.util.StringUtil;
import com.objectwing.cfdemo.util.UserPrinciple;

public class ShiroDbRealm extends AuthorizingRealm {

	private PersonService personService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection authcToken) {

		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		String loginName = token.getUsername();

		if (!StringUtil.hasText(loginName)) {
			throw new UnknownAccountException();
		}

		Person person = null;
		person = personService.findPersonByLoginName(loginName);

		if (person == null) {
			throw new UnknownAccountException();
		} else {

			UserPrinciple userPrinciple = new UserPrinciple();
			userPrinciple.setLoginName(loginName);
			userPrinciple.setId(person.getPersonId());
			userPrinciple.setName(person.getName());
		
			return new SimpleAuthenticationInfo(userPrinciple,
					person.getPassword(),  getName());

		}

	}

	public void initCredentialsMatcher() {

		SimpleCredentialsMatcher matcher = new SimpleCredentialsMatcher();
		setCredentialsMatcher(matcher);

	}

}
