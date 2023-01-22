package com.amazon.buspassmanagement;
import java.util.Date;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class App {
	
	private App() { // We can not create objects of App
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
	    System.out.println("Welcome to Bus Pass Management Application");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
		
	}
	
	Scanner scanner = new Scanner(System.in);  

	void showMainMenu() {
		// Initial menu for the application
		while(true) {
			System.out.println("1: Admin");
			System.out.println("2: User");
			System.out.println("3: Quit");
			System.out.println("Select an Option: ");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				System.out.println("Navigating to Admin Menu...");
				showAdminMenu();
			}else if(choice == 2) {
				System.out.println("Navigating to User Menu...");
				showUserMenu();
			}else if(choice == 3) {
				System.out.println("Thank you for using Bus Pass Management App, Bye :)");
				break;
			}
			else {
				System.err.println("Invalid choice...");
			}
		}
	  }
	
	
	void showAdminMenu() {
		// Login code should come before the menu becomes visible to the Admin
		
		System.out.println("********************");
		System.out.println("Welcome to Admin App");
		System.out.println("It's: "+new Date());
		System.out.println("********************");
		
		boolean quit = false;
		
		while(true) {
			System.out.println("1: Manage Routes");
			System.out.println("2: Manage Stops");
			System.out.println("3: Manage Vehicles");
			System.out.println("4: Manage Bus Pass");
			System.out.println("5: Manage FeedBcaks");
			System.out.println("6: Quit Admin menu");
			System.out.println("Select an Option: ");

			int choice = scanner.nextInt();
			
			switch(choice) {
				case 1:
					
					break;
					
				case 2:
					
					break;
				
				case 3:
						
					break;
						
				case 4:
						
					break;
					
				case 5:
					
					break;
					
				case 6:
					System.out.println("Thank You for Using Admin App !!");
					quit = true;
					break;
					
				default:
					System.err.println("Invalid Choice...");
					break;
			}
			if(quit) {
				break;
			}
		}
	}
	
	void showUserMenu() {
		// User must login before access the menu.
		
		System.out.println("********************");
		System.out.println("Welcome to Admin App");
		System.out.println("It's: "+new Date());
		System.out.println("********************");
		
		boolean quit = false;
		
		while(true) {
			System.out.println("1: View Routes");
			System.out.println("2: Apply For Bus Pass");
			System.out.println("3: My Bus Pass");
			System.out.println("4: Request Pass Update");
			System.out.println("5: Write Feedback");
			System.out.println("6: My Profile");
			System.out.println("7: Quit User App");
			System.out.println("Select an Option: ");

			int choice = scanner.nextInt();

			
			switch(choice) {
			case 1:
				
				break;
				
			case 2:
				
				break;
			
			case 3:
					
				break;
					
			case 4:
					
				break;
				
			case 5:
				
				break;
				
			case 6:
				
				break;
			
			case 7:
				System.out.println("Thank You for Using User App !!");
				quit = true;
				break;
				
			default:
				System.err.println("Invalid Choice...");
				break;
		}
		if(quit) {
			break;
		}
	}
}
	
  public static void main(String[] args) {
	
	  
	
	App app = new App();
	app.showMainMenu();
	
  }
}
