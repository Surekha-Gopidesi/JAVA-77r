package com.functionalInteface;
import java.util.function.Function;

public class SensorData {
	private double temparature;
	private double humidity;
	public SensorData(double temparature, double humidity) {
		super();
		this.temparature = temparature;
		this.humidity = humidity;
	}
	public double getTemparature() {
		return temparature;
	}
	public void setTemparature(double temparature) {
		this.temparature = temparature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	@Override
	public String toString() {
		return "SensorData [temparature=" + temparature + ", humidity=" + humidity + "]";
	}
	

}


