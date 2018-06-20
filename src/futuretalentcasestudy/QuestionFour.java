package futuretalentcasestudy;

import java.util.Random;

/**
 * Programda Çıktıdaki "0" lar atların olduğu yeri göstermektedir. "1" ler ise bu atların gidebilecekleri yerlerdir.
 * Satranç tahtasındaki numaralandırma yukarıdan aşağı olarak varsayılarak program yazılıp, çıktılar ona göredir.
 *
 */

public class QuestionFour {

	static int N = 8;
	// 0<=x<8 arası bir integer üretiyoruz
    public static int getRandom(){
    	Random r = new Random();
        return r.nextInt(8);
    }
    
    public static void placeKnight(int [][]chessboard, int x, int y) {
    	
    	int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};
        
        if (x == 0 && y == 0) {
        	chessboard[2][1] = 1;
        	chessboard[1][2] = 1; 
			
		}
        
        else if (x == 7 && y == 0) {
        	chessboard[5][1] = 1;
        	chessboard[6][2] = 1;
        	
        }
        else if (x == 7 && y==7) {
        	chessboard[5][6] = 1;
        	chessboard[6][5] = 1;
        }
        
        else if(x == 0 && y == 7 ) {
        	chessboard[1][5] = 1;
        	chessboard[2][6] = 1;
        }
        else {
        for (int i = 0; i < N; i++) {
        	
        	if(((x + xMove[i]) < 8) & ((y + yMove[i]) < 8 ) & ((x + xMove[i])>=0) & ((y + yMove[i])>=0) ) {
        		if( chessboard[x + xMove[i]][y + yMove[i]] == -1)
        			chessboard[x + xMove[i]][y + yMove[i]] = 1;
        		}
		}
        }
    }
    public static boolean chessBoardFull(int [][] chessboard) {
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(chessboard[i][j] == -1)
					return false;
			}
			
		}
		
    	return true;
    }
    
    public static void disPlay(int [][] chessboard) {
    	
    	char letter = 'a';
    	int count = 0;
    	  for (int i = 0; i < N; i++) {
  			for (int j = 0; j < N; j++) {
  				if(chessboard[i][j] == 0) {
  					count ++;
  					switch(j) {
  						case 0: letter = 'a';
  						 break;
  						case 1: letter = 'b';
 						 break;
  						case 2: letter = 'c';
 						 break;
  						case 3: letter = 'd';
 						 break;
  						case 4: letter = 'e';
 						 break;
  						case 5: letter = 'f';
 						 break;
  						case 6: letter = 'g';
 						 break;
  						case 7: letter = 'h';
 						 break;
  					}
  					
  					System.out.println("KNIGHT-" + count + " -> " + i + "-" + letter);
  							
  				}
  					
  				   
  				
  		        }
  		            System.out.print("\n");
  		        }
  		
  	}
    
	public static void main(String[] args) {
		
		int x,y;
		int [][] chessboard = new int[8][8];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				chessboard [i][j] = -1;
			}
		}
		
		
        while (true) {
        	
        	 x = getRandom();
             y = getRandom();
             if(chessboard[x][y] == -1) {
            	 chessboard[x][y] = 0;
            	 placeKnight(chessboard, x, y);
            	 }
             
            if (chessBoardFull(chessboard)) 
            	break;
				
			 
		}
        
        for (int i = 0; i < N; i++) {
  			for (int j = 0; j < N; j++) {
  				System.out.print(chessboard[i][j]);
  				
  				
  		        }
  		            System.out.print("\n");
  		        }
        
        disPlay(chessboard);
	}
}