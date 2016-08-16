package posMain;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
//import java.paymentTypes.*;
import paymentTypes.CandyWriteFile;
import paymentTypes.Payment;

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
		
		//System.out.println(candyName);
		
		//prompt the user for a quantity
		System.out.println("How many " + candyName + " do you want to buy today?");
		int quantity = scan1.nextInt();
		scan1.nextLine();
		//Payment.setQuantity(quantity);
		
		//output subtotal
		

		System.out.println();
		
	}

}
