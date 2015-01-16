package fr.ape.test.ejb;

import javax.ejb.Local;

import fr.ape.test.data.User;

@Local
public interface UserLocal {

	public User createUser(final String pFirstName, final String pLastName);
}
