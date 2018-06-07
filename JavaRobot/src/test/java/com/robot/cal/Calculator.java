package com.robot.cal;

import junit.framework.Assert;


public class Calculator {
	
	private int X=0;
	private int Y=0;
	private int Result;
	
	public Calculator(){
		
	}	

	public void setXValue(int x){		
		this.X=x;
	}
	
	public void setYValue(int y){
		this.Y=y;
	}
	
	public int getSum(){
		this.Result=this.X+this.Y;
		return this.Result;		
	}
	
	public void AssertSum(int expected,int actual){
		Assert.assertEquals(expected, actual);
	}
}
