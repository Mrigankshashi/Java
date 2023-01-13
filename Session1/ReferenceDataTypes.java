
public class ReferenceDataTypes {

	public static void main(String[] args) {
		
		// Create Storage Containers
		// In Java, class names always starts with Capital letters and subsequent letters with Upper Case
		// Method name starts with lower case always
		String name = "Mrigank Shashi"; // we can create a storage container to store textual data
		// String is a built in class in Java
		
		// Array : Stores lot of data but in homogeneous form
		// Arrays gets indexed
		//				  0    1   2   3    4
		int [] prices = {108, 48, 40, 164, 208};
		
		// Read Storage Containers
		System.out.println("Name is: "+name);
		System.out.println("Prices is: "+prices);
		// Output is -> [I@7ad041f3 / Hash Code -> ('[' - means array, 'I' - Integral data, '@' - Denotes to, '7ad041f3' - Memory Location)
		System.out.println("Prices[0] is: "+prices[0]);
		System.out.println("Prices[1] is: "+prices[1]);
		System.out.println("Prices[2] is: "+prices[2]);
		System.out.println("Prices[3] is: "+prices[3]);
		System.out.println("Prices[4] is: "+prices[4]);
	}

}
