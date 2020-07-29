public class distance {
    public static double dist(point a, point b)
    {
        int x1 = a.getX(), y1 = a.getY(), x2 = b.getX(), y2 = b.getY();
        int dsqr = (x1 - x2) * (x1 - x2) + (y1-y2) * (y1-y2);
        return Math.sqrt(dsqr);
    }
    public static void main(String[] args)
    {
        point a = new point(2, 3);
        point b = new point(1, 1);
        System.out.println(dist(a, b));
    }
}
