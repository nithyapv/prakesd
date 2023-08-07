package aerd;

public class student {
	
	private int sid;
	
	private String sname;
	
	private String squql;
	
	
	private course[] scou;
	
	public void setSid(int sid) {
		this.sid = sid;
	}


	public int getSid() {
		return sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	


	public String getSname() {
		return sname;
	}


	public void setSquql(String squql) {
		this.squql = squql;
	}


	public String getSquql() {
		return squql;
	}


	public void setScou(course[] scou) {
		this.scou = scou;
	}


	public course[] getScou() {
		return scou;
	}


	
	
	

}
