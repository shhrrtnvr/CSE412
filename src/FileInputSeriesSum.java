import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputSeriesSum {
    public static void main(String[] args)
    {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("files/abc.txt");
            Scanner sc = new Scanner(fis);
            int sum = 0;
            while (sc.hasNextInt())
            {
                sum += sc.nextInt();
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.print("File not found");
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("File was not closed");
            }
        }
    }
}
