import java.util.Scanner;
public class GroceryDiscountSecondVersion {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		double moneySpent = 1;
	
		while (moneySpent != 0) {
			System.out.print("Enter the cost of your groceries, or type '0' to quit: ");
			moneySpent = in.nextDouble();
		
			while (moneySpent>1000) {
				System.out.print("Please enter a cost that is less than $1,000, or type '0' to quit: ");
				moneySpent = in.nextDouble();
			} //Validating that the cost isn't bigger than 1000. Will keep asking for proper amount
				
		if (moneySpent == 0) {
			break;
		} //break statement
		
		double eightPercentDiscount = moneySpent*0.08;
		double tenPercentDiscount = moneySpent*0.10;
		double twelvePercentDiscount = moneySpent*0.12;
		double fourteenPercentDiscount = moneySpent*0.14;
		
		if (moneySpent < 10) {
			System.out.println("You are not eligible for a coupon.");
		} // spending less than 10
		else if (moneySpent <= 60) {
			System.out.print("You earn a discount coupon of $");
			System.out.printf("%.2f", eightPercentDiscount);
			System.out.print(". (8% of your purchase)");
			System.out.println(" ");
		} // if spending 60 or more
		else if (moneySpent <= 150) {
			System.out.print("You earn a discount coupon of $");
			System.out.printf("%.2f", tenPercentDiscount);
			System.out.print(". (10% of your purchase)");
			System.out.println(" ");
		} // if spending 150 or more
		else if (moneySpent <= 210) {
			System.out.print("You earn a discount coupon of $");
			System.out.printf("%.2f", twelvePercentDiscount);
			System.out.print(". (12% of your purchase)");
			System.out.println(" ");
		} // if spending 210 or more
		else if (moneySpent > 210) {
			System.out.print("You earn a discount coupon of $");
			System.out.printf("%.2f", fourteenPercentDiscount);
			System.out.print(". (14% of your purchase)");
			System.out.println(" ");
		} // spending more than 210
		
		System.out.println(" ");
		
		} //while loop for main cost prompt
		
		in.close();
		
	} //main

} //class
