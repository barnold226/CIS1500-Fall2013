import java.util.Scanner;

public class GuessingGame
{
	public static void main (String[] args)
	{
		int secretNumber = 14;
		String guess;
		int numberGuess;
		int numberOfGuesses = 0;
		boolean correct = false;
		Scanner keyboard = new Scanner( System.in );
		
		while ( !(correct) && ( numberOfGuesses < 5 ) )
		{
			System.out.println("Guess a number!");
			numberOfGuesses++;
				
			numberGuess = keyboard.nextInt();
			
			if ( numberGuess > secretNumber )
			{
				System.out.println("Too high!");
			}
			else if ( numberGuess < secretNumber )
			{
				System.out.println("Too low!");
			}
			else
			{
				System.out.printf("You guessed it! It took %d guesses", numberOfGuesses);
				correct = true;
			}
		}
		System.out.println("You lose!");
	}
}