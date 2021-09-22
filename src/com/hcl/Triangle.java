package com.hcl;

public class Triangle {

	private Point A;
	private Point B;
	private Point C;
	public Triangle() {
		
	}
	public Triangle(Point A, Point B, Point C) {
		this.A=A;
		this.B=B;
		this.C=C;
		
	}
	public Point getA() {
		return A;
	}
	public void setA(Point a) {
		A = a;
	}
	public Point getB() {
		return B;
	}
	public void setB(Point b) {
		B = b;
	}
	public Point getC() {
		return C;
	}
	public void setC(Point c) {
		C = c;
	}
	public void display(){
		System.out.println("PointA: (" + getA().getX() + "," + getA().getY() +")" );
		System.out.println("PointB: (" + getB().getX() + "," + getB().getY() +")" );
		System.out.println("PointC: (" + getC().getX() + "," + getC().getY()+")"  );
	}
}
