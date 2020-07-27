public class Y extends X {
    private int  w, z;
    public Y(int x, int y)
    {
        super.set(x, y);
    }
    @Override
    public void set(int w, int z)
    {
        this.w = w;
        this.z = z;
    }
    @Override
    public int get()
    {
        return super.get()*(z*z - w*w);
    }
    public static void main(String[] args)
    {
        Y y = new Y(1,2);
        y.set(3, 4);
        System.out.println(y.get());
    }
}
