package demo;

public class manager extends Employee {
  private String Department;

public manager(int empid, String empname, String department) {
	super(empid, empname);
	this.Department = department;
}

public String getDepartment() {
	return Department;
}

public void setDepartment(String department) {
	Department = department;
}

@Override
public void displayDetails() {
	// TODO Auto-generated method stub
	System.out.println("MANAGER");
	super.displayDetails();
	System.out.println("Department:" + getDepartment());
	System.out.println("---------------------------------------");
}
  
}
