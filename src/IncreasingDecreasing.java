import java.util.*;
import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        String temp = Integer.toString(no);
        int[] number = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            number[i] = temp.charAt(i) - '0';
        }
        int n = number.length;
        if (number[0] <= number[1] &&
                number[n - 2] <= number[n - 1])
            System.out.println("Increasing");

            // If the first two and the last two elements
            // of the array are in decreasing order
        else if (number[0] >= number[1] &&
                number[n - 2] >= number[n - 1])
            System.out.println("Decreasing");

        else
            System.out.println("Neither Increasing or Nor Decreasing");
    }
}
