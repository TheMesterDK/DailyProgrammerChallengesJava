import java.time.Year;
import java.util.Scanner;

/**
 * @author Thomas Sidelmann Kokholm
 * @version 1.0.0
 *
 */
public class Exercise6 {

	/**
	 * Retirement Calculator
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner indput = new Scanner(System.in);
		
		System.out.println("What is your current age?");
		int age = indput.nextInt();
		System.out.println("At what age would you like to retire?");
		int retire = indput.nextInt();
		
		int timeToRetireAge = retire - age;
		if (timeToRetireAge > 0)
        {
            System.out.format("You have %d years left until you can retire.\n",timeToRetireAge);
        }
        else{
            System.out.format("You did allready retire %d years ago.\n",Math.abs(timeToRetireAge));
        }

		int year = Year.now().getValue();
        int retireAge = year + timeToRetireAge;
        
        System.out.format("It's %d, so you can retire in %d.\n", year, retireAge);
		
		// closing the input scanner
		indput.close();
	}

}