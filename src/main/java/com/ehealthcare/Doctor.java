package com.ehealthcare;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
		  private String name;
		  private String gender;
		  private String specialist;
		  private String address;
		  private long mobile;
		  private String email;
		  @Id
		  private String username;
		  private String password;
		  private int authcode;
		  private String status;
		   
		public Doctor(String name, String gender, String specialist, String address, long mobile, String email,
				String username, String password) {
			super();
			this.name = name;
			this.gender = gender;
			this.specialist = specialist;
			this.address = address;
			this.mobile = mobile;
			this.email = email;
			this.username = username;
			this.password = password;
		}
		
		public Doctor() {
			super();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	public String getGender() {
		return gender;
	}

		public void setGender(String gender) {
		this.gender = gender;
	}

		public String getSpecialist() {
			return specialist;
		}

		public void setSpecialist(String specialist) {
			this.specialist = specialist;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public long getMobile() {
			return mobile;
		}

		public void setMobile(long mobile) {
			this.mobile = mobile;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getAuthcode() {
			return authcode;
		}

		public void setAuthcode(int authcode) {
			this.authcode = authcode;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "Doctor [name=" + name + ", gender=" + gender + ", specialist=" + specialist + ", address=" + address
					+ ", mobile=" + mobile + ", email=" + email + ", username=" + username + ", password=" + password
					+ "]";
		}
		
		
		   
}
