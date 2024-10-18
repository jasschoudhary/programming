package Date_Year;

import java.util.Scanner;

public class findDaysBetn_Dates {
	
	
	  // method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
	
    // method to return the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0; // Invalid month
        }
    }
	
	// method to count days from 01/01/0000 to the given date
    public static int countDaysFromEpoch(int day, int month, int year) {
        int totalDays = 0;
        // Count days for complete years
        for (int y = 0; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }
        // Count days for complete months in the given year
        for (int m = 1; m < month; m++) {
            totalDays += getDaysInMonth(m, year);
        }
        // Add the days in the current month
        totalDays += day;
        return totalDays;
    }
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input for the first date
        System.out.println("Enter the first date (day month year): ");
        int day1 = scanner.nextInt();
        int month1 = scanner.nextInt();
        int year1 = scanner.nextInt();

        // Input for the second date
        System.out.println("Enter the second date (day month year): ");
        int day2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int year2 = scanner.nextInt();
        
     // Calculate the total days from epoch (01/01/0000) to each date
        int days1 = countDaysFromEpoch(day1, month1, year1);
        int days2 = countDaysFromEpoch(day2, month2, year2);
   
        // cal the difference bet'n 2 dates 
        int difference;
        if (days1 > days2) {
            difference = days1 - days2;
        } else {
            difference = days2 - days1;
        }

        System.out.println("Number of days between the two dates: " + difference);
  scanner.close();
        
	}
	

}
