package blc_elc_task;

public class PayrollSystem {

	public static void main(String[] args) {
	Employee e1=new Employee();
	e1.setSalary(50000);
e1.employeeName="surekha";
e1.employeeId=4352;
System.out.println("EmployeeName :"+ e1.getEmployeeName()+"\nEmployeeId :"+e1.getEmployeeId()+"\nEmployeeSalry :"+e1.getSalary());
System.out.println("_____________");
e1.setSalary(55000);
System.out.println("modified salary :"+e1.getSalary());
	}

}
