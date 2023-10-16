package com.cg1;

public class Account 
{
	private int acno;
	private String acname;
	private int bal;
	
	public Account(int acno, String acname, int bal) {
		System.out.println("Welcome Capgemini Bank");
		this.acno = acno;
		this.acname = acname;
		this.bal = bal;
	}
	
	
	
	public int getAcno() {
		return acno;
	}



	public void setAcno(int acno) {
		this.acno = acno;
	}



	public String getAcname() {
		return acname;
	}



	public void setAcname(String acname) {
		this.acname = acname;
	}



	public int getBal() {
		return bal;
	}



	public void setBal(int bal) {
		this.bal = bal;
	}



	public int withdraw(int amt) 
	{
		bal=bal-amt;
		return bal;
	}

    public int deposit(int amt)
    {
    	bal = bal+amt;
    	return bal;
    }



	@Override
	public String toString() {
		return "Account Number=" + acno + " Name is=" + acname + " Balance is=" + bal ;
	}
    
    
	

}
