package com.quintrix.jfs;
import java.util.Arrays;
import java.util.Scanner;
public class Calculator {
	public static double compute(double num1, double num2, String operator)
	{
		double answer = 0;
		switch (operator)
		{
		case "+" : answer = num1+num2; break;
		case "-" : answer = num1-num2; break;
		case "*" : answer = num1*num2; break;
		case "/" : answer = num1/num2; break;
		}
		return answer;
	}
	
	public static double numEntry(String msg)
	{
		double input = 0;
		boolean invalid = true;
		while (invalid)
		{
			System.out.println(msg);
			String raw = getInput();
			try 
			{
				Double parsed = Double.valueOf(raw);
				input = parsed.doubleValue();
				invalid = false;
			}
			catch (Exception ex)
			{
				System.out.println("Please enter a valid number.");
				invalid = true;
			}
		}
		return input;
	}
	
	public static String opEntry(String msg)
	{
		String input = "";
		boolean invalid = true;
		while (invalid)
		{
			System.out.println(msg);
			input = getInput();
			String[] ops = {"+", "-", "*", "/"};
			if(Arrays.stream(ops).anyMatch(input::equals)) invalid = false;
			else
			{
				System.out.println("Please enter a valid operation.");
				invalid = true;
			}
		}
		return input;
	}
	public static String getInput()
	{
		String result = "";
		Scanner scan = new Scanner(System.in);
		result = scan.nextLine();
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = numEntry("Enter a number");
		String operator = opEntry("Enter an operator");
		double num2 = numEntry("Enter 2nd number");
		System.out.println(compute(num1, num2, operator));
		

	}

}
