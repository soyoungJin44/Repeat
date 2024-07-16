package com.javaex.repeat;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		super();
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//메서드 gs
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	//메서드 일반

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public boolean equals(Object obj) {
		boolean result;
		Point p = (Point)obj;
		if(this.x == p.x && this.y == p.y) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
	

}
