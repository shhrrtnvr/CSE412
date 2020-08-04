import java.util.Scanner;
public class fibonacci_recursive {
    public int fib(int n)
    {
        if (n==0) return 0;
        if(n==1) return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args)
    {
        fibonacci_recursive obj = new fibonacci_recursive();
        Scanner sc = new Scanner(System.in);
        int n;
        while(sc.hasNextInt())
        {
            n = sc.nextInt();
            System.out.println(obj.fib(n));
        }


    }
}
