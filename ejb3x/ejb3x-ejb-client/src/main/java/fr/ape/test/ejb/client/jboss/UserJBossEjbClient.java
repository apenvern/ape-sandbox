package fr.ape.test.ejb.client.jboss;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import fr.ape.test.ejb.UserBeanRemote;

public class UserJBossEjbClient {

	private Context context = null;

	public static void main(String[] args) throws Exception {
		UserJBossEjbClient ejbClient = new UserJBossEjbClient();
		ejbClient.createInitialContext();
		UserBeanRemote beanRemote = ejbClient.lookup();
		System.out.println(beanRemote.createUser("Toto", "Titi").toString());
	}

	public UserBeanRemote lookup() throws NamingException {
		return (UserBeanRemote) context.lookup("ejb3x-web/UserBean!fr.ape.test.ejb.UserBeanRemote");
	}
	
	public void createInitialContext() throws NamingException {
		Properties props = new Properties();
		props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		props.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		props.put("jboss.naming.client.ejb.context", true);
		context = new InitialContext(props);
	}

}
