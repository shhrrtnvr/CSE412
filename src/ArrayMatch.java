import java.util.Scanner;

public class ArrayMatch {
    private static int MX = 5;
    private static void inputArray(int[] A, int sz)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sz; i++)
        {
           A[i] = sc.nextInt();
        }
    }
    private static boolean search(int[] A, int s, int e, int target)
    {
        for (int j = s; j < e-1; j++)
        {
            int k = j + 1;
            while (k < e && A[k] < target+A[j]) k++;
            if (k < e && A[k] == A[j]+target)
                return true;
        }
        return false;
    }
    private static boolean singleMatch(int[] A, int e)
    {
        for (int i = 0; i < e-2; i++)
        {
            if (search(A, i+1, e, A[i]))
                return true;
        }
        return false;
    }

    private static boolean pairMatch(int[] A, int sz)
    {
        for (int i = 0; i < sz-3; i++)
        {
            for (int j = i+1; j < sz-2; j++)
            {
                if (search(A, j+1, sz, A[j]-A[i]))
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] A = new int[MX];
        inputArray(A, MX);
        System.out.println("Single Search: " + (singleMatch(A, MX) ? "Matched" : "Not Matched"));
        System.out.println("Pair Search: " + (pairMatch(A, MX) ? "Matched" : "Not Matched"));
    }
}
