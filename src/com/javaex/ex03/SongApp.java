package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		
		
		
		Song s1 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
		
			
	}

}
/*
 3번째 생성자가 파라미터안에 6개의 자료형을 가지고 있는데 그중 5개를 this로 묶어주었고
 그 this안에는 2번째의 생성자의 파라미터5개의 자료형과 변수명을 다 포함하고 있어서
 3생성자 사용으로 출력을 하면 this로 묶여있는 2번째 생성자가 먼저 실행되고
 그다음 this포함 6개의 파라미터안 6개의 자료형을 가지고 있는 3번째 생성자가 실행되기때문에
 Song(파라미터5개) 와 Song(파라미터6개)가 실행된다.



	Song s2 = new Song();
	s2.setTitle("좋은날");
	쏭자바에서 필드안에 값들의 경고느낌표를 삭제하기위해선 위처럼
	사용해야하는것같다. 직접 자료형 변수에 값을 넣을 수 없는 이유는
	직접 가져가 쓰지못하는 private이 걸려있기때문이다.
 */

