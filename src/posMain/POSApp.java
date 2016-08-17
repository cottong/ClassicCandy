package posMain;

import java.io.File;

import java.nio.file.Path;

import java.nio.file.Paths;

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

		list.add(new ProductClass("Reese's peanut butter cups", "chocolate",

				"chocolate with peanut butter", 1.89));

		list.add(new ProductClass("Kit-Kat", "chocolate",

				"chocolate covered waffers", 1.89));

		list.add(new ProductClass("Gummi bears/worms/ etc", "chewy candy",

				"gummy yummy candy", 1.89));

		list.add(new ProductClass("Butterfinger", "chocolate",

				"chocolate covered toffee", 1.89));

		list.add(new ProductClass("Twix", "chocolate",

				"chocolate, caramel covered cookie", 1.89));

		list.add(new ProductClass("Hershey Bar", "chocolate",

				"smooth milk chocolate", 1.89));

		list.add(new ProductClass("Jelly Belly", "chewy candy",

				"small jelly beans", 1.89));

		list.add(new ProductClass("Three Musketeers", "chocolate",

				"chocolate covered nugget", 1.89));

		list.add(new ProductClass("Candy Corn", "chewy candy",

				"small halloween candy", 1.89));

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

		double totalSubtotal = 0.0;

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

	}

}