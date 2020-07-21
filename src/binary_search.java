import java.util.Arrays;
import java.util.Scanner;

public class binary_search {
    private static int search(int[] A, int start, int end, int key)
    {
       while (true)
       {
           int mid = start + (end - start) / 2;
           if (start > end) return -1;
           if (A[mid] == key) return mid;
           else if (A[mid] > key) end = mid - 1;
           else start = mid + 1;
       }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] A = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++)
        {
           A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        System.out.println("Enter key to search: ");
        int key = sc.nextInt();
        int f = search(A, 0, size-1, key);
        if (f != -1)
            System.out.println("Found at " + f + "'th index");
        else
            System.out.println("Not found!");

    }
}
