import java.io.*;
import java.util.Scanner;

public class FileOutputSqr {
    public static void main(String[] args)
    {
        FileInputStream fis = null;
        PrintWriter pw = null;
        try {
            fis = new FileInputStream("abc.txt");
            Scanner sc = new Scanner(fis);
            pw = new PrintWriter("def.txt");
            while(sc.hasNextInt())
            {
                int n = sc.nextInt();
                pw.write(Integer.toString(n*n) + '\n');
            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem");
        } finally {
            try {
                fis.close();
                pw.flush();
                pw.close();
            } catch (Exception e) {
                System.out.print("files are not closed");
            }
        }
    }
}
