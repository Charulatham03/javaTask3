package demo;

public class Main {
	public static void main(String[]args) {
		manager Manager = new manager(101,"Suresh", "IT");
		Manager.displayDetails();
		Technician technician = new Technician(102,"ramesh","electronics");
		technician.displayDetails();
		
	}

}
