package fr.ape.test.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.ape.test.data.User;

@Stateless
@Path("/users")
public class EjbRestWithInjection {

	@EJB
	private UserBeanLocal userBean;

	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User create(User pUser) {
		return userBean.createUser(pUser.getFirstName(), pUser.getLastName());
	}

	@GET
	@Path("/findByName/{name}/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> findByname(@PathParam("name") String pName) {
		return userBean.findUserByName(pName);
	}

}
