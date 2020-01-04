package com.tictactoe.game;

public class Board {
	
	private PieceEnum[][] board;
	
	private final int DIM = 3;
	
	Board() {
		 this.board = new PieceEnum[3][3];
		 for(int i = 0; i < DIM; i++) {
			 for(int j = 0; j < DIM; j++) {
				 this.board[i][j] = PieceEnum.EMPTY;
			 }
		 }
	}
	
	public void getBoard() {
		
		for(int i = -1; i < DIM; i++) {
			for(int j = -1; j < DIM; j++) {
				if(i == -1 && j == -1) {
					System.out.print(" \t");
				}else if(i == -1) {
					System.out.print(j + "\t");
				}else if(j == -1){
					System.out.print(i + "\t");
				}else {
					System.out.print(this.board[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
	
	protected void makeMove(Location p, PieceEnum piece) {
		if(p.getX() >= 0 && p.getX() < DIM && p.getY() >= 0 && p.getY() < DIM) {
			if(this.board[p.getX()][p.getY()] == PieceEnum.EMPTY) {
				// If move is allowed
				this.board[p.getX()][p.getY()] = piece;
				System.out.println("Move made by " + piece + " at " + p);
			}else {
				throw new IllegalArgumentException("Location selected is already occupied");
			}
		}else {
			throw new IllegalArgumentException("Location selected is out of boundary");
		}
		
	}
	
	protected boolean checkWinStatus(Location p) {
		PieceEnum candidate = this.board[p.getX()][p.getY()];
		
		int rowWin = 0;
		int colWin = 0;
		int diagWin = 0;
		int revDiagWin = 0;
		
		for(int i = 0; i < 3; i++) {
			// Check row
			if(this.board[p.getX()][i] == candidate) {
				rowWin++;
			}
			// Check col
			if(this.board[i][p.getY()] == candidate) {
				colWin++;
			}
			// Check diagonal
			if(this.board[i][i] == candidate) {
				diagWin++;
			}
			// Check reverse Diagonal
			if(this.board[i][DIM-i-1] == candidate) {
				revDiagWin++;
			}
		}
		
		if(rowWin == 3 || colWin == 3 || diagWin == 3 || revDiagWin == 3) {
			return true;
		}else {
			return false;
		}
		
	}
}
