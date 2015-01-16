package fr.ape.test.ejb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

import fr.ape.test.data.User;

/**
 * Session Bean implementation class UserCacheBean
 */
@Singleton
public class UserCacheBean {

	private Map<UUID, User> usersMap;

	@PostConstruct
	private void init() {
		usersMap = new HashMap<UUID, User>();
	}

	public void addToCache(User pUser) {
		usersMap.put(pUser.getId(), pUser);
	}

	public List<User> findUserByName(String pName) {
		List<User> users = new ArrayList<User>();
		for (Entry<UUID, User> user : usersMap.entrySet()) {
			if (user.getValue().getFirstName().equals(pName)) {
				users.add(user.getValue());
			}
		}
		return users;
	}

}
