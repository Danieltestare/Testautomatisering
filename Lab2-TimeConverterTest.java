package se.iths;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TimeConverterTest {

	public static TimeConverter TimeConverterTest;
	@BeforeClass
	public static void Start(){
		TimeConverterTest = new TimeConverter();
	}
	@Test
	public void timeConverterPM() {
	String result = TimeConverterTest.getMeridiem(12);
	assertEquals("PM", result);
	
	}
	@Test
	public void timeConverterAM() {
	String result = TimeConverterTest.getMeridiem(4);
	assertEquals("AM", result);
	
	}

	@Test(expected=IllegalArgumentException.class)
	public void timeConverterIllegalArgument() {
	TimeConverterTest.getMeridiem(25);
	
	}
}
