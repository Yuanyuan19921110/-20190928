package com.softcits.test.entity;

public class User02 {
    private String useId;
    private String name;
    private int role;
	public String getUseId() {
		return useId;
	}
	public void setUseId(String useId) {
		this.useId = useId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public User02(String useId, String name, int role) {
		super();
		this.useId = useId;
		this.name = name;
		this.role = role;
	}
	public User02() {
		super();
	}
	@Override
	public String toString() {
		return "User02 [useId=" + useId + ", name=" + name + ", role=" + role + "]";
	}
}
