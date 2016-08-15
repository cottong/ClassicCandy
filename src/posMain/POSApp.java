package posMain;

import java.util.ArrayList;

public class POSApp {

	public static void main(String[] args) {

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

	}

}
