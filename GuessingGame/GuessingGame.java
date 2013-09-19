import java.util.Scanner; 

public class GuessingGame
{
	public static void main(String[] args)
	{
		int mySecretNumber = 42;
		int guess;
				
		Scanner bannana = new Scanner(System.in);
		
		System.out.println("Guess my secret number!");
		
		guess = Integer.parseInt( bannana.nextLine() );
		
		if ( guess < mySecretNumber )
		{
			System.out.println( "Too low!");
		}
		else if ( guess > mySecretNumber )
		{
			System.out.println( "Too high!");
		}
		else
		{
			System.out.println( "You got it!");
			System.exit(0);
		}
		
		System.out.println("Guess my secret number!");
		
		guess = Integer.parseInt( bannana.nextLine() );
		
		if ( guess < mySecretNumber )
		{
			System.out.println( "Too low!");
		}
		else if ( guess > mySecretNumber )
		{
			System.out.println( "Too high!");
		}
		else
		{
			System.out.println( "You got it!");
			System.exit(0);
		}
		
		System.out.println("Guess my secret number!");
		
		guess = Integer.parseInt( bannana.nextLine() );
		
		if ( guess < mySecretNumber )
		{
			System.out.println( "Too low!");
		}
		else if ( guess > mySecretNumber )
		{
			System.out.println( "Too high!");
		}
		else
		{
			System.out.println( "You got it!");
			System.exit(0);
		}
		
		System.out.println("Guess my secret number!");
		
		guess = Integer.parseInt( bannana.nextLine() );
		
		if ( guess < mySecretNumber )
		{
			System.out.println( "Too low!");
		}
		else if ( guess > mySecretNumber )
		{
			System.out.println( "Too high!");
		}
		else
		{
			System.out.println( "You got it!");
			System.exit(0);
		}
		
		System.out.println("Guess my secret number!");
		
		guess = Integer.parseInt( bannana.nextLine() );
		
		if ( guess < mySecretNumber )
		{
			System.out.println( "Too low!");
		}
		else if ( guess > mySecretNumber )
		{
			System.out.println( "Too high!");
		}
		else
		{
			System.out.println( "You got it!");
			System.exit(0);
		}
		
		System.out.println( "You lose!");
		
	}
}