public class Rectangle extends Square {
    private int s1, s2;
    public Rectangle(int s1)
    {
        this.s1 = s1;
    }
    @Override
    public void set(int s2)
    {
        this.s2 = s2;
    }
    @Override
    public int getArea()
    {
        return s1*s2;
    }
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(3);
        r.set(2);
        System.out.println(r.getArea());
    }

}
