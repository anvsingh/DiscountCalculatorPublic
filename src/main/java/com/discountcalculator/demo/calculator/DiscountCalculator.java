package com.discountcalculator.demo.calculator;

import org.springframework.context.annotation.Configuration;

/**
 * @author anujv
 * This class is used to calculate the discount amount
 */
@Configuration
public class DiscountCalculator {
	int percentDiscount=0;  //value of percentage applicable
	float percentDiscountAmount=0.0f; //total discount amouunt after percentage
	int netDisocuntAmount=0; //discount by multiple of 100
	/**
	 *  loyal is for user which has been a customer for over 2 years
	 */
	/**
	 * @param custType type of customer can be employee,affiliate and loyal
	 * @param orderType groceries or anything apart from non groceries
	 * @param initialBill initial bill amount
	 * @return
	 */
	public int amountPayable(String custType,String orderType,float initialBill ) {
		if(!orderType.equalsIgnoreCase("groceries")) {
			percentDiscount=checkPercentageDiscount(custType);
		}
		if(percentDiscount != 0) {
			percentDiscountAmount=	calculateDiscount(percentDiscount,initialBill);
		}
		
		netDisocuntAmount=	calculateNetDiscount(initialBill);
		return (int) (initialBill-percentDiscountAmount-netDisocuntAmount);
		
	}

	private int calculateNetDiscount(float initialBill) {
		
		return (int) (5*(initialBill/100));
		
		
	}

	private float calculateDiscount(float percent, float initialBill) {
		
		return (initialBill*(percent/100.0f));
		
	}

	private int checkPercentageDiscount(String custCategory) {
		
		switch(custCategory)
		{
		case "employee":
			percentDiscount=30;
			break;
		case "affiliate":
			percentDiscount=10;
			break;
		case "loyal":
			percentDiscount=5;
			break;
		default:
			percentDiscount=0;	
		}
		return percentDiscount;
		
	}
}
