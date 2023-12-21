package com.javalec.function;

public class Addition {
	

	
	//Field
	
	int startNum;
	int endNum; 
	int tot;
	int firstNum ;
	int secondNum;
	
	
	
	//Constructor
	public Addition() {
		// TODO Auto-generated constructor stub
	}



	public Addition(int startNum, int endNum) {
		super();
		this.startNum = startNum;
		this.endNum = endNum;
		
		
	}
	
	public int add() {
		if (startNum>endNum) {
			firstNum = endNum;
			secondNum = startNum;
		} else {
			firstNum = startNum;
			secondNum = endNum;
		}
		
	
		for(int i=firstNum; i<=secondNum; i++) {
			
		tot += i;	
		}
		
		
		return tot; 
				
	}
	
	
	
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	

}
