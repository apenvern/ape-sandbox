package fr.ape.test.ejb;

import java.util.List;

import javax.ejb.Local;

import fr.ape.test.data.User;

@Local
public interface UserBeanLocal {

	public User createUser(final String pFirstName, final String pLastName);
	public List<User> findUserByName(String pName);
}
