public class sqrsum {
    private int sum(int n)
    {
        if (n == 0) return 0;
        return n*n + sum(n-1);
    }
    public static void main(String[] args)
    {
        sqrsum s = new sqrsum();
        System.out.println(s.sum(10));
    }
}
