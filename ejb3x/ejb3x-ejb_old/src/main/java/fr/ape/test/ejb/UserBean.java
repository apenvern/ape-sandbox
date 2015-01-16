package fr.ape.test.ejb;

import javax.ejb.Stateless;

import fr.ape.test.data.User;

@Stateless
public class UserBean implements UserLocal, UserRemote {

	public User createUser(final String pFirstName, final String pLastName){
		User user = new User();
		user.setFirstName(pFirstName);
		user.setLastName(pLastName);
		user.setEmail(pFirstName+"."+pLastName+"@gmail.com");
		return user;
	}
	
}
