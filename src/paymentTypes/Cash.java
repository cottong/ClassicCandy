package paymentTypes;

import java.util.Scanner;

public class Cash extends Payment {
	private double change;
	private double amountTendered;


	public double getAmountTendered() {
		return amountTendered;
	}
	public void setAmountTendered(double amountTendered) {
		this.amountTendered = amountTendered;
	}

	public double calcChange(){
		System.out.println("How much are you paying with today?");
		Scanner scan1 = new Scanner(System.in);
		double userInput = scan1.nextDouble();
		scan1.nextLine();
		setAmountTendered(userInput);
		change = getAmountTendered() - calcGrandTotal();
		scan1.close();
		return change;
	}

}
