package entity;

public class Dept {
    public Dept(int id, String dname) {
		super();
		this.id = id;
		Dname = dname;
	}
	private int id;
    private String Dname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}


}
