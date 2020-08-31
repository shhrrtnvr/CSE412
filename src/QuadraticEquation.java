import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        try {
           double discriminant = Math.sqrt(b*b - 4*a*c);
           if (Double.isNaN(discriminant))
               throw new Exception();
            System.out.println("x1 = " + Double.toString((-b + discriminant) / (2*a)) +
                    ", x2 = " + Double.toString((-b - discriminant) / (2*a)));
        }
        catch (Exception e)
        {
            System.out.println("No solution in real number");
        }

    }
}
