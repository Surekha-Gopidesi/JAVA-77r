package Tak5_11_11_25;

public class Employee {
	String name;
	double salary;
	public void increaseSalary(Employee e) {
		
		System.out.println("Updated salary of Surekha   :"+e.salary);
	int x=0;
	++x;
	System.out.println(x);
	int a = 3;
	int b = a++; /* \\ int c = ++a; */
	System.out.println(a + b );
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="surekha";
		e.salary=45000;
	e.salary=e.salary+(e.salary/10)*100;
	e.increaseSalary(e);
	}

}
