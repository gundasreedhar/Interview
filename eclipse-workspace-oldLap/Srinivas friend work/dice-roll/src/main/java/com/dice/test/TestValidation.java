package com.dice.test;

import java.util.Scanner;

import com.dice.beans.MultiDiceThrowResult;
import com.dice.module.Expression;

public class TestValidation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner numberOfAttemptsScanner = new Scanner(System.in);
		System.out.println("Please enter number of trials");
		int n = numberOfAttemptsScanner.nextInt();
		while (n > 0) {
			System.out.println("Enter expression !! ");
			Scanner expressionScanner = new Scanner(System.in);
			String data = expressionScanner.nextLine();

			Expression expression = new Expression(data);
			boolean isValid = expression.isValid();

			if (isValid) {
				System.out.println("Valid ");
				MultiDiceThrowResult diceThrowResult = expression.computeExpression();
				int minimum = diceThrowResult.getMinimum();
				int maximum = diceThrowResult.getMaximum();
				System.out.println("Minimum is " + minimum);
				System.out.println("Maximum is " + maximum);
			} else {
				System.out.println("Not Valid");
			}

			n--;

		}

	}

}
