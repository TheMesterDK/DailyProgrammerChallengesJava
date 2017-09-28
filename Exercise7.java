import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Thomas Sidelmann Kokholm¨
 * @version 1.0.0
 *
 */
public class Exercise7 {

	/**
	 *  Area of a Rectangular Room
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Lets get the scanner ready for console inputs 8-)
		Scanner indput = new Scanner(System.in);
		
		// unhandled Exception, here we come, make sure its an number ;-)
		// TODO ver2 make valid number number method
		System.out.println("What is the length of the room in feet? ");
		int roomLen = indput.nextInt();
		
		System.out.println("What is the width of the room in feet? ");
		int roomWidth = indput.nextInt();
		
		System.out.format("You entered dimensions of %d feet by %d feet.\n",roomLen,roomWidth);
		System.out.println("The area is");
		float area = roomLen*roomWidth;
		System.out.format("%.0f square feet\n", area);
		float areaM2 = area * 0.09290304f;
		System.out.format("%.3f square meters\n", areaM2);
		// Thats all folks :-)
		indput.close();
	}
}