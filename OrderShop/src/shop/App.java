package shop;
import java.io.IOException;

public class App  {

	public static void main(String[] args) throws IOException {

		Menu menu = new Menu();
		System.out.println(menu.displayDessert());
//		
//	    System.out.println(orders.calculateBill());
//	    
       new GUI(menu);
    
//	    

//	    orders.FinalReport("Report.csv", "CUST1009");

	}
}