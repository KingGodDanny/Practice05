package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {
    	
    	
    	//1번방식 -------------------------------------------------------------
    	
        double dollar;
        dollar=100;
        
        double won;
        won=1000000;
      
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        System.out.println("백만원은 " + CConverter.toDoller(won) + "달러 입니다.");
        
        
        //100달려를 원으로 출력하기
        System.out.println("백달러는 " + CConverter.toKWR(dollar) + " 입니다.");
        
        
        
       /* 2번방식-----------------------------------------------------------
        //CConverter.setRate(1118.70);\
        
        //100만원을 달러로 출력하기

        CConverter.toDoller(1000000);
        
        //100달려를 원으로 출력하기
        
        CConverter.toKWR(100);	
        */
    }

}
