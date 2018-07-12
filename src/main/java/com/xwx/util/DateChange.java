package com.xwx.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateChange {

	@Test
	public void test() throws ParseException {

		String string = "2016-10-24 21:59:06";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.parse(string));

	}

}
