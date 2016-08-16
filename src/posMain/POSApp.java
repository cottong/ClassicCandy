package posMain;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import paymentTypes.*;

public class POSApp {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner (System.in);
		
		ArrayList<ProductClass> list = new ArrayList<ProductClass>();
		list.add(new ProductClass("m&m", "chocolate", "chocolate with candy coating", 1.89));
		list.add(new ProductClass("Hershey's Kiss", "chocolate", "small delicious chocolate", 1.89));
		list.add(new ProductClass("Snickers", "chocolate", "chocolate with nuts and caramel", 1.89));
		list.add(new ProductClass("Twizzlers", "chewy candy", "red licorice", 1.50));
		list.add(new ProductClass("Reese's peanut butter cups", "chocolate", "chocolate with peanut butter", 1.89));
		list.add(new ProductClass("Kit-Kat", "chocolate", "chocolate covered waffers", 1.89));
		list.add(new ProductClass("Gummi bears/worms/ etc", "chewy candy", "gummy yummy candy", 1.89));
		list.add(new ProductClass("Butterfinger", "chocolate", "chocolate covered toffee", 1.89));
		list.add(new ProductClass("Twix", "chocolate", "chocolate, caramel covered cookie", 1.89));
		list.add(new ProductClass("Hershey Bar", "chocolate", "smooth milk chocolate", 1.89));
		list.add(new ProductClass("Jelly Belly", "chewy candy", "small jelly beans", 1.89));
		list.add(new ProductClass("Three Musketeers", "chocolate", "chocolate covered nugget", 1.89));
		list.add(new ProductClass("Candy Corn", "chewy candy", "small halloween candy", 1.89));

		
		//greet the user
		System.out.println("Welcome to the Classic Candy Store.\nHere are the candies you can choose from: ");
		
		//read the text file and prints to the console
		Path filePath = Paths.get("CandyData.txt");
		File myCandyFile = filePath.toFile();
		CandyWriteFile.readFile(myCandyFile);
		
		//prompt the user choose an item
		int candyNumber = scan1.nextInt();
		scan1.nextLine();
		String candyName = list.get(candyNumber - 1).getName();
		double candyPrice = list.get(candyNumber - 1).getPrice();
		
		//System.out.println(candyName);
		
		//prompt the user for a quantity
		System.out.println("How many " + candyName + " do you want to buy today?");
		int quantity = scan1.nextInt();
		scan1.nextLine();
		System.out.println("Would you like to pay with CASH, CREDIT or CHECK?");
		String paymentMethod = scan1.nextLine();
		
		if (paymentMethod.equalsIgnoreCase("cash")) {
			//create Cash object; set to a variable
			Cash sale1 = new Cash();
			//in order to calculate a cash sale, need price and quantity
			sale1.setPrice(candyPrice);
			sale1.setQuantity(quantity);
			
			/*System.out.println(sale1.calcSubtotal());
			System.out.println(sale1.calcSalesTax());
			System.out.println(sale1.calcGrandTotal());
			System.out.println(sale1.calcChange());*/
		}
		
		
		
	}

}
