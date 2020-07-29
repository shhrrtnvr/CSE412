public class recursive_main {
    public static int i = 0;
    public static void main(String[] args)
    {
        while(i < 5) {
            System.out.println("Hello");
            i++;
            main(null);
            System.out.println("Bye");
        }
    }
}
