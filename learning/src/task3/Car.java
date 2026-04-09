package task3;

public class Car {
	String carMake="Ford";
	String carmodel="BMW";
	int manufacturingYear=2023;
	public void addCarDetails( String cMake,String cModel, int mYear) {
		carMake=cMake;
		carmodel=cModel;
		manufacturingYear=mYear;
		System.out.println(carMake);
		System.out.println(carmodel);
		System.out.println(manufacturingYear);
			
	}
	public String displayDetails() {
		return "carMake : "+carMake+"carModel : " + carmodel+"manufacturingYear : "+manufacturingYear;
		
	}
	

	public static void main(String[] args) {
		Car obj=new Car();
		obj.addCarDetails("tatota","BMW",2014 );
		String res=obj.displayDetails();
		System.out.println(res);
		

	}

}
