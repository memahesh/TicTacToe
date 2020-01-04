package com.tictactoe.game;

public enum PieceEnum {
	
	CIRCLE ("O"),
	CROSS ("X"),
	EMPTY ("-");

	private String symbol;
	
	private PieceEnum(String symbol) {
		// TODO Auto-generated constructor stub
		this.symbol = symbol;
	}
	
	public String toString() {
		return this.symbol;
	}
	
}
