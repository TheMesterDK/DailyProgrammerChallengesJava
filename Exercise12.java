import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thomas Sidelmann Kokholm
 * @version 1.0.0
 *
 */
public class Exercise12 {

	/**
	 * Computing Simple Interest
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner indput = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Enter the principal: ");
		double principal = indput.nextDouble();
		System.out.println("Enter rate of interest: ");
		double rate = indput.nextDouble();
		System.out.println("Enter the number of years: ");
		int years = indput.nextInt();
		
		System.out.format("After %d years at %.1f%%, the investment will\nbe worth $%.2f.",years, rate, simpleInterest(principal,rate,years));

		// closing the input scanner
		indput.close();

	}

	private static double simpleInterest(double principal, double rate, int years) {
		// A = P(1 +rt)
        // P = principal amount
        // r = annual rate of interest
        // t = number of years
		return principal*(1+(rate/100)*years);
	}

}
