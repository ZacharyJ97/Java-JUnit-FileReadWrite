package binary;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class ConverterTester
{
	// To account for rounding errors
	private static final double EPSILON = 1E-12;

	/***********************************************************
	 * JUnit TEST CASES
	 **********************************************************/

	@Test
	public void testBinToDec1()
	{
		// Test that the binary string "1" converts to 1
		final String BINARY_STRING = "1";
		
		int actual = BinaryToDecimalConverter.binaryToDecimal(BINARY_STRING);
		int expected = 1;
		Assert.assertEquals(actual, expected, EPSILON);
		
		// Print results
		printResults(BINARY_STRING, actual, expected);
	}

	
	@Test
	public void testBinToDec6()
	{
		// Test that the binary string "110" converts to 6
		final String BINARY_STRING = "110";
		
		int actual = BinaryToDecimalConverter.binaryToDecimal(BINARY_STRING);
		int expected = 6;
		Assert.assertEquals(actual, expected, EPSILON);
		
		// Print results
		printResults(BINARY_STRING, actual, expected);
	}

	
	@Test
	public void testBinToDec32()
	{
		// Test that the binary string "100000" converts to 32
		final String BINARY_STRING = "100000";
		
		int actual = BinaryToDecimalConverter.binaryToDecimal(BINARY_STRING);
		int expected = 32;
		Assert.assertEquals(actual, expected, EPSILON);
		
		// Print results
		printResults(BINARY_STRING, actual, expected);
	}

	@Test
	public void testBinToDec0()
	{
		// Test that the binary string "0" DOES NOT convert to "1".
		// In Java, 0 raised to the 0 power = 1...we want "0" to convert to 0
		final String BINARY_STRING = "0";
		
		int actual = BinaryToDecimalConverter.binaryToDecimal(BINARY_STRING);
		int notExpected = 1;
		Assert.assertNotEquals(actual, notExpected, EPSILON);

		System.out.print("binaryToDecimal( " + BINARY_STRING + " ) -> ");
		System.out.println(actual);
	}

	
	/**
	 * Helper function to print the test results to console
	 * @param binaryString the binary string to convert
	 * @param actual the computed decimal number converted from binary 
	 * @param expected the expected decimal number converted from binary 
	 */
	private void printResults(String binaryString, int actual, int expected)
	{
		System.out.print("binaryToDecimal( " + binaryString + " ) -> ");
		System.out.print(actual);
		System.out.println(" (expected " + expected + ") ");
	}

}
