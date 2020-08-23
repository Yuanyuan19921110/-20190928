package vo;

import entity.Dept;
import entity.User;

public class VoUserDept {
    public VoUserDept(User user, Dept dept) {
		super();
		this.user = user;
		this.dept = dept;
	}
	private User user;
    private Dept dept;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "VoUserDept [user=" + user + ", dept=" + dept + "]";
	}
}
