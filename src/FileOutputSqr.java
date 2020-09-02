import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOutputSqr {
    public static void main(String[] args)
    {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("o.txt");
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextInt())
            {
                int n = sc.nextInt();
                pw.write(Integer.toString(n*n) + '\n');
            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem");
        } finally {
            pw.flush();
            pw.close();
        }
    }
}
