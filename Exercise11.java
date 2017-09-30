import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thomas Sidelmann Kokholm
 * @version 1.0.0
 *
 */
public class Exercise11 {

	/**
	 * Currency Conversion
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner indput = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("How many euros are you exchaning? ");
		double euros = indput.nextDouble();
		System.out.print("What is the exchange rate? ");
		double exchangeRateEuro = indput.nextDouble();
		System.out.format("%.0f euros at an exchange rate of %.2f is\n81",euros,exchangeRateEuro);
		double dollars = euroToDollar(euros,exchangeRateEuro);
		
		System.out.format("%.2f U.S. dollars.",dollars);
		// closing the input scanner
		indput.close();
	}

	private static double euroToDollar(double euros, double exchangeRateEuro) {
        // http://sagecell.sagemath.org
        // solve(111.38==(81*137.51)/x,x)
        // [x == (1113831/11138)]  = 100,0027832644999
        // dollar exchange rate the author used for the example output
		return (euros*exchangeRateEuro)/100.00;//dollarRate
	}

}
