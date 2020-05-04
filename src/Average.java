import java.util.*;
import java.util.Scanner;

public class Average {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ten numbers");
        int sum = 0;
        for(int i=0; i<10; i++)
        {
            int t = sc.nextInt();
            sum = sum + t;
        }
        double avg = sum / 10;
        System.out.println("The sum of the 10 numbers is" + " " + sum);
        System.out.println("The average of the 10 numbers is" + " " + avg);


    }
}
