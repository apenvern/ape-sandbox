package fr.ape.test.spring.web.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.ape.test.spring.data.User;

/**
 * Restcontroller for Users. @RestController annotation is the same as @Controller annotation, but
 * assuming that @ResponseBody is active by default, so all the json are parsed to java objects.
 * 
 * In RESTful GET is for find/load, PUT is update/replace, POST is create and DELETE is for delete.
 * 
 * @author apenvern
 */
@RestController
@RequestMapping("/services/users")
public class UserController {

  private Map<UUID, User> usersCache = new HashMap<UUID, User>();

  /**
   * Return user by id. Methode.GET isn't necessary by default is GET.
   */
  @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
  public User getUser(@PathVariable("userId") UUID pUserId) {
    return usersCache.get(pUserId);
  }

  /**
   * Create a new user.
   */
  @RequestMapping(value = "/new", method = RequestMethod.GET)
  public User initUser() {
    User user = new User();
    user.setFirstName("Dupont");
    user.setLastName("Jean");
    user.setEmail("dupont.jean@gmail.com");
    return user;
  }

  /**
   * Create a new user.
   */
  @RequestMapping(method = RequestMethod.POST)
  public User createUser(@RequestBody User pUser) {
    usersCache.put(pUser.getId(), pUser);
    return pUser;
  }

  /**
   * Delete user by id.
   */
  @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
  public boolean deleteUser(@PathVariable("userId") UUID pUserId) {
    usersCache.remove(pUserId);
    return true;
  }

  /**
   * Update a User.
   */
  @RequestMapping(method = RequestMethod.PUT)
  public User updateUser(@RequestBody User pUser) {
    usersCache.put(pUser.getId(), pUser);
    return pUser;
  }
}
