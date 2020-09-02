import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputSqSumDiff {
    public static void main(String[] args)
    {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/data.txt");
            Scanner sc = new Scanner(fis);
            int countr = 0;
            int[] sqr = new int[2];
            sqr[0] = 0; sqr[1] = 0;
            while (sc.hasNextInt())
            {
                sqr[countr % 2] += Math.pow(sc.nextInt(), 2);
                countr++;
            }
            System.out.println(Math.abs(sqr[0] - sqr[1]));
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        } finally {
            try {
                fis.close();
            } catch (IOException e)
            {
                System.out.println("IO exception");
            }
        }
    }
}
