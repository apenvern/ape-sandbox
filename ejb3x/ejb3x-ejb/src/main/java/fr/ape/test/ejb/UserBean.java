package fr.ape.test.ejb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import fr.ape.test.data.User;

/**
 * Session Bean implementation class UserBean
 */
@Stateless
public class UserBean implements UserBeanLocal, UserBeanRemote {

	@EJB
	private UserCacheBean userCacheBean;

	@PostConstruct
	private void init() {
	}

	public User createUser(final String pFirstName, final String pLastName) {
		User user = new User();
		user.setFirstName(pFirstName);
		user.setLastName(pLastName);
		user.setEmail(pFirstName + "." + pLastName + "@gmail.com");
		userCacheBean.addToCache(user);
		return user;
	}

	public List<User> findUserByName(String pName) {
		return userCacheBean.findUserByName(pName);
	}

}
