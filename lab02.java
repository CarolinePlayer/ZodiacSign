// Caroline Player
package lab01;

import java.util.Scanner;

public class lab02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your zodiac? Enter your birthday -- Month followed by Day as numbers.");
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		// separates the month and day into two different integers
		
		if (month < 1 || month > 12) {
			System.out.println("Invalid month");
		}
		else if (day < 1 || day > 31) {
			System.out.println("Invalid day");
		}
		else {
			zodiac(month, day);
		}
		// determines if the months and days the user inputs are valid integers
	}
	
	static void zodiac(int month, int day)
	{
		String sign = "";
		//Identifies the string "sign" so the program outputs the correct zodiac sign that corresponds with the correct date
	
		if (month == 12) {
		//if the user inputs the number 12 (month of December) the following code will be used
			if (day < 22)
			//if the date input by the user is below 22 they are Sagittarius otherwise they are a Capricorn
				sign = "Sagittarius";
			else
				sign = "Capricorn";
		}
		else if (month == 1) {
			if (day < 20)
				sign = "Capricorn";
			else
				sign = "Aquarius";
		}
		else if (month == 2) {
			if (day < 19)
				sign = "Aquarius";
			else
				sign = "Pisces";
		}
		else if (month == 3) {
			if (day < 21)
				sign = "Pisces";
			else
				sign = "Aries";
		}
		else if (month == 4) {
			if (day < 20)
				sign = "Aries";
			else
				sign = "Taurus";
		}
		else if (month == 5) {
			if (day < 21)
				sign = "Taurus";
			else
				sign = "Gemini";
		}
		else if (month == 6) {
			if (day < 21)
				sign = "Gemini";
			else
				sign = "Cancer";
		}
		else if (month == 7) {
			if (day < 23)
				sign = "Cancer";
			else
				sign = "Leo";
		}
		else if (month == 8) {
			if (day < 23)
				sign = "Leo";
			else
				sign = "Virgo";
		}
		else if (month == 9) {
			if (day < 23)
				sign = "Virgo";
			else
				sign = "Libra";
		}
		else if (month == 10) {
			if (day < 23)
				sign = "Libra";
			else
				sign = "Scorpio";
		}
		else if (month == 11) {
			if (day < 22)
				sign = "Scorpio";
			else
				sign = "Sagittarius";
		}
		
		System.out.println(sign);
		//outputs the zodiac sign corresponding with the date input
	}
}
