package task1;

public class Circle {
	static int radius=5;      // Static variable
	public static void area() {    // static method
		double area=2*3.14*radius* radius;
		System.out.println("Area of circle"+area);
		
	}
	public static void perimeter() {
		double perimeter=2*3.14*radius;
		System.out.println("perimeter of the circle"+perimeter);
		
	}

	public static void main(String[] args) {
		area();
		perimeter();


	}

}
