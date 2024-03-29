package com.discountcalculator.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.discountcalculator.demo.calculator.DiscountCalculator;




/**
 * @author Anuj Singh
 *
 */
@RestController
@RequestMapping(path = "/discount")
public class DiscountController {
	@Autowired
	private DiscountCalculator discountCalc;

	/**
	 * @param customerType pass type of customer 
	 * @param orderType ordertype 
	 * @param bill intial amount
	 * @return
	 */
	@GetMapping(path = "/{custType}/{orderType}", produces = "application/json")
	public int getEmployees(@PathVariable("custType") String customerType,
			@PathVariable(value = "orderType") String orderType,@RequestParam(value ="bill") float bill) {
		return discountCalc.amountPayable(customerType, orderType, bill);
	}

}
