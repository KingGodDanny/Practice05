package com.javaex.ex09;

public class StringUtil {
    
 
	
    public static String concatString(String[] strArray){
    	String resultStr = "";
    		
    	for(int i = 0; i<strArray.length; i++) {
    			resultStr = resultStr + strArray[i];
    		}
    		return resultStr;
    	}
    	
    
   
  
}
/*숫자의 합을 리턴할땐 그 합을 담을수있는 int sum=0; 이라는 자료형 변수를
써줬었는데 현재 배열의 0,1,2는 문자열을 담고 있다.
이들의 문자열들을 합해주기 위해선 합을 담을수 있는 0과 같은 공백이 필요하기
때문에 String = "";에 담아줘야한다. 
*/
    	  
