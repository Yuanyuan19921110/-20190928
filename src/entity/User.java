package entity;

public class User {
//�޲�
      public User() {
		super();
	}
	public User() {
		super();
	}
	public User() {
		super();
	}
 //�в�
	public User(int id, String uname, int age) {
		super();
		this.id = id;
		Uname = uname;
		Age = age;
	}
	public User() {
		super();
	}
	public User(int id, String uname, int age) {
		super();
		this.id = id;
		Uname = uname;
		Age = age;
	}
	private int id;//���캯������������
      private String Uname;
      private int Age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", Uname=" + Uname + ", Age=" + Age + "]";
	}
	
	
	}
    



