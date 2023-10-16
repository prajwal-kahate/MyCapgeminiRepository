package com.cg2;

public class Pizza {

	 

		String size;

		int rate,qnt;



		public Pizza(String size, int rate, int qnt) {

			super();

			this.size = size;

			this.rate = rate;

			this.qnt = qnt;

		}

	 

		@Override

		public boolean equals(Object obj) {


			Pizza p= (Pizza)obj;

			if(this.size.equals(p.getSize()))

					return true;

			return false;



		}





	 

		public String getSize() {

			return size;

		}

	 

		public void setSize(String size) {

			this.size = size;

		}

	 

		public int getRate() {

			return rate;

		}

	 

		public void setRate(int rate) {

			this.rate = rate;

		}

	 

		public int getQnt() {

			return qnt;

		}

	 

		public void setQnt(int qnt) {

			this.qnt = qnt;

		}

	 

		@Override

		public String toString() {

			return "Pizza [size=" + size + ", rate=" + rate + ", qnt=" + qnt + "]";

		}




	}


