package co.com.sofka.banca;

import org.codehaus.plexus.component.configurator.converters.basic.DateConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateCreator {
	
	public static Date date(String dateString) {

		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
		Date date= null;
		try {
			date= formatter.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
