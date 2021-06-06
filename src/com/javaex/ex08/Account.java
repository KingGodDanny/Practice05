package com.javaex.ex08;

public class Account {

	//필드-----------------------------------------------
    private String accountNo;
    private int balance;
    private int deposit;
    private int	withdraw;
  
    
    //생성자 작성---------------------------------------

	public Account(String accountNo) {
		
		this.accountNo = accountNo;
		System.out.println(accountNo + "계좌가 개설되었습니다.");
		
	}

	
    //메소드(게터세터)--------------------------------
    
	
	public String getAccountNo() {
		return accountNo;
	}
	
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	
	public int getBalance() {
		return balance;
	}
	
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
    
	
    //필요한 메소드 작성

	public void deposit(int deposit) {
		 this.deposit = deposit;
		 this.balance = this.balance + this.deposit;
	}
	
	public void withdraw(int withdraw) {
		this.withdraw = withdraw;
		this.balance = this.balance - this.withdraw;
	}
	
	public void showBalance() {
		System.out.println(this.balance);
	}
	
		
		
	
	
	
	
	
}




/*
public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    
    //필요한 메소드 작성

}
*/