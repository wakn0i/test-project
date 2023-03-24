import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//tax rate
		double retailprice = 1;
		
		// Create scanner object
		Scanner Scanner = new Scanner(System.in);
				
		// Read input from user
		System.out.print("Retail Price = RM");
		int tax = Scanner.nextInt();
		
		double sales_tax = retailprice*0.075;
		

		//Display results
		System.out.println("Sales Tax Rate = RM" + String.format("%.2f", sales_tax) );
		

	}

}
