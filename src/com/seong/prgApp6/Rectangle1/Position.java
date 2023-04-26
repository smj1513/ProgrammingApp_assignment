package com.seong.prgApp6.Rectangle1;

import java.io.Serializable;
public class Position implements Serializable {
	private double X;
	private double Y;

	Position(){
		X=0;
		Y=0;
	}
	Position(double x, double y){
		this.X=x;
		this.Y=y;
	}
	public double getX(){
		return this.X;
	}
	public double getY(){
		return this.Y;
	}
	public void setX(double x){
		this.X=x;
	}

	public void setY(double y) {
		this.Y = y;
	}

	@Override
	public String toString(){
		return "X:"+X+", Y:"+Y;
	}
}

