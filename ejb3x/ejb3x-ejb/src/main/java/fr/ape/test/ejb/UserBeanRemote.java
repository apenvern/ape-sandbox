package fr.ape.test.ejb;

import java.util.List;

import javax.ejb.Remote;

import fr.ape.test.data.User;

@Remote
public interface UserBeanRemote {

	public User createUser(final String pFirstName, final String pLastName);
	public List<User> findUserByName(String pName);
	
}
