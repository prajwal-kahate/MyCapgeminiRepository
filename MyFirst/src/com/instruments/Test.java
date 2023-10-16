package com.instruments;

public class Test {

	public static void main(String[] args) {
		
		Instrument instrument1 = new Piano();
		//instrument1.play();
		
		Instrument instrument2 = new Flute();
		//instrument2.play();
		
		Instrument instrument3 = new Guitar();
		//instrument3.play();
		
		Instrument[] instrumentArray1= {instrument1,instrument2,instrument3};
		
		
		for (int i = 0; i < instrumentArray1.length; i++) {
			if(instrumentArray1[i] instanceof Piano) {
				System.out.println("Piano is Stored in "+i+" Loacation");
			}
			else if(instrumentArray1[i] instanceof Guitar) {
				System.out.println("Guitar is Stored in "+i+" Loacation");
			}
			else if(instrumentArray1[i] instanceof Flute) {
				System.out.println("Flute is Stored in "+i+" Loacation");
			}
			
			instrumentArray1[i].play();
			
		}
		
		

	}

}
