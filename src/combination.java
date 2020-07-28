public class combination {
    private int comb(int n, int r)
    {
        if(n < r)return 0;
        if(r == 0) return 1;
        return comb(n-1, r) + comb(n-1, r-1);
    }
    public static void main(String[] args)
    {
        combination c = new combination();
        System.out.println(c.comb(15,13));
    }
}
