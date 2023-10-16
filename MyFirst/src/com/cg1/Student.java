package com.cg1;

public class Student {
	private int srollno;
	private String Sname;
	private int sub1;
	private int sub2;
	private int sub3;
	
	private int sum;
	private int avg;
	
	public int getSrollno() {
		return srollno;
	}
	public void setSrollno(int srollno) {
		this.srollno = srollno;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	
	public void generateResult() {
		
		System.out.println("Roll Number "+srollno);
		
		System.out.println("Student Name "+Sname);
		System.out.println("Subject 1: "+sub1);
		System.out.println("Subject 2: "+sub2);
		System.out.println("Subject 3: "+sub3);
		
		int total = sub1+sub2+sub3;
		System.out.println("Total is: "+total);
		
		int avg = total/3;
		System.out.println("Average is: "+avg);
		
		System.out.println("Result is...");
		
		if (avg>70) {
			System.out.println("Distinct");
			
		} else if(avg>60){
			System.out.println("First Class");

		}else if(avg>50)
		{
			System.out.println("Second Class");
		}else {
			System.out.println("Failed");
		}
		
	}
	
	
	
	

}
