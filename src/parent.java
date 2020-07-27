public class parent {
    private int data;
    public int sum(int a)
    {
        return a;
    }
    public int sum(int a, int b)
    {
        return a+b;
    }
    public int sum(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        parent x = new parent();
        System.out.println(x.sum(1,2));
        System.out.println(x.sum(1,2,3));
    }
}
