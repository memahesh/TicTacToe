package com.tictactoe.game;

public class Location {
	private int x;
	private int y;
	
	Location(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public String toString() {
		return new String("["+this.getX()+","+this.getY()+"]");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
