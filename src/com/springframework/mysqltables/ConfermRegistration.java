package com.springframework.mysqltables;

public class ConfermRegistration extends Registration {
	private String confermEmail;
	private String confermPassword;

	public ConfermRegistration() {
		super();
	}

	public ConfermRegistration(String firstName, String lastName, String userName, String email, String confermEmail,
			String password, String confermPassword) {
		super(firstName, lastName, userName, email, password);
		System.out.println(firstName);
		this.confermEmail = confermEmail;
		this.confermPassword = confermPassword;
	}

	public String getConfermEmail() {
		return confermEmail;
	}

	public void setConfermEmail(String confermEmail) {
		this.confermEmail = confermEmail;
	}

	public String getConfermPassword() {
		return confermPassword;
	}

	public void setConfermPassword(String confermPassword) {
		this.confermPassword = confermPassword;
	}

	@Override
	public String toString() {
		return "ConfermRegistration [confermEmail=" + confermEmail + ", confermPassword=" + confermPassword
				+ ", getFisrtName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getEmail()="
				+ getEmail() + ", getUserName()=" + getUserName() + ", getPassword()=" + getPassword() + "]";
	}

}
