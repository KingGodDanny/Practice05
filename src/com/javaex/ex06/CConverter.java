package com.javaex.ex06;

public class CConverter {
    
	
	//필드
    public static double rate = 1118.70;
    
    
    
    //메소드 (일반)
    
    //1번방식------------------------------------------------------
    public static void setRate(double rate){
        CConverter.rate = rate;
    }
    
    public static double toDoller(double won){
    	double result = won / rate;
    	return result;
    }
    
    public static double toKWR(double dollar){
		double result = dollar * rate;
		return result;
    }
    
    /* 2번방식-------------------------------------------------
    public static void setRate(double rate){
        CConverter.rate = rate;
    }
    
    public static double toDoller(double won){
    	double result = won / rate;
    	System.out.println("백만원은 " + result +"달러 입니다.");
    	return result;
    }
       

    public static double toKWR(double dollar){
		double result = dollar * rate;
		System.out.println("백달러는 " + result +"달러 입니다.");
		return result;
    }
    */

}
