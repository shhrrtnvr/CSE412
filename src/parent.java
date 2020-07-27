public class parent {
    private int data;
    public static int sum(int a)
    {
        return a;
    }
    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static int sum(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }
}
