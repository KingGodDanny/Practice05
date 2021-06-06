package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		
		//디폴트생성자 사용 (밑에 생성자사용으로 인해 디폴트생성자도 만들어줘야한다.)
		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		
		//생성자 사용
		Goods cup = new Goods("머그컵", 2000);
		

		
		//출력
		camera.showInfo();
		cup.showInfo();
		
		
		
	}

}

//수정하지않은상태에서는 출력되지않고 오류가 뜬다.

