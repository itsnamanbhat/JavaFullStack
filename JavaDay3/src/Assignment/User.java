package Assignment;

public class User {
	String name;
	String username;
	String email;
	String id;
	
	
	 public User(String name, String username, String email, String id) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.id = id;
	}


	public User() {
		super();
	}

	

	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", email=" + email + ", id=" + id + "]";
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	public void display()	{
		 System.out.println("From user");
	 }
}

