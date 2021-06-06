package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		
		//지금처럼 사용할수 있는 이유는 눈에 보이진않지만
		//디폴트 생성자가 있기 때문이고 다른 생성자를 작성했을시에는
		//디폴트생성자도 코딩해줘야한다.
		
		Member jeong = new Member();
		jeong.setId("jsw");
		jeong.setName("정우성");
		jeong.setPoint(50000);
		jeong.showInfo();
		
		
		Member yoo = new Member();
		yoo.setId("yjs");
		yoo.setName("유재석");
		yoo.setPoint(30000);
		jeong.showInfo();
		
		
		Member lee = new Member();
		lee.setId("lhr");
		lee.setName("이효리");
		lee.setPoint(40000);
		lee.showInfo();
		
		
	}

}
