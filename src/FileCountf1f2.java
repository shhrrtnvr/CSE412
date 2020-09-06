import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class FileCountf1f2 {
    public static void main(String[] args)
    {
        FileInputStream fis2 = null;
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        try
        {
            fis2 = new FileInputStream("files/f2.txt");
            Scanner sc = new Scanner(fis2);
            while(sc.hasNextInt()) {
                Integer n = sc.nextInt();
                if (!count.containsKey(n))
                    count.put(n, 1);
                else
                {
                    Integer prev = count.get(n);
                    count.put(n, prev+1);
                }
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("error");
        }
        finally {
            try {
                fis2.close();
            } catch (IOException e)
            {
                System.out.println("error");
            }
        }
        FileInputStream fis1 = null;
        try
        {
            fis1 = new FileInputStream("files/f1.txt");
            Scanner sc = new Scanner(fis1);
            while (sc.hasNextInt())
            {
                Integer n = sc.nextInt();
                Integer c = 0;
                if (count.containsKey(n))
                    c = count.get(n);
                System.out.println(Integer.toString(n) + " : " + Integer.toString(c));
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            try {
                fis1.close();
            } catch (IOException e) {
                System.out.println("Error");
            }
        }

    }
}
