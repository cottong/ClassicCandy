package posMain;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

//import java.paymentTypes.*;


import paymentTypes.*;

public class POSApp {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		ArrayList<ProductClass> list = new ArrayList<ProductClass>();

		list.add(new ProductClass("m&m", "chocolate",
				"chocolate with candy coating", 1.00));

		list.add(new ProductClass("Hershey's Kiss", "chocolate",
				"small delicious chocolate", 2.00));

		list.add(new ProductClass("Snickers", "chocolate",
				"chocolate with nuts and caramel", 1.89));

		list.add(new ProductClass("Twizzlers", "chewy candy", "red licorice",
				1.50));

		list.add(new ProductClass("Reese's", "chocolate",
				"chocolate with peanut butter", 1.89));

		list.add(new ProductClass("Kit-Kat", "candy bar",
				"chocolate covered waffers", 1.89));

		list.add(new ProductClass("Gummi bears", "chewy candy",
				"gummy yummy candy", 1.89));

		list.add(new ProductClass("Butterfinger", "candy bar",
				"chocolate covered toffee", 1.89));

		list.add(new ProductClass("Twix", "candy bar",
				"chocolate, caramel covered cookie", 1.89));

		list.add(new ProductClass("Hershey Bar", "candy bar",
				"smooth milk chocolate", 1.89));

		list.add(new ProductClass("Jelly Belly", "chewy candy",
				"small jelly beans", 1.89));

		list.add(new ProductClass("Three Musketeers", "candy bar",
				"chocolate covered nugget", 1.89));

		list.add(new ProductClass("Candy Corn", "chewy candy",
				"small halloween candy", 1.89));

		list.add(new ProductClass("Peppermint Patties", "chocolate",
				"a refreshing mix minty chocolate covered yumminess", 2.85));

		list.add(new ProductClass(
				"Tootsie Rolls",
				"hard candy",
				"Can you get to the end of a tootsie roll pop?  Hard candy with chocolate goodness",
				1.50));

		list.add(new ProductClass("Skittles", "chewy candy",
				"A chewy, hard at first, sweet candy", 2.50));

		list.add(new ProductClass("Cadbury eggs", "chocolate",
				"chocolate covered gueyness", 1.29));

		list.add(new ProductClass("Milky Way", "candy bar",
				"milk chocolate with caramel and nugget", 1.89));

		list.add(new ProductClass("Swedish Fish", "chewy",
				"old school favorite", .25));

		list.add(new ProductClass("Cotton Candy", "strait sugar",
				"melts in your mouth to sugar", 2.50));

		list.add(new ProductClass("Junior Mints", "chocolate",
				"chocolate covered mint", 1.89));

		list.add(new ProductClass("Reese's pieces", "chocolate",
				"peanut butter pieces", 1.89));

		list.add(new ProductClass("Peeps", "strait sugar",
				"fun candy that has a face", 1.29));

		list.add(new ProductClass("Payday", "candy bar", "peanuts and caramel",
				1.89));

		list.add(new ProductClass("Baby Ruth", "candy bar",
				"chocolate covered nuts", 1.89));

		list.add(new ProductClass("Starburst", "chewy",
				"bursts of fruit flavor", 1.89));

		list.add(new ProductClass("Atomic Fireballs", "hardcandy",
				"not for the weak, hot", 1.79));

		list.add(new ProductClass("Sour Patch Kids", "chewy",
				"first they are sweet then they're sour", 1.89));

		list.add(new ProductClass("Almond Joy", "candy bar",
				"coconuts covered in chocolate", 1.49));

		list.add(new ProductClass("Blow pops", "hard candy",
				"sucker with gum inside", 1.89));

		list.add(new ProductClass("Pixie sticks", "strait sugar",
				"flavored sugar in a stick", 1.39));

		list.add(new ProductClass("Milk duds", "chocolate",
				"chocolate and caramel bits", 1.79));

		list.add(new ProductClass("Pez", "strait sugar",
				"cool dispensers and little candies", 1.89));

		list.add(new ProductClass("Smarties", "strait sugar",
				"Small candies that make you smarter", 1.89));

		list.add(new ProductClass("Mr. Goodbar", "candy bar",
				"peanuts and chocolate", 1.89));

		list.add(new ProductClass("Toblerone", "candy bar",
				"peanuts and caramel", 1.89));

		list.add(new ProductClass("Jolly Ranchers", "hard candy",
				"intense sweetness", 1.89));

		list.add(new ProductClass("Red Vines", "chewy", "licorice", 1.89));

		list.add(new ProductClass("Salt Water Taffy", "chewy", "taffy", 1.59));

		list.add(new ProductClass("Candy cigarettes", "hard candy",
				"sugar stick", 1.89));

		list.add(new ProductClass("Pocky", "chewy", "sweet candy", 1.89));

		list.add(new ProductClass("Nerds", "strait sugar",
				"a favorite for parties", 1.89));

		list.add(new ProductClass("Necco Wafers", "strait sugar",
				"a rollerskating favorite", 1.89));

		list.add(new ProductClass("Pop rocks", "strait sugar",
				"it will pop in your mouth", 1.89));

		list.add(new ProductClass("Sugar daddy", "chewy",
				"caramel covered with chocolate", 1.59));

		list.add(new ProductClass("Wax lips", "wax candy", "novelty candy",
				1.89));

		list.add(new ProductClass("Circus peanuts", "peanuts", "peanuts", 1.89));

		list.add(new ProductClass("Nik-L-Nips", "wax candy", "wax bottles",
				1.89));

		list.add(new ProductClass("Werthers", "hard candy",
				"hard caramel", 1.89));

		// greet the user

		System.out

				.println("Welcome to the Classic Candy Store.\nHere are the candies you can choose from: ");

		// read the text file and prints to the console

		Path filePath = Paths.get("CandyData.txt");

		File myCandyFile = filePath.toFile();

		CandyWriteFile.readFile(myCandyFile);

		// one loop for name, price, quantity. gather all together in a loop,

		// the do payment processing

		String choice = "yes";

		double totalSubtotal = 0.00;
		ArrayList<Receipt> itemsPurchased = new ArrayList<Receipt>();
		
		while (choice.equalsIgnoreCase("yes")) {
			int candyNumber = 1;
			String candyName = "";
			// tests for candy number input

			while (true) {
				try {
					System.out
							.println("What kind of candy would you like today? (Enter candy number)");
					candyNumber = scan1.nextInt();
					scan1.nextLine();
					candyName = list.get(candyNumber - 1).getName();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Please enter a correct candy number");
					scan1.nextLine();
				} catch (IndexOutOfBoundsException e) {
					System.out.println("That candy doesnt exist! Try again");
				}
			}
			double candyPrice = list.get(candyNumber - 1).getPrice();
			// tests for quantity input

			int quantity = 0;
			while (true) {
				try {
					System.out.println("How many " + candyName
							+ " do you want to buy today?");
					quantity = scan1.nextInt();
					scan1.nextLine();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Please enter a correct quantity");
					scan1.nextLine();
				}
			}

			double subTotal = candyPrice * quantity;
			Receipt r = new Receipt(candyName, quantity, candyPrice, subTotal);
			itemsPurchased.add(r);

			totalSubtotal = totalSubtotal + subTotal;
			System.out
					.println("Would you like to choose another item? (YES or NO)");
			choice = scan1.nextLine();

		}

		System.out.println("Would you like to pay with CASH, CREDIT or CHECK?");
		String paymentMethod = scan1.nextLine();
		while (true) {

			if (paymentMethod.equalsIgnoreCase("cash")) {

				// create Cash object; save totalSubtotal value in order to

				// calculate subTotal

				Cash cashSale = new Cash();

				cashSale.setSubTotal(totalSubtotal);

				System.out.println("Grand Total: "

				+ cashSale.formatNumber(cashSale.calcGrandTotal()));

				System.out.println("Change: "

				+ cashSale.formatNumber(cashSale.calcChange()));

				break;

			} else if (paymentMethod.equalsIgnoreCase("credit")) {

				System.out.println("Please enter your credit card number.");

				String creditCardNumber = scan1.nextLine();

				System.out.println("Please enter your card's CVV:");

				int cVV = scan1.nextInt();

				scan1.nextLine();

				System.out

						.println("Please enter the card's expiration date: (mm/dd/yyyy)");

				String expiration = scan1.nextLine();

				Credit creditSale = new Credit(creditCardNumber, expiration,

				cVV);

				System.out.println("Thank you for your purchase.");

				break;

			} else if (paymentMethod.equalsIgnoreCase("check")) {

				System.out.println("Please enter the check number: ");

				int checkNumber = scan1.nextInt();

				scan1.nextLine();

				Check checkSale = new Check();

				checkSale.setCheckNumber(checkNumber);

				System.out

				.println("Your paid with check number " + checkNumber);

				break;

			} else {

				System.out

						.println("You have to pay us! Please enter \"Cash\" \"Credit\" or \"Check\"");

				paymentMethod = scan1.nextLine();

			}

		}
		System.out.println();

		System.out.println("Classic Candy Store");
		System.out.println("123 Grand Circus Drive");
		System.out.println("Detroit, MI 48201");
		System.out.println();
		System.out.format("Candy Name"+ "\t" + "Quantity" + "\t"+ "Total");
		System.out.println();
		for (int i = 0; i < itemsPurchased.size(); i++) {
			System.out.format(itemsPurchased.get(i).getCandyName() +"\t" +  itemsPurchased.get(i).getQuantity() + "\t"+itemsPurchased.get(i).getPrice() +"\t" + itemsPurchased.get(i).getSubTotal());
			System.out.println();

		}

	}

}