package se.iths;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;

public class MeasureConverterTest {

	public static MeasureConverter MeasureConverterTest;
	@BeforeClass
	public static void Start(){
		MeasureConverterTest = new MeasureConverter();
	}
	
	@Test
	public void convertWeight() {
		int result = MeasureConverterTest.convertWeight(15, false);
		assertEquals(40, result);
	}

	@Test
	public void convertWeight2(){
		int result = MeasureConverterTest.convertWeight(30, true);
		assertEquals(11, result);
	}
	public void convertToFeet(){
		int result = MeasureConverterTest.convertToFeet(100);
		assertEquals(3, result);
	}

}
