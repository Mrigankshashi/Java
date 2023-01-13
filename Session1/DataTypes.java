
public class DataTypes {
	// main method will be executed by JVM
	// In the RAM, a frame will be created in the stack for main		
	public static void main(String[] args) {
		
		System.out.println("Welcome to primitive data types in Java :)");
		// INTEGRAL STORAGE CONTAINERS
		// 1. Create single value container (Primitive Data Types)
		byte age = 10;
		// byte -> is a data type which takes 8 bits in memory
		//		   it can store only integer data
		//         2 power 8 -> 256 | 256/2 -> -128 to 0 to 127
		//         age is name of storage container | identifier, variable
		//         10 is integral data | Literals i.e the value
		
		// 2. Read Single Value Container
		System.out.println("Age is: "+age);
		
		// 3. Update Single Value Container
		age = 20;
		System.out.println("Age is now: "+age);
		
		//age = 128; error ? -> out of range value
		age = (byte)128; //DOWN CASTING
		System.out.println("Age when out of range is: "+age);
		
		short amount = 300; // 16 bits
		int eWallet = 2000; // 32 bits
		long phoneNumber = 9999911111L; //64 bits
		
		long number1 = 200; // we are not putting L after 200. why ? Because Java by default considers all literals to be of 32 bits so if we put value more than 32 bits we need to place 'L' at the end.
		
		// Copy operation
		// Down Casting -> Only required when a larger container is copied into smaller container
		int number2 = (int)number1; // number1 is 64 bits of container and number2 is 32 bits container
		
		byte number3 = 50;
		int number4 = number3;			// UP CASTING
		byte number5 = (byte)number4;	// DOWN CASTING -> we need to cast
		
		// FLOATING POINT
		float taxes = 0.18F; // F makes 0.18 as 32 bits // float takes 32 bits in memory
		// floating point literals contains many 0000 zeros after 0.18 so we need to specify 'F' at the end
		
		double amountAfterTaxes = 200.345; // 64 bits in memory
		
		// CHARACTERS -> 16 bits container because it includes UNICODES
		char ch = 'A';
		ch = '@';
		ch = 90; // 90 is ASCII code
		System.out.println("ch is: "+ch);
		ch ='\u20b9';
		System.out.println("ch is: "+ch);
		ch = '\u2605';
		System.out.println("ch is: "+ch);
		
		// LOGICAL -> 8 bits conatiner
		boolean enableGPS = true; //  0 0 0 0  0 0 0 1
		boolean internet = false; //  0 0 0 0  0 0 0 0
		
		// Single value containers are meant to store 1 value only :)
		// You can update them if you wish
		// int ages = 20, 22, 35, 67, 72;
		
		System.out.println("Primitive Data Types Finished :)");
	}

}
// 4. Delete Containers -> Automatically ones main finishes
