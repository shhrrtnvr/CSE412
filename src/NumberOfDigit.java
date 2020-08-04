import java.util.Scanner;

public class NumberOfDigit {
    public static int digit(int n)
    {
        if (n==0) return 0;
        return 1 + digit(n/10);
    }
    public static int sum(int n)
    {
        if (n==0)return 0;
        return n%10 + sum(n/10);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number of digit: " + digit(n));
        System.out.println("Sum of Digits: " + sum(n));
    }
}
