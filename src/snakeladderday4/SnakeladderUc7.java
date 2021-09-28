package snakeladderday4;

public class SnakeladderUc7 {
	public static void main(String[] args) {
		//int startPoint = 0; 
		//System.out.println("start position "+ startPoint);
		int presentPosition1= 0;
		int presentPosition2= 0;
		int ladder = 1;
		int snake = 2;
		//int dieRoll = 0;
		while(presentPosition1 < 100 && presentPosition2 < 100) 
		{
		//dieRoll++;
			int dice1 = (int)((Math.random()*10) % 6)+1;
			System.out.println("random number is:" +dice1);
			int dice2 = (int)((Math.random()*10) % 6)+1;
			System.out.println("random number is:" +dice2); 
		
		
	    int position  = (int)((Math.random()*10) % 3);
	    if(position == ladder)
	    {	
	    	presentPosition1 +=dice1;
	    	 presentPosition2 +=dice2; 
		    if(presentPosition1 > 100 || presentPosition2 > 100 ) 
		    {	
		    presentPosition1 -=dice1;
		    presentPosition2 -=dice2;
		    }
		    System.out.println("Ladder move forward 1 "+ presentPosition1);
		    System.out.println("Ladder move forward 2 "+ presentPosition2);
		    
	    }
	    else if(position == snake)
	    {	
	    	presentPosition1 -=dice1;
	    	presentPosition2 -=dice2;
	    if(presentPosition1 < 0 || presentPosition2 < 0 ) 
	    {
	    	presentPosition1 = 0;
	    	presentPosition2 = 0;
	    }
	    	System.out.println("Snakes move backward 1 "+ presentPosition1);
	    	System.out.println("Snakes move backward 2 "+ presentPosition2);
	    }
	    else
	    {
	    	System.out.println("You are on "+ presentPosition1);
	    	System.out.println("You are on "+ presentPosition2);
	    }
	    //System.out.println("Number of time die to win the game" + dieRoll);
	    if(presentPosition1 ==100)
	    	System.out.println("Player 1 Win");	
	    else  if(presentPosition2 ==100)
	    	System.out.println("Player 2 Win");	
	    
	}
	}
	}


