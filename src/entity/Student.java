package entity;

public class Student {
     //нч╡н
	public Student() {
		super();
	}
	public Student(int stuNo, String name, String geger, int age) {
		super();
		this.stuNo = stuNo;
		Name = name;
		Geger = geger;
		Age = age;
	}
	private int stuNo;
     private String Name;
     private String Geger;
     private int Age;
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGeger() {
		return Geger;
	}
	public void setGeger(String geger) {
		Geger = geger;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", Name=" + Name + ", Geger=" + Geger + ", Age=" + Age + "]";
	}
     

    public static void main(String[] args) {
    	Student student=new Student();
    	student.setName("yy");
    	System.out.println(student.Name);
    }


}

