public class reverse_array {
    public static int sz = 10;
    public static int[] a;
    public static void main(String[] args)
    {
        a = new int[sz];
        for (int i = 0; i < sz; i++)
        {
            a[i] = i;
        }
        reverse(0, sz-1);
        print();
    }
    public static void reverse(int s, int e)
    {
        if (s >= e) return;
        int tmp = a[s];
        a[s] = a[e];
        a[e] = tmp;
        reverse(s+1, e-1);
    }
    public static void print()
    {
        for (int i = 0; i < sz; i++)
        {
            System.out.println(a[i]);
        }

    }

}
