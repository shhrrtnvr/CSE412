public class child extends parent {
    public static int sum(int a)
    {
        return a*a;
    }
    public static void main(String[] args)
    {

        System.out.println(sum(2)); //overriding
        System.out.println(sum(1, 2)); // overloading of sum
        System.out.println(sum(1,2,3)); //overloading of sum

    }
}
