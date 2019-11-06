package com.us.rk.model.dto;

public class MemberBean {

	private int memberNo;
	private String id;
	private String password;
	private String email;
	private String phone;
	private String role;
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MemberBean [memberNo=" + memberNo + ", id=" + id + ", password=" + password + ", email=" + email
				+ ", phone=" + phone + ", role=" + role + "]";
	}
	
	

	
}
