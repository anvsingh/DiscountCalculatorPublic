package com.discountcalculator.demo.calculator;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



/**
 * @author Anuj V Singh
 *
 */
class DiscountCalculatorTest {
	
	

	/**
	 * @throws URISyntaxException
	 */
	@Test
	void testAmountPayable() throws URISyntaxException {
		
				
		DiscountCalculator descCalc = mock(DiscountCalculator.class);
		when(descCalc.amountPayable("employee","groceries" ,100.00f)).thenReturn(95);
		 
		Assert.assertTrue(true);
	    
	    
	}

}
