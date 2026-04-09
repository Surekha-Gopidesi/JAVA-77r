package oopstask;

public class EmployeeMain {

	public static void main(String[] args) {
		FacultyMember f=new FacultyMember("34cu6", "surekha", 8, 4);
		System.out.println("Emplyee details  ");
		System.out.println("--------------------");
		f.calculateSalary();
		f.displayDetails();
		StaffMember s=new StaffMember("F343", "Rekha", "Developer",8);
		System.out.println("\nemployee etails ");
		System.out.println("----------------");
		s.displayDetails();
		s.calculateSalary();

	}

}
