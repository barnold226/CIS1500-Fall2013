import java.util.Scanner;

public class MazeGameLoop
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner( System.in );
		String input;
		boolean stuckInMaze = true;
		int daysInMaze = 0;
		
		System.out.println("You wake up in an unknown land, try and get home!");
		
		while ( stuckInMaze )
		{
			System.out.println("Which way do you want to go?");
			
			daysInMaze++;
			
			input = keyboard.nextLine();
			
			switch( input )
			{
				case "North" :
				case "north" :
				case "n" :
				case "N" :
				{
					System.out.println("You head north through a mountain trail.");
					break;
				}	
				case "East" :
				case "east" :
				case "E" :
				case "e" :
				{
					System.out.println("You head east along the river trail.");	
					break;
				}
				case "South" :
				case "south" :
				case "S" :
				case "s" :
				{
					System.out.println("You head south through the swamp.");
					break;
				}
				case "West" :
				case "west" :
				case "W" :
				case "w" :
				{
					System.out.println("You head west across the open plains.");
					break;
				}
				
				case "There's no place like home!" :
				{
					stuckInMaze = false;
					break;
				}
				
				default :
				{
					System.out.println("You can only go North, East, South or West!");
					daysInMaze--;
				}
			}
		}
		System.out.printf("You made it home safely in %d days!", daysInMaze );
	}
}
