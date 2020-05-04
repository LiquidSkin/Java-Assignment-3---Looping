import java.util.*;
import java.util.Scanner;

public class LeapYear {
    public static boolean checkLeapYear(int year)
    {
        if(year % 400 == 0)
            return true;
        if(year % 100 == 0)
            return false;
        if(year % 4 == 0)
            return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year ");
        int yr = sc.nextInt();
        boolean variable = checkLeapYear(yr);
        if(variable)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }

    }

}
