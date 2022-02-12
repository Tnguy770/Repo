package abc;

/*
 * Class: CMSC203 
 * Instructor: Prof Thai
 * Description: Design, implement and test a Java application that will step you through some possible problems and potentially restore internet connectivity.  
   Assume that your computer uses WiFi to connect to a router which connects to an Internet Service Provider (ISP) that connects to the Internet.  
 * Due: 2/11/2022
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Timothy Nguyen
 */

import java.util.Scanner;
public class WiFiDiagnosis {

	public static void main(String[] args) {

		boolean flag = true; //controls the loop

		String response; // 
		String reloop;

		Scanner keyboard = new Scanner(System.in); //user input created

		System.out.println("If you have a problem with internet connectivity, this WIFI Diagnosis might work");
		System.out.println("\nFirst Step: Reboot the computer and try to connect");// prints the first step
		System.out.println("Did that fix the problem?"); //ask the user if the first step fixed the problem

		do {

			response = keyboard.next(); //user input for the first step

			if (response.equalsIgnoreCase("yes")) // if user inputs yes
			{
				System.out.println("Rebooting the computer seemed to work");
				System.out.println("\nDo you want to run the diagnosis again?");
				reloop = keyboard.next();

				if(reloop.equalsIgnoreCase("yes"))  // if user inputs yes
				{
					System.out.println("If you have a problem with internet connectivity, this WIFI Diagnosis might work");
					System.out.println("\nFirst Step: Reboot the computer and try to connect");
					System.out.println("Did that fix the problem?");
					continue; // re-loops 
				}
				else if(reloop.equalsIgnoreCase("no"))
				{
					System.out.println("\ndiagnosis complete"); // prints final message
					keyboard.close();
					break; // stops the loop
				}

			}

			else if(response.equalsIgnoreCase("no"))
			{
				System.out.println("Second Step: Reboot your router"); // prints the second step
				System.out.println("Did that fix your problem?");
				response = keyboard.next();	

				if(response.equalsIgnoreCase("yes")) // if user inputs yes
				{
					System.out.println("Rebooting your router seems to work");
					System.out.println("\nDo you want to run the diagnosis again?");
					reloop = keyboard.next();

					if(reloop.equalsIgnoreCase("yes")) // if user inputs yes
					{
						System.out.println("If you have a problem with internet connectivity, this WIFI Diagnosis might work");
						System.out.println("\nFirst Step: Reboot the computer and try to connect");
						System.out.println("Did that fix the problem?");
						continue; // re-loops 
					}
					else if(reloop.equalsIgnoreCase("no")) // if user inputs no
					{
						System.out.println("\ndiagnosis complete"); // prints final message
						keyboard.close();
						break; // stops the loop
					}

				} 
				else if(response.equalsIgnoreCase("no"))// if user inputs no
				{	
					System.out.println("Third Step: Make sure your cables to your router are plugged in firmly"); //prints the third step
					System.out.println("Now did that fixed your problem?");
					response = keyboard.next();
					if(response.equalsIgnoreCase("yes")) // if user inputs yes
					{
						System.out.println("Checking your router's cables seemed to work");
						System.out.println("\nDo you want to run the diagnosis again?");
						reloop = keyboard.next();
						if(reloop.equalsIgnoreCase("yes")) // if user inputs yes
						{
							System.out.println("If you have a problem with internet connectivity, this WIFI Diagnosis might work");
							System.out.println("\nFirst Step: Reboot the computer and try to connect");
							System.out.println("Did that fix the problem?");
							continue; // re-loops 
						}
						else if(reloop.equalsIgnoreCase("no"));// if user inputs no
						{
							System.out.println("\ndiagnosis complete"); // prints final message
							keyboard.close();
							break; // stops the loop
						}
					}
					else if(response.equalsIgnoreCase("no"))// if user inputs no
					{	
						System.out.println("Fourth Step: Move your computer closer to your router"); //prints the fourth step
						System.out.println("Now did that fixed your problem");
						response = keyboard.next();
						if(response.equalsIgnoreCase("yes")) // if user inputs yes
						{
							System.out.print("Moving your computer seemed to work");
							System.out.println("\nDo you want to run the diagnosis again?");
							reloop = keyboard.next();

							if(reloop.equalsIgnoreCase("yes")) // if user inputs yes
							{
								System.out.println("If you have a problem with internet connectivity, this WIFI Diagnosis might work");
								System.out.println("\nFirst Step: Reboot the computer and try to connect");
								System.out.println("Did that fix the problem?");
								continue; // re-loops 
							}
							else if(reloop.equalsIgnoreCase("no"))// if user inputs no
							{
								System.out.println("\ndiagnosis complete"); // prints final message
								keyboard.close();
								break; // stops the loop
							}

						} else if(response.equalsIgnoreCase("no")) // if user inputs no 
						{

							System.out.println("Fith Step: Contact your ISP"); // prints fifth step
							System.out.println("Make sure your ISP is hooked up to your router");
							System.out.println("Do you want to run the diagnosis again?");
							reloop = keyboard.next();
							if(reloop.equalsIgnoreCase("yes"))
							{
								System.out.println("If you have a problem with internet connectivity, this WIFI Diagnosis might work");
								System.out.println("\nFirst Step: Reboot the computer and try to connect");
								System.out.println("Did that fix the problem?");
								continue; // re-loops 
							}
							else if(reloop.equalsIgnoreCase("no")) // if user inputs no
							{
								System.out.println("\ndiagnosis complete"); // prints final message
								keyboard.close(); // closes keyboard
								break; // stops the loop
							}


						}


					}	
				}	

			}
			else  //if user does not type yes or no
			{
				System.out.println("Invalid Input please try again"); //prints invalid input	
			}	


		} while(flag);


		System.out.println("\n\nProgrammer: Timothy Nguyen"); //prints programmer name

	}
}
