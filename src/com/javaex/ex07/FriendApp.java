package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        
        System.out.println("친구를 3명 등록해 주세요");

           
        for(int i=0; i<friendArray.length; i++) {
    	
        	System.out.print("이름: ");
        	String scname = sc.nextLine();
        	
      
        	System.out.print("번호: ");
        	String scnumber = sc.nextLine();
        	
        	
        	System.out.print("학교: ");
        	String scschool = sc.nextLine();
        	System.out.println("----------------------------");
            

    	
    	for(int j=i; j<friendArray.length; j++) {
    	
        	// Friend 인스턴스 생성하여 데이터 넣기-----------------------------
        	//힙구간에 뉴를 사용하여 변수명과 공간을 만들고
        	//그 주소를 따라가면 저런 데이터가 있다.
        	Friend first = new Friend();
        	first.setName(scname);
        	first.setHp(scnumber); 
        	first.setSchool(scschool);
        	
        	
        	Friend second = new Friend();
        	second.setName(scname);
        	second.setHp(scnumber); 
        	second.setSchool(scschool); 
        	
        	
        	Friend third = new Friend();
        	third.setName(scname);
        	third.setHp(scnumber); 
        	third.setSchool(scschool);
        	
        	// 인스턴스 주소를 배열에 대입----------------------------------------
        	//힙구간에 frist라는 0x111 주소를 가진 변수와 그의 데이터들을 0번째(1번째순서)의 배열로 지정해라
        	friendArray[i] = first; 
        	friendArray[i] = second;
        	friendArray[i] = third;
    	
    		}
        }
          
            
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            friendArray[i].showInfo();
        }

        sc.close();
        
        
        /*
         Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용
            
        	// 친구정보(이름) 입력받기

        	// 친구정보(핸드폰) 입력받기
        
        	// 친구정보(학교) 입력받기

            // Friend 인스턴스 생성하여 데이터 넣기

            // 인스턴스 주소를 배열에 대입

        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        }

        sc.close();
         */
    
            
    }
}
