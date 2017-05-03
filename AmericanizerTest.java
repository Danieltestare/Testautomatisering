package se.iths;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AmericanizerTest {

	public static Americanizer americanizerTest;
	@BeforeClass
	public static void Start(){
		americanizerTest = new Americanizer();
		MeasureConverter mc = new MeasureConverter();
		americanizerTest.setWeightConverter(mc);
		TimeConverter tc = new TimeConverter();
		americanizerTest.setTimeConverter(tc);
	}
	
	@Test
	public void testconvertToPound() {
		int result = americanizerTest.convertToPound(10);
	assertEquals(3, result);
	}

	@Test
	public void testconvertToFeet() {
		int result = americanizerTest.convertToFeet(30);
		assertEquals(1, result);		
	}
	
	@Test
	public void testconvertSpeach() {
		String result = americanizerTest.convertSpeach("Cowabunga");
		assertEquals("yo dude!" + "Cowabunga" + ", you know?", result);
	}
		
	@Test
	public void testTimeConvertAM() {
		String result = americanizerTest.convertTime(10);
		assertEquals("10 AM", result);
	}
	@Test
	public void testTimeConvertPM() {
		String result = americanizerTest.convertTime(15);
		assertEquals("3 PM", result);
	}
}
