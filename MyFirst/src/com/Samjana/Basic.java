package com.Samjana;

public class Basic {
	
	
	private int no;
	
//	Basic(int no){
//		this.no =no;
//	}
	
	Basic(){
	}
	
	static void s() {
		System.out.println("S");
		//no=19;
		
	}
	void d() {
		System.out.println("d");
		no=20;
	}
	public static void main(String[] args) {
				
		Basic.s();
		
		//Basic b1 = new Basic(10);
	}

}
