import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter integer between 1 to 1000 :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int t1 = 1 + (number-100)/ 100;
		int t2 = (1 + (number-10)/ 10) % 10;
		int t3 = number % 10;
		int product = t1 * t2 * t3;
		
		System.out.println("Result = " + product);

	}

}
