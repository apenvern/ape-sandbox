package fr.ape.test.data;

import java.io.Serializable;
import java.util.UUID;

public class User implements Serializable {

	private static final long serialVersionUID = -8649933848216513482L;

	private UUID id = UUID.randomUUID();
	private String firstName;
	private String lastName;
	private String email;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String toString(){
		StringBuilder strBld = new StringBuilder("User[");
		strBld.append("firstName:").append(firstName);
		strBld.append(",lastName:").append(lastName);
		strBld.append(",email:").append(email);
		strBld.append(",id:").append(id);
		strBld.append("]");
		return strBld.toString();
	}
}
