import java.util.Scanner;
public class GroceryDiscountSecondVersion {

	public static void main(String[] args) {
		
		/*Coupon discounts:
		 * 
		 * Less than $10: No discount
		 * $10 to $60 : 8%
		 * More than $60 to $150: 10%
		 * More than $150 to $210: 12%
		 * More than $210: 14%
		 * 
		 * "You win a discount of $amount (x% of your purchase)"
		 */
		 
		Scanner in = new Scanner(System.in);
		double moneySpent = 1;
		
		while (moneySpent != 0) {
		System.out.print("Please enter the cost of your groceries, or type '0' to quit: ");
		moneySpent = in.nextDouble();
		
		//How to validate that moneySpent is a number between 10-1000?
		
		if (moneySpent == 0) {
			break;
		} //break statement
		
		double eightPercentDiscount = moneySpent*0.08;
		double tenPercentDiscount = moneySpent*0.10;
		double twelvePercentDiscount = moneySpent*0.12;
		double fourteenPercentDiscount = moneySpent*0.14;
		
		if (moneySpent < 10) {
			System.out.println("You are not eligible for a coupon.");
		}
		else if (moneySpent <= 60) {
			System.out.print("You earn a discount coupon of $");
			System.out.printf("%.2f", eightPercentDiscount);
			System.out.print(". (8% of your purchase)");
			System.out.println(" ");
		}
		else if (moneySpent <= 150) {
			System.out.print("You earn a discount coupon of $");
			System.out.printf("%.2f", tenPercentDiscount);
			System.out.print(". (10% of your purchase)");
			System.out.println(" ");
		}
		else if (moneySpent <= 210) {
			System.out.print("You earn a discount coupon of $");
			System.out.printf("%.2f", twelvePercentDiscount);
			System.out.print(". (12% of your purchase)");
			System.out.println(" ");
		}
		else if (moneySpent > 210) {
			System.out.print("You earn a discount coupon of $");
			System.out.printf("%.2f", fourteenPercentDiscount);
			System.out.print(". (14% of your purchase)");
			System.out.println(" ");
		}
		
		System.out.println(" ");
		
		} //while loop for cost prompt
		
		in.close();
		
	} //main

} //class
