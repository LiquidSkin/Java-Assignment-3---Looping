import java.util.*;
import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num= 0;
        String MonthName = "";

        System.out.print("Enter month number: ");
        int month = input.nextInt();

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthName = "January";
                num = 31;
                break;
            case 2:
                MonthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    num = 29;
                } else {
                    num = 28;
                }
                break;
            case 3:
                MonthName = "March";
                num = 31;
                break;
            case 4:
                MonthName = "April";
                num = 30;
                break;
            case 5:
                MonthName = "May";
                num = 31;
                break;
            case 6:
                MonthName = "June";
                num = 30;
                break;
            case 7:
                MonthName = "July";
                num = 31;
                break;
            case 8:
                MonthName = "August";
                num = 31;
                break;
            case 9:
                MonthName = "September";
                num = 30;
                break;
            case 10:
                MonthName = "October";
                num = 31;
                break;
            case 11:
                MonthName = "November";
                num = 30;
                break;
            case 12:
                MonthName = "December";
                num = 31;
        }
        System.out.print(MonthName + " " + year + " has " + num + " days\n");
    }
}
