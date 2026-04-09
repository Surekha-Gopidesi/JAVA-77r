package task3;

public class Employee {
	String employeeName="surekha";
	int employeeId=6;
	double employeeSalary=50000;
	public void addEmployeeDetails(String name,int id,double salary) {
		employeeName=name;
		employeeId=id;
		employeeSalary=salary;
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Employee Id :"+employeeId);
		System.out.println("Employee salary :"+employeeSalary);
		
	}
	public String displayDetails() {
		return "Employee Name :"+employeeName+"Employee Id :"+employeeId+"Employee salary :"+employeeSalary;
	}
	

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.addEmployeeDetails(emp.employeeName,emp.employeeId,emp.employeeSalary);
		String res=emp.displayDetails();
		System.out.println(res);

	}

}
