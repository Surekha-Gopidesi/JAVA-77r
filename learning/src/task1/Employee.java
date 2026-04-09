package task1;

public class Employee {
	static int basic=20000;
	static int bonus=5000;
	public static void calculateSalary() {
		int salary=basic+bonus;
		System.out.println("Employee salary:"+salary);
		
	}

	public static void main(String[] args) {
		calculateSalary();
		

	}

}
