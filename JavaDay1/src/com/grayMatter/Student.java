package com.grayMatter;
//proper POJO class
public class Student {
	private String stdName;
	private int id;
	private int m1,m2,m3;
	private int total;
	private int avg;
	private String result;
	public Student() {
		super();
	}
	public Student(String stdName, int id, int m1, int m2, int m3, int total, int avg, String result) {
		super();
		this.stdName = stdName;
		this.id = id;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.total = total;
		this.avg = avg;
		this.result = result;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", id=" + id + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", total="
				+ total + ", avg=" + avg + ", result=" + result + "]";
	}
	
	
	
}
