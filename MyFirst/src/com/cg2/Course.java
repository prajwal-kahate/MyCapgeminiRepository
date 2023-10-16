package com.cg2;

public class Course {
	private int cId;
	private String cName;
	private long fees;
	
	public Course(int cId, String cName, long fees) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.fees = fees;
	}
	public Course() {
		super();
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public long getFees() {
		return fees;
	}
	public void setFees(long fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", fees=" + fees + "]";
	}
	
	

	// constructor getter and setter tostring
	
	



}
