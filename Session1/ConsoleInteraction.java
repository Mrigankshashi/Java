import java.util.Scanner;	// Scanner is available in jDK to be used in read operation :)
public class ConsoleInteraction {

	public static void main(String[] args) {
		System.out.println("Welcome to console interaction :)");
		// System.out pushes the data on console
		// System.in takes the data from the console
		// Create Scanner object by passing System.in to read
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Age: ");
		byte age = scanner.nextByte();
		
		scanner.nextLine();	// do an empty nextLine in case reading strings after numbers
		
		System.out.println("Enter your Name: ");
		String name = scanner.nextLine();
		
		System.out.println("Welcome, "+name+" your age "+age+" is eligible for voting :)");
		scanner.close(); // close the scanner in the end to release memory resources
		
	}

}
