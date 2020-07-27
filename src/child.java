public class child extends parent {
    @Override
    public int sum(int a)
    {
        return a*a;
    }
    public static void main(String[] args)
    {
        child y = new child();
        System.out.println(y.sum(2)); //overriding
        System.out.println(y.sum(1, 2)); // overloading of sum
        System.out.println(y.sum(1,2,3)); //overloading of sum

    }
}
