package se.iths;

import org.junit.Before;
import static org.junit.Assert.*;

import org.junit.Test;

public class Lab1test {

	Lab1 test;

	@Before
	public void defineLab1() {
		test = new Lab1();
	}

	@Test
	public void test() {
		int result = test.add(1, 2);
		assertEquals(3, result);
	}

	@Test
	public void testsubtract() {
		int result = test.subtract(1, 2);
		assertEquals(-1, result);
	}

	@Test
	public void testmultiply() {
		;
		int result = test.multiply(1, 2);
		assertEquals(2, result);
	}

	@Test
	public void testdivide() {
		int result = test.divide(6, 3);
		assertEquals(2, result);
	}

	@Test
	public void reversetest() {
		String result = test.reverse("abcde");
		assertEquals("edcba", result);

	}

	@Test
	public void testquote(){ 
		Boolean a = false;
		Boolean b = true;
		Boolean c = true;
		Boolean d = true;
		Boolean e = true;
		Boolean f = true;
		Boolean g = true;
		Boolean h = true;
		for (int number = 1; number < 100; number++){
			String result = test.quote();
			if (result.equals("We cannot solve our problems with the same thinking we used when we created them. - Albert Einstein")){
			a = true;
			
			}
		
			if (result.equals("A fool thinks himself to be wise, but a wise man knows himself to be a fool. - William Shakespeare")){
			b = true;
			}
			if (result.equals("You must be the change you wish to see in the world. - Mahatma Gandhi")){
			c = true;
			}
			if (result.equals("In the End, we will remember not the words of our enemies, but the silence of our friends. - Martin Luther King, Jr.")){
			d = true;
			}
			if (result.equals("Choose a job you love, and you will never have to work a day in your life. - Confucius")){
			e = true;
			}
			
			if (result.equals("To expect the unexpected shows a thoroughly modern intellect. - Oscar Wilde")){
			f = true;
			}
			
			if (result.equals("Without music, life would be a mistake. - Friedrich Nietzsche")){
			g = true;
			}
			
			if (result.equals("I love deadlines. I like the whooshing sound they make as they fly by. - Douglas Adams")){
			h = true;
			}
			}
			assertTrue("Did not find: We cannot", a);
			assertTrue("A fool", b);
			assertTrue("You must", c);
			assertTrue("In the end", d);
			assertTrue("Choosea job", e);
			assertTrue("To expect", f);
			assertTrue("Without", g);
			assertTrue("I love deadlines", h);

	}
	@Test
	public void testgetcounter(){
		test.getCounter();	
	int startvalue = test.getCounter();
	test.add(1, 2);
	test.subtract(4, -2);
	test.divide(6,  3);
	test.multiply(2, 2);
	test.reverse("abdc");
	test.quote();
	
	assertEquals(startvalue +6, test.getCounter() );
	
		
	}


}	
