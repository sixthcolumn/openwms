package com.sixthc.util;

import java.sql.Timestamp;

import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtil {
	public static Timestamp parseDate(XMLGregorianCalendar from) {
		if (from != null) {
			Timestamp timestamp = new Timestamp(from.toGregorianCalendar()
					.getTimeInMillis());
			return timestamp;
		}
		return null;
	}
}
