package com.functionalInteface;

import java.util.function.Function;

class Demo{
	public static void main(String[] args) {
		SensorData sd=new SensorData(36.2, 60.2);
		Function<SensorData,Double>f=new Function<SensorData,Double>(){

			@Override
			public Double apply(SensorData t) {
				// TODO Auto-generated method stub
				return sd.getTemparature();
			}
			
		};
		Double temp= f.apply(sd);
		System.out.println("Extracted Temparature :"+temp);
		
		Function <Double,Boolean> f2=new Function<Double,Boolean >(){

			@Override
			public Boolean apply(Double t) {
				double thershold=25.0;
				// TODO Auto-generated method stub
				if(t>=thershold) {
					return true;
				}
				return false;
			}
			
		};
		System.out.println(f2.apply(temp));
	}
	
}
