package demo;

public class Employee {
	private int empid;
	private String Empname;
	public Employee(int empid, String Empname) {
		this.empid = empid;
		this.Empname = Empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	
	 public void displayDetails(){
		 System.out.println("EmpId :" + getEmpid());
		 System.out.println("Empname :" + getEmpname());
		 
		 }
	
	

}
