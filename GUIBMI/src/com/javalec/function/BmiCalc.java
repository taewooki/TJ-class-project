package com.javalec.function;

import javax.swing.ImageIcon;

import com.javalec.base.Main;


public class BmiCalc {
	
	// Field
	double height;
	double weight;
	
	// Constructor
	public BmiCalc() {
		// TODO Auto-generated constructor stub
	}

	public BmiCalc(double height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	// Method
	public double calcBmi() {
		height = height / 100;
		double bmi = weight / (height * height);
		bmi = Math.round(bmi*10)/10.0;
		return bmi;
	}
	
	public String showResult(double bmi) {
		String result = "";
//		switch(bmi) {
//		case 10: 
//		case 9: bmi = "A학점"; break;
//		case 8: bmi = "B학점"; break;
//		case 7: bmi = "C학점"; break;
//		case 6: bmi = "D학점"; break;
//		default : bmi = "F학점"; break;
//		}
		if(bmi>=30) {
			result = "고도비만";
		}else if(bmi>=25 && bmi<30) {
			
			result = "비만";
		}else if(bmi>=23 && bmi<25) {
			result = "과체중";
		}else if(bmi>=18.5 && bmi<23) {
			result = "정상체중";
		}else if(bmi>=0 && bmi<18.5) {
			result = "저체중";
		}else {
			result = "";
		}
		return result;
	
	}
	
}
