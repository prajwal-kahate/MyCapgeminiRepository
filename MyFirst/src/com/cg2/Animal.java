package com.cg2;

interface Mammal{
	// can have multiple functionalities
	  void eat();

	 

	}
	// sub interface
	interface Cat extends Mammal{

	 

	      void milk();
	}

	 

	class Animal implements Cat{

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void milk() {
			// TODO Auto-generated method stub
			
		}

	 

	//

	 

	 

	}