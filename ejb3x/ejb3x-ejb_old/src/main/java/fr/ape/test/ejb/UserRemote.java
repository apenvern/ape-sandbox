package fr.ape.test.ejb;

import javax.ejb.Remote;

import fr.ape.test.data.User;

@Remote
public interface UserRemote {

	public User createUser(final String pFirstName, final String pLastName);
}
