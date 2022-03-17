package Fis.B2;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class DateValidation implements IValidation {

	@Override
	public boolean validation(String data) {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
		Date startDate;
		try {
			startDate = df.parse(data);
			String d = df.format(startDate);
				if(data.equalsIgnoreCase(d)) {
					return true;
					}
			} 
			catch (ParseException e) {
				return false;
				}
		return false;
	}
}