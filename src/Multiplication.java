import java.util.*;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            int product = no * i;
            System.out.println(product);
        }
    }
}
