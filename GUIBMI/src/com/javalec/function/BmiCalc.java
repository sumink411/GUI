package com.javalec.function;

import javax.swing.ImageIcon;

import com.javalec.base.Main;

public class BmiCalc {
	
	
	double weight; 
	double height;
	String result = "";
	
	
	public BmiCalc() {
		// TODO Auto-generated constructor stub
	}


	public BmiCalc(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	
	
	
	public double calcBmi() {
		height = height / 100; 
		double bmi = weight / (height * height);
		
		bmi = Math.round(bmi*10)/10.0;

		
		return bmi; 
		
	}
	
	public String showResult(double bmi) {
		
		String result = ""; 	
		
		if (bmi>=30) {
			result= "고도비만";
		}else if (bmi>=25) {
			result = "비만";				
		}else if (bmi>=23) {
			result = "과체중";
		}else if (bmi>=18.5) {
			result ="정상체중";			
		}else {
			result = "저체중";
		}
		return result;
	}
	
	
	
	public String showImage(double bmi) {
		
		String result = ""; 	
		
		if (bmi>=30) {
			result= "obese";
		}else if (bmi>=25) {
			result = "overweight";				
		}else if (bmi>=23) {
			result = "risk";
		}else if (bmi>=18.5) {
			result ="normal";			
		}else {
			result = "underweight";
		}
		return result;

	
	}


	
	
	
	
	
	
	
	
	

}
