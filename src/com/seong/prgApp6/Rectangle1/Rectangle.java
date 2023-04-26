package com.seong.prgApp6.Rectangle1;

import java.io.Serializable;

public class Rectangle implements Comparable<Rectangle>, Serializable {
	Position mainPos; //왼쪽 아래 x,y좌표
	private double width;
	private double height;

	Rectangle() {
		width = 0;
		height = 0;
		mainPos = new Position();
	}

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		mainPos = new Position();
	}

	Rectangle(double width, double height, double positionX, double positionY) {
		this.width = width;
		this.height = height;
		mainPos = new Position(positionX, positionY);
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getSize() {
		return width * height;
	}

	public Position getMainPos() {
		return mainPos;
	}

	public boolean isOverlap(Rectangle rect) {
		double thisX = mainPos.getX();
		double thisY = mainPos.getY();
		double thisRightX = thisX + width;
		double thisTopY = thisY + height;

		double otherX = rect.getMainPos().getX();
		double otherY = rect.getMainPos().getY();
		double otherRightX = otherX + rect.getWidth();
		double otherTopY = otherY + rect.getHeight();

		boolean isOverlap;
		if (thisX >= otherRightX) {
			isOverlap = false;
		} else if (thisRightX <= otherX) {
			isOverlap = false;
		} else if (thisY >= otherTopY) {
			isOverlap = false;
		} else if (thisTopY <= otherY) {
			isOverlap = false;
		} else {
			isOverlap = true;
		}
		return isOverlap;
	}

	public double OverlapSize(Rectangle rect) {
		double thisX = mainPos.getX();
		double thisY = mainPos.getY();
		double thisRightX = thisX + width;
		double thisTopY = thisY + height;

		double otherX = rect.getMainPos().getX();
		double otherY = rect.getMainPos().getY();
		double otherRightX = otherX + rect.getWidth();
		double otherTopY = otherY + rect.getHeight();

		double overlapX = Math.max(thisX, otherX);
		double overlapY = Math.max(thisY, otherY);
		double overlapWidth = Math.min(thisRightX, otherRightX) - overlapX;
		double overlapHeight = Math.min(thisTopY, otherTopY) - overlapY;

		return overlapWidth * overlapHeight;
	}

	@Override
	public String toString() {
		return "( Size:" + getSize() + ", width:" + width + ", height:" + height + ", " + mainPos.toString() + ")";
	}

	@Override
	public int compareTo(Rectangle o) {
		return Double.compare(getSize(), o.getSize());
	}
}
