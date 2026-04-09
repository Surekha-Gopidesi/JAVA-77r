package oopstask;

public abstract class Employee {
	private String employeeId;
	private String name;
	public Employee(String employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}
	abstract double calculateSalary();
	abstract void displayDetails();
	protected void printBaseInfo() {
		System.out.println("Employee Name :"+name);
		System.out.println("Employee Id :"+employeeId);
	}
	

}
class FacultyMember extends Employee{
	private int departmentCode;
	private int yearsOfExperience;
	public FacultyMember(String employeeId, String name, int departmentCode, int yearsOfExperience) {
		super(employeeId, name);
		this.departmentCode = departmentCode;
		this.yearsOfExperience = yearsOfExperience;
	}
	@Override
	double calculateSalary() {
		double baseSalary=50000;
		double experienceBonus=1000;
		return baseSalary+(yearsOfExperience*experienceBonus);
	}
	@Override
	void displayDetails() {
	super.printBaseInfo();
	System.out.println("Department code :"+departmentCode);
	System.out.println("Years of experience :"+yearsOfExperience);
	System.out.println("Montly salary :"+this.calculateSalary());
		
	}
	
	
}
class StaffMember extends Employee{
	private String designation;
	private double overTimeHours;
	public StaffMember(String employeeId, String name, String designation, double overTimeHours) {
		super(employeeId, name);
		this.designation = designation;
		this.overTimeHours = overTimeHours;
	}
	@Override
	double calculateSalary() {
		double baseSalary=40000;
		double pay=25;
		
		return 40000+(pay*overTimeHours);
	}
	@Override
	void displayDetails() {
		super.printBaseInfo();
		System.out.println("Employee Designation :"+designation);
		System.out.println("Employee over Time Hours :"+overTimeHours);
		System.out.println("Monthly salary :"+this.calculateSalary());
	}
	
	
	
	
}
