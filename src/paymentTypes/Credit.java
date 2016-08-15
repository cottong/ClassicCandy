package paymentTypes;

import java.util.Date;

public class Credit extends Payment {
	String creditCardNumber;
	Date expiration;
	int CVV;
	
	
	
	public Credit(String creditCardNumber, Date expiration, int cVV) {
		
		setCreditCardNumber(creditCardNumber);
		setExpiration(expiration);
		setCVV(cVV);
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	public int getCVV() {
		return CVV;
	}

	public void setCVV(int cVV) {
		CVV = cVV;
	}


}