package abc;
import java.util.Scanner;
public class RandomNumberGuesser {

	/*
	 * Class: CMSC203 
	 * Instructor: Prof Thai
	 * Description: (Give a brief description for each Class)
	 * Due: 2/25/2021
	 * Platform/compiler: Eclipse
	 * I pledge that I have completed the programming assignment independently.
	   I have not copied the code from a student or any source.
	   I have not given my code to any student.
	   Print your Name here: Timothy Nguyen
	 */



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare variables
		int NextGuess;
		String restart;
		int lowGuess; 
		int highGuess;
		int randNum;


		do { 
			randNum = RNG.rand();
			highGuess = 100;
			lowGuess = 0;

			Scanner guess = new Scanner(System.in);
			Scanner reset = new Scanner(System.in);


			System.out.println("Random Number Gurssing Game"); //prints title of game

			System.out.println("\nEnter a number between 0 and 100");// ask user to guess a number between 0 and 100

			NextGuess = guess.nextInt();

			if(!RNG.inputValidation(NextGuess, lowGuess, highGuess)) {

				NextGuess = guess.nextInt();
			}

			while(NextGuess > randNum) {

				highGuess = NextGuess;
				System.out.println("number of guess is " + RNG.getCount());
				System.out.println("your guess is too high");
				System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				NextGuess = guess.nextInt();

				while(!RNG.inputValidation(NextGuess, lowGuess, highGuess)) {

					NextGuess = guess.nextInt();
				}
				while(NextGuess < randNum) {
					lowGuess = NextGuess;
					System.out.println("number of guess is " + RNG.getCount());
					System.out.println("your guess is too low");
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
					NextGuess = guess.nextInt();

					while(!RNG.inputValidation(NextGuess, lowGuess, highGuess)) {

						NextGuess = guess.nextInt();
					}
				}
				if (NextGuess == randNum){

					System.out.println("number of guess is " + RNG.getCount());
					System.out.println("Congrtatulations, you guessed correctly");
					System.out.println("Do you want to play again?(yes or no)");
				}
			}

			while(NextGuess < randNum)

			{
				lowGuess = NextGuess;
				System.out.println("number of guess is " + RNG.getCount());
				System.out.println("your guess is too low");
				System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				NextGuess = guess.nextInt();

				while(!RNG.inputValidation(NextGuess, lowGuess, highGuess)) {

					NextGuess = guess.nextInt();
				}

				while(NextGuess > randNum) {

					highGuess = NextGuess;
					System.out.println("number of guess is " + RNG.getCount());
					System.out.println("your guess is too high");
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
					NextGuess = guess.nextInt();

					while(!RNG.inputValidation(NextGuess, lowGuess, highGuess)) {

						NextGuess = guess.nextInt();
					}
				}

				if (NextGuess == randNum){

					System.out.println("number of guess is " + RNG.getCount());
					System.out.println("Congrtatulations, you guessed correctly");
					System.out.println("Do you want to play again?(yes or no)");
				}
			}

			restart = reset.nextLine();
			RNG.resetCount();

		}while(restart.equals("yes"));		

		if(restart.equalsIgnoreCase("no")) {
			System.out.println("Thanks for playing...");
			System.out.println("\n Programmer: Timothy Nguyen");	
		}
	}

}
