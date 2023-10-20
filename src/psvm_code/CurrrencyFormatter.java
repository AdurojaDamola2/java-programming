package psvm_code;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrrencyFormatter {
	
	public static void main (String[] args) {
		double amount = 12324.134;
		
		NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
		String usFormatted = usFormat.format(amount);
		
		Locale indiaLocale = new Locale("en", "IN");
		NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
		String indiaFormatted = indiaFormat.format(amount);
		indiaFormatted = indiaFormatted.replaceAll ("₹", "RS");
		
		NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String chinaFormatted = chinaFormat.format(amount);
		
		NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String franceFormatted = franceFormat.format(amount);
		
		System.out.println("US: " + usFormatted);
		System.out.println("India: " + indiaFormatted);
		System.out.println("China: " + chinaFormatted);
		System.out.println("France: " + franceFormatted);
	}
}
