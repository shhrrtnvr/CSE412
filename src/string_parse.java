import java.util.Scanner;

public class string_parse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = new String();
        s1 = sc.nextLine();

        String a = new String();
        String b = new String();
        a = s1.substring(0, 1);
        b = s1.substring(2);
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
    }
}
