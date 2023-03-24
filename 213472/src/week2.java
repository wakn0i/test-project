import java.util.Scanner;
public class week2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double kilo = 1.6;
		
		// Create scanner object
		Scanner Scanner = new Scanner(System.in);
				
		// Read input from user
		System.out.print("mile");
		int mile= Scanner.nextInt();
		
		double total = mile*1.6;
		
		//Display results
		System.out.println(total);
		System.out.println("Total" + String.format("%.2f", total) );
	

}}
