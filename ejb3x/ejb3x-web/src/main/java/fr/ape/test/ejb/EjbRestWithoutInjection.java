package fr.ape.test.ejb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.ape.test.data.User;

@Stateless
@Path("/users-without-injection")
public class EjbRestWithoutInjection {
	
	UserBeanLocal beanLocal;
	
	@PostConstruct
	private void init(){
		try {
			Context context = new InitialContext();
			beanLocal = (UserBeanLocal) context.lookup("java:global/ejb3x-web/UserBean!fr.ape.test.ejb.UserBeanLocal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User create(User pUser) {
		return beanLocal.createUser(pUser.getFirstName(), pUser.getLastName());
	}

	@GET
	@Path("/findByName/{name}/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> findByname(@PathParam("name") String pName) {
		return beanLocal.findUserByName(pName);
	}

}
