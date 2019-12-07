
public class GameOfLife extends Thread{
	
	public Boolean isDead() {
		int n = 0; 
		
		if(n < 2) //if there are fewer than 2 live neighbors
			return true; //dead
		
		//if there are exactly 3 neighbors 
		if(n == 3)
			return false; //alive
		
		if (n > 3) //if there are more than 3 neighbors 
			return true; //dead
		else //if cell has 2 or three live neighbors
			return false; //alive
		
	}
	
}
