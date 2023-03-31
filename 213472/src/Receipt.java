import java.util.Scanner;
public class Receipt {

	public static void main(String[] args) {
		
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		
		// Declare variable item 1
		String item1 = "";
		int quantity_item1 = 0 ; 
		double price_item1 = 0 ;
		
		// Declare variable item 2
		String item2 = "";
		int quantity_item2 = 0 ; 
		double price_item2 = 0 ;
		
		// Read input from user item1
		System.out.print("item1 :");
		item1 = sc.nextLine();
		System.out.print("quantity :");
		quantity_item1 = sc.nextInt();
		System.out.print("unit price :");
		price_item1 = sc.nextDouble();
		
		sc.nextLine();
		
		// Read input from user item2
		System.out.print("item2 :");
		item2 = sc.nextLine();
		System.out.print("quantity :");
		quantity_item2 = sc.nextInt();
		System.out.print("unit price :");
		price_item2 = sc.nextDouble();
		
		// Operation
		double GOVENRNMENT_TAX_RATE = 0.06;
		double SERVICE_CHARGE_RATE = 0.10;
		double total_price_item1 = quantity_item1*price_item1;
		double total_price_item2 = quantity_item2*price_item2;
		double subtotal = total_price_item1+total_price_item2;
		double government_tax = subtotal*GOVENRNMENT_TAX_RATE;
		double service_charge = subtotal*SERVICE_CHARGE_RATE;
		double Total = subtotal + government_tax + service_charge;
				
		//Display results item 1
		System.out.println("Item 1 : " + item1);
	    System.out.println("Quantity : " + quantity_item1);
		System.out.println("Unit price: " + String.format("%.2f", price_item1));
		System.out.println("Amount : " + String.format("%.2f", total_price_item1));
		
		System.out.println("*************");

		//Display results item 2
		System.out.println("Item 2 : " + item2);
		System.out.println("Quantity : " + quantity_item2);
		System.out.println("Unit price : " + String.format("%.2f", price_item2));
		System.out.println("Amount : " + String.format("%.2f", total_price_item2));
		
		//Display results
		System.out.println("Subtotal = RM" + String.format("%.2f", subtotal) );	
		System.out.println("Tax = RM" + String.format("%.2f", government_tax) );
		System.out.println("Service charge = RM" + String.format("%.2f", service_charge) );
		
		System.out.println("Total = RM" + String.format("%.2f", Total) );
		
		


	}

}
