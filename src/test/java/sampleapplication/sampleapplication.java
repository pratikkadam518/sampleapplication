package sampleapplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class sampleapplication {

	@Test
	public void test() {
		//fail("Not yet implemented2");
		
		sample s=new sample();
		assertEquals(4,s.add(2, 2));
	}

}
