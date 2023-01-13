import java.util.Scanner;
public class ConditionalConstructs {

	public static void main(String[] args) {
		final int HUNGRY = 101;
		final int SIMPLNEW = 201;
		int promoCodeByUser = 0;
		
		double amount = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter order amount: ");
		amount = scanner.nextDouble();
		
		System.out.println("Enter the promo code: ");
		promoCodeByUser = scanner.nextInt();
		
		System.out.println("Enter your naviugation choice: ");
		int choice = scanner.nextInt();
		
		scanner.close();
		
//		System.out.println("AMOUNT: \u20b9"+amount);
//		System.out.println("PROMO CODE: "+promoCodeByUser);
//		
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// 1. Simple if/else
//		if(amount >= 159) {
//			System.out.println("You can Apply promo code HUNGRY");
//		}
//		else {
//			System.out.println("You need to add items worth \u20b9"+(159-amount)+" more");
//		}
//	
//		// 2. Nested IF else
//		if(amount >= 159 && promoCodeByUser == HUNGRY) {
//			System.out.println("Promo Code Apllied Successfully :)");
//			double discount = 0.10 * amount;
//			if(discount > 40) {
//				discount = 40;
//			}
//			System.out.println("DISCOUNT: \u20b9"+discount);
//			System.out.println("FINAL AMOUNT IS: \u20b9"+(amount - discount));
//		}
//		else {
//			System.out.println("Either amount is less or promocode is Invalid !");
//		}
		
		
//		if(promoCodeByUser == HUNGRY) {
//			if(amount >= 159) {
//				System.out.println("Promo Code Apllied Successfully :)");
//				double discount = 0.10 * amount;
//				if(discount > 40) {
//					discount = 40;
//				}
//				System.out.println("DISCOUNT: \u20b9"+discount);
//				System.out.println("FINAL AMOUNT IS: \u20b9"+(amount - discount));
//			}
//			else {
//				System.out.println("You need to add items worth \u20b9"+(159-amount)+" more");
//			}
//		}
//		else {
//			System.out.println("Invalid Promo Code, Please try Again !! ");
//		}
//		
		
		// 3. Ladder of if/else
		
//		if(promoCodeByUser == HUNGRY) {
//			if(amount >= 200) {
//				System.out.println("Promo Code HUNGRY Apllied Successfully :)");
//				double discount = 0.20 * amount;
//				if(discount > 100) {
//					discount = 100;
//				}
//				System.out.println("DISCOUNT: \u20b9"+discount);
//				System.out.println("FINAL AMOUNT IS: \u20b9"+(amount - discount));
//			}else {
//				System.out.println("You need to add items worth \u20b9"+(200-amount)+" more");
//			}
//		}else if(promoCodeByUser == SIMPLNEW) {
//			if(amount >= 159) {
//				System.out.println("Promo SIMPLNEW Code Apllied Successfully :)");
//				System.out.println("DISCOUNT: \u20b9"+40);
//				System.out.println("FINAL AMOUNT IS: \u20b9"+(amount - 40));
//			}
//			else {
//				System.out.println("You need to add items worth \u20b9"+(159-amount)+" more");
//		}
//			}
//		else {
//			System.out.println("Invalid Promo Code, Please try Again !! ");
//		}
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		switch(promoCodeByUser) {
		case HUNGRY:
			if(amount >= 200) {
				System.out.println("Promo Code HUNGRY Apllied Successfully :)");
				double discount = 0.20 * amount;
				if(discount > 100) {
					discount = 100;
				}
				System.out.println("DISCOUNT: \u20b9"+discount);
				System.out.println("FINAL AMOUNT IS: \u20b9"+(amount - discount));
			}else {
				System.out.println("You need to add items worth \u20b9"+(200-amount)+" more");
			}
			break;
		case SIMPLNEW:
			if(amount >= 159) {
				System.out.println("Promo SIMPLNEW Code Apllied Successfully :)");
				System.out.println("DISCOUNT: \u20b9"+40);
				System.out.println("FINAL AMOUNT IS: \u20b9"+(amount - 40));
			}
			else {
				System.out.println("You need to add items worth \u20b9"+(159-amount)+" more");
		}
			
			break;
			default:
				System.out.println("Invalid selection, please try again !");
		
		}
		
		// In java FINAL keyword name always in capital letters
		// Symbolic constants
		final int TODAYS_DEALS = 1;
		final int CUSTOMER_SERVICE = 2;
		final int BEST_SELLERS = 3;
		final int MOBILES = 4;
		final int ELECTRONICS = 5;
		
		// Note: In Switch case we can't pass a variable because it can be modified, so always make it constant by adding FINAL keyword.
		switch(choice) {
		case TODAYS_DEALS:
			System.out.println("Nvaigating to the page: https://www.amazon.in/deals?ref_=nav_cs_gb");
			break;
		case CUSTOMER_SERVICE:
			System.out.println("Nvaigating to the page: https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help");
			break;
		case BEST_SELLERS:
			System.out.println("Nvaigating to the page: https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellersb");
			break;
		case MOBILES:
			System.out.println("Nvaigating to the page: https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
			break;
		case ELECTRONICS:
			System.out.println("Nvaigating to the page: https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
			break;
			default: 
				System.out.println("Invalid Choice !");
		}
		
		
	}

}
