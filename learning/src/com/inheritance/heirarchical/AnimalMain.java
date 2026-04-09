package com.inheritance.heirarchical;

public class AnimalMain {
	
		public static void main(String[] args) {
			Animal mammal=new Mammal("Lion", "savannah", true);
			Mammal m1=(Mammal) mammal;
			m1.displayHabitate();
			System.out.println("=============");
			Animal bird=new Bird("eagle","Forest", true);
			Bird b=(Bird) bird;
			b.displayBirdInfo();
			System.out.println("==============");
			Animal reptile=new Reptile("snake", "desert", true);
			Reptile r=(Reptile) reptile;
			r.displayReptileInfo();
			
		}
	}


