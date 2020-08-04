import java.util.Scanner;

public class NumberOfDigit {
    public static int digit(int n)
    {
        if (n==0) return 0;
        return 1 + digit(n/10);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(digit(sc.nextInt()));
    }
}
