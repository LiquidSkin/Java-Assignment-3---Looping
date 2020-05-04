import java.util.*;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        while(n != 0)
        {
            count++;
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println("The Sum is" + " " + sum);
        System.out.println("The number of digits are" + " " + count);
    }
}
