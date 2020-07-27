public class Y extends X {
    private int  w, z;
    public void set(int x, int y, int w, int z)
    {
        super.set(x, y);
        this.w = w;
        this.z = z;
    }
    public int get()
    {
        return super.get()*(z*z - w*w);
    }
    public static void main(String[] args)
    {
        Y y = new Y();
        y.set(2,1, 3, 4);
        System.out.println(y.get());
    }
}
