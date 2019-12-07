//import java.util.*;
//import java.util.concurrent.*;

public class GridCells{
	
	private int[][] grid;
	private static final int ROW = 20;
	private static final int COLUMN = 20; 
	
	public int getMatrixCellNum() {
		return ROW * COLUMN; 
	}
	
	//constructor of new game grid
	public GridCells(){
		int k; 
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < COLUMN; j++) {
				k = (int) Math.random();
				k = k % 3; 
				if (k == 0)
					grid[i][j] = 0;
				else
					grid[i][j] = 1; 
			}
		}
	}
	
	//returns the contents of the grid at row r and column c 
	public int getSquareContents(int r, int c) {
		return grid[r][c]; 
	}
	
	//set the contents of the grid to 1 or 0 based on death or life 
	public void setSquareContents(int r, int c, Boolean alive) {
			if(alive)
				grid[r][c] = 1; 
			else
				grid[r][c] = 0; 
	}	
	
}
