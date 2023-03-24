import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//multiplier
		double meter = 3.2786;
		
		// Create scanner object
		Scanner Scanner = new Scanner(System.in);
				
		// Read input from user
		System.out.print("feet");
		int feet= Scanner.nextInt();
		
		double total = feet*3.2786;

		//Display results
		System.out.println(total);
		System.out.println("Total" + String.format("%.2f", total) );
	


		
		

	}

}
