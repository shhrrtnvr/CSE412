import java.util.Scanner;

public class AbstractDemo {
    public static void main(String[] args)
    {
        Shape s = null;
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        if (input1 == 1)
        {
            s = new Square_(input2);
        }
        if (input1 == 2)
        {
            s = new Circle(input2);
        }
        System.out.println(s.getArea());
    }
}
abstract class Shape {
    public static final double pi = 3.14596;
    public int s;
    public double getPi() {
        return pi;
    }
    public abstract double getArea();
}

class Square_ extends Shape {
    public Square_(int s)
    {
        this.s = s;
    }
    @Override
    public double getArea()
    {
       return s*s;
    }
}
class Circle extends Shape {
    public Circle(int r)
    {
        this.s = r;
    }
    @Override
    public double getArea()
    {
        return getPi()*s*s;
    }
}
