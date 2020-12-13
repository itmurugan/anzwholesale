package com.anz.wholesale.util;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class MoneySerializer extends JsonSerializer<BigDecimal> {
	@Override
	public void serialize(BigDecimal value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		// put your desired money style here

		// Get current locale information
		Locale currentLocale = Locale.getDefault();

		// Get currency instance from locale; This will have all currency related
		// information
		Currency currentCurrency = Currency.getInstance(currentLocale);

		// Currency Formatter specific to locale
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
		
		//To remove the currency symbol
		DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyFormatter).getDecimalFormatSymbols();
		decimalFormatSymbols.setCurrencySymbol("");
		((DecimalFormat) currencyFormatter).setDecimalFormatSymbols(decimalFormatSymbols);

		
		jgen.writeString(currencyFormatter.format(value));
	}
}
