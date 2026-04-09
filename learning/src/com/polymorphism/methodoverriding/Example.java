package com.polymorphism.methodoverriding;

	class Parents{
		public Object getAge() {
			return 40;
		}
	}
	class Child1 extends Parents{
		@Override
		public Integer getAge() {
			return 25;
		}
	}
	class Child2 extends Parents{
		@Override
		public Integer getAge() {
			return 21;
		}
	}
	public class Example {

		public static void main(String[] args) {
		      Parents x=new Child1();
		    Integer age1=(Integer)x.getAge();
		    System.out.println("Age of Child 1 :"+age1);
		    System.out.println("----------------");
		    Parents x1=new Child2();
		    Integer age2=(Integer)x1.getAge();
		    System.out.println("Age of Child 2 :"+age2);
		    System.out.println("----------------");
		}

	}

