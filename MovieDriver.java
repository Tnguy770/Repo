package abc;

import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		
		Movie data = new Movie();
		
		String answer;
		Scanner keyboard = new Scanner(System.in);
		
		do {
		
		System.out.println("Enter name of a movie:");
		
		data.setTitle(keyboard.nextLine());
			
		System.out.println("Enter the rating of the movie:");
		
		data.setRating(keyboard.nextLine());
		
		System.out.println("Enter the number of tickets sold for this movie:");
	
		data.setSoldTickets(keyboard.nextInt());
		
		System.out.println(data.getTitle() + " " + "("+ data.getRating() + ") " + "Tickets sold: "+ data.getSoldTickets());
		
		
		System.out.println("Do you want to enter another? (y or n)");
		
		answer = keyboard.next();
		keyboard.nextLine();

		}while (answer.equalsIgnoreCase("y"));
		
		keyboard.close();
		System.out.println("\nGoodbye");
	}
}
		
		
