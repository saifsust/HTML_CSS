package com.springframework.mysqltables;

public class Registration {
	private int user_reg_id;
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;

	public Registration() {

	}

	public Registration(String firstName, String lastName, String userName, String email, String password) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	public Registration(int user_reg_id, String firstName, String lastName, String email, String userName,
			String password) {
		this.user_reg_id = user_reg_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	public int getUser_reg_id() {
		return user_reg_id;
	}

	public void setUser_reg_id(int user_reg_id) {
		this.user_reg_id = user_reg_id;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Registration [user_reg_id=" + user_reg_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", userName=" + userName + ", password=" + password + "]";
	}

}
