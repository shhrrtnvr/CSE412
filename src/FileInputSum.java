import java.io.*;
import java.util.Scanner;

public class FileInputSum {
    public static void main(String[] args)
    {
        FileInputStream f1, f2;
        PrintWriter pw;
        try {
            f1 = new FileInputStream("files/a");
            f2 = new FileInputStream("files/b");

            Scanner sc1 = new Scanner(f1);
            Scanner sc2 = new Scanner(f2);

            pw = new PrintWriter(new File("files/o"));
            pw.write(Integer.toString(sc1.nextInt() + sc2.nextInt()));
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error while reading file");
        }

    }
}
