package collections;

import java.util.Currency;

public class CurrencyExample {
	public static void main(String args[]) {
		Currency curr = Currency.getInstance("USD");
		System.out.println("Currency Code: "+curr.getCurrencyCode());
		System.out.println("Currency Symbol: "+curr.getSymbol());
		System.out.println("Currency Name: "+curr.getDisplayName());
		
		Currency curr1 = Currency.getInstance("INR");
		System.out.println("Currency Code: "+curr1.getCurrencyCode());
		System.out.println("Currency Symbol: "+curr1.getSymbol());
		System.out.println("Currency Name: "+curr1.getDisplayName());
		
		Currency curr2 = Currency.getInstance("JPY");
		System.out.println("Currency Code: "+curr2.getCurrencyCode());
		System.out.println("Currency Symbol: "+curr2.getSymbol());
		System.out.println("Currency Name: "+curr2.getDisplayName());
		
		Currency curr3 = Currency.getInstance("KWD");
		System.out.println("Currency Code: "+curr3.getCurrencyCode());
		System.out.println("Currency Symbol: "+curr3.getSymbol());
		System.out.println("Currency Name: "+curr3.getDisplayName());
		
		Currency curr4 = Currency.getInstance("RUB");
		System.out.println("Currency Code: "+curr4.getCurrencyCode());
		System.out.println("Currency Symbol: "+curr4.getSymbol());
		System.out.println("Currency Name: "+curr4.getDisplayName());
		
		
		Currency curr5 = Currency.getInstance("EUR");
		System.out.println("Currency Code: "+curr5.getCurrencyCode());
		System.out.println("Currency Symbol: "+curr5.getSymbol());
		System.out.println("Currency Name: "+curr5.getDisplayName());
		
		
		
	}
}
