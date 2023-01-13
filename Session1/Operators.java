
public class Operators {

	public static void main(String[] args) {
		// 1. Arithmetic Operators -> +, -, *, /, %
		
		double amount = 1200.55;
		double tax = 0.18;
		
		double total = amount + (tax*amount);
		System.out.println("Total amount to pay is: \u20b9"+total);
		
		int number = 10;
		int buckets = 3;
		int hashCode = number % buckets;
		System.out.println("HashCode is: "+hashCode);  // 10 % 3 = 1
		// https://www.cs.usfca.edu/~galles/visualization/OpenHash.html
		
		// 2. Assignment Operators -> =, (+=, -=, *=, /=, %=) -> ShortHand Operators
		
		int eWallet = 500; // = operators put the data 500 in the container
		// eWallet = eWallet + 200;
		eWallet += 200;
		//eWallet %= 6;
		System.out.println("eWallet is: "+eWallet);
		
		
		// 3. Conditional Operators -> >, <, >=, <=, ==, !=
		
		int cabFare = 300;
		System.out.println("Can I book the cab? "+(eWallet >= cabFare));
		
		boolean gps = true;
		System.out.println("Is GPS enabled? "+(gps != true));
		
		int promoCode = 51750;
		int promoCodeEnteredByUser = 2000;
		System.out.println("Can I get promotional Discount? "+(promoCode == promoCodeEnteredByUser));
		
		// 4. Logical Operators -> &&, ||, !
		
		System.out.println("Can i book the cab and get discount? "+((eWallet >= cabFare) && (promoCode == promoCodeEnteredByUser)));
		System.out.println("Can i book the cab and get discount? "+((eWallet >= cabFare) || (promoCode == promoCodeEnteredByUser)));
		
		// 5. BitWise Operators -> &, |, ^ (used in security and gaming)
		
		int num1 = 10;  // 0 0 0 0  1 0 1 0
		int num2 = 8;   // 0 0 0 0  1 0 0 0
		
		int result1 = num1 & num2;  // 0 0 0 0  1 0 0 0  -> 8
		int result2 = num1 | num2;  // 0 0 0 0  1 0 1 0  -> 10
		int result3 = num1 ^ num2;  // 0 0 0 0  0 0 1 0  -> 2
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		
		// 6. Shift Operators -> >>, <<, >>>(it works on only positive numbers)
		
		int x = 8;				// 0 0 0 0  1 0 0 0
		int y = 3;				
		int z = x >> y;			// _ _ _ 0  0 0 0 1 -> 0 0 0 0  0 0 0 1 -> 1;
		System.out.println("z is: "+z);
		
		// Rt Shift: x divide by 2 power y | 8 / 8 -> 1;
		
		x = 11;					// 0 0 0 0  1 0 1 1 
		z = x >> y;				// _ _ _ 0  0 0 0 1 -> 0 0 0 0  0 0 0 1 -> 1;
		System.out.println("z is now: "+z);
		// Rt Shift: x divide by 2 power y | 11 / 8 -> 1;
		
		x = -11;
		z = x >> y;
		System.out.println("z with -11 right shift by 3 is: "+z);
		/*
		 		11
		 		0 0 0 0  1 0 1 1
		 		1's C
		 		1 1 1 1  0 1 0 0
		 		2's C
		 					 + 1
		 		
		 		-11
		 		1 1 1 1  0 1 0 1
		 		>>> 3
		 		_ _ _ 1  1 1 1 0
		 		1 1 1 1  1 1 1 0    we added 1 1 1 at _ _ _ because it is negative
		 		
		 		2's C
		 		0 0 0 0  0 0 0 1
		 					 + 1
		 		0 0 0 0  0 0 1 0 -> -2	 	
		 	
		*/
		
		x = -13;
		z = x >> y;
		System.out.println("z with -13 rt shift by 3 is: "+z);
		/*
		 		13
		 		0 0 0 0  1 1 0 1
		 		1's C
		 		1 1 1 1  0 0 1 0
		 		2's C
		 					 + 1
		 		
		 		-11
		 		1 1 1 1  0 0 1 1
		 		>>> 3
		 		_ _ _ 1  1 1 1 0
		 		1 1 1 1  1 1 1 0    we added 1 1 1 at _ _ _ because it is negative
		 		
		 		2's C
		 		0 0 0 0  0 0 0 1
		 					 + 1
		 		0 0 0 0  0 0 1 0 -> -2	 	
		 	
		*/
		
		x = 8;
		y = 3;
		z = x << y;	// x * 2 power y
		// 8 * 2 power 3
		// 64
		System.out.println("x with 8 lft shift by 3 is: "+z);
		
		
		// 7. Ternary operators
		eWallet -= 500; //(ex: 200, 500, 100)
		String message = (eWallet >= cabFare) ? "Cab is booked :)" : "Please recharge your wallet with \u20b9"+(cabFare - eWallet)+" to book the cab :)";
		System.out.println("Message: "+message);
		
		// 8. Increment and Decrement operator -> ++ and --
		
		int dishQuantity = 1;
		dishQuantity++;	// 	postfix notation: When we want last value before updation we use this -> 2
		++dishQuantity; // prefix notation: When we want the latest value after updation we us this -> 3
		//System.out.println("dishQuantity is: "+dishQuantity);
		
		//		 3
		//int totalDishes = dishQuantity++;	// 4
		
		//		 4
		int totalDishes = ++dishQuantity;	// 4
		System.out.println("dishQuantity: "+dishQuantity);
		System.out.println("totalDishes: "+totalDishes);
		
	}

}
