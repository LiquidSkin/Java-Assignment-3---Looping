import java.util.*;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int total = 0;
        for(int i=1; i<=n; i++)
        {
            total += i;
        }
        System.out.println(total);
    }
}
