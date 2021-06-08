package co.com.sofka.banca.app;

import co.com.sofka.banca.*;

import static co.com.sofka.banca.Amount.amountOf;
import static co.com.sofka.banca.DateCreator.date;

public class StartApp {
	
	public static void main(String[] args) {
		Account account = new Account(new Statement());
		
		account.deposit(amountOf(1000), date("10/01/2012"));
		account.deposit(amountOf(2000), date("13/01/2012"));
		account.withdrawal(amountOf(500), date("14/01/2012"));
		
		account.printStatement(System.out);
	}

}
