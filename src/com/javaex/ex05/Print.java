package com.javaex.ex05;

public class Print {
    
	//이문제는 오버로딩을 이해하기위한 출제의도인것같다.
	
    public void printer(int val){
        System.out.println(val);
    }

    public void printer(boolean val) {
    	System.out.println(val);
    }
    
    public void printer(double val) {
    	System.out.println(val);
    }
    
    public void printer(String val) {
    	System.out.println(val);
    }
    
}
