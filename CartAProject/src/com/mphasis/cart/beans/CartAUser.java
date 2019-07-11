package com.mphasis.cart.beans;

public class CartAUser {
	private int userid;
	private String username;
	private String email;
	private String password;
	private String dor;
	private long credit;
	private String gender;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDor() {
		return dor;
	}
	public void setDor(String dor) {
		this.dor = dor;
	}
	public long getCredit() {
		return credit;
	}
	public void setCredit(long credit) {
		this.credit = credit;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "CartAUser [userid=" + userid + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", dor=" + dor + ", credit=" + credit + ", gender=" + gender + "]";
	}
	
	

}
