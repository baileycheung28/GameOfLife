
public class Driver extends Thread{

	public static void main(String[] args) {
		
		//creates a grid to play with in the game 
		GridCells grid = new GridCells();
		
		//creates a game object to interact with the grid 
		GameOfLife game = new GameOfLife(); 
		
		//number of threads 
		int numThreads = grid.getMatrixCellNum();
		
		//creates a thread object for each square in the grid 
		for(int i = 0; i < numThreads; i++) {
			MultThread threadObject = new MultThread();
			threadObject.start(); 
		}
		
		
		
		int row = 0,
			column = 0; 
		
		if(game.isDead())
			grid.setSquareContents(row, column, false);
		else 
			grid.setSquareContents(row, column, true); 
	}

}
