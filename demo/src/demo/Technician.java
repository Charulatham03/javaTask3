package demo;

public class Technician extends Employee{
	private String Specialization;

	public Technician(int empid, String empname,String specialization) {
		super( empid,empname);
		this.Specialization = specialization;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("TECHNICIAN :");
		super.displayDetails();
		System.out.println("Specialization :" + getSpecialization() );
	}
	
	

}
