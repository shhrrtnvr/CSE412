import java.util.Random;

public class MergeSort {
    public void sort(int[] A, int l, int r)
    {
        if (l==r) return;
        int m = l + (r-l)/2;
        sort(A, l, m);
        sort(A, m+1, r);
        merge(A, l, r);
    }
    public void merge(int[] A, int l, int r)
    {
        int m = l + (r-l)/2;
        int sl = m - l + 1, sr = r - m;
        int[] L = new int[sl], R = new int[sr];
        for (int i = 0; i < sl; i++)
            L[i] = A[l+i];
        for (int i = 0; i < sr; i++)
            R[i] = A[m+1+i];
        int i = 0, j = 0, k = l;
        while (i < sl && j < sr)
            A[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < sl) A[k++] = L[i++];
        while (j < sr) A[k++] = R[j++];
    }
    public static void main(String[] args)
    {
        MergeSort sorter = new MergeSort();
        Random rand = new Random();
        int[] A = new int[10];
        System.out.print("Initial Array: ");
        for (int i = 0; i < 10; i++) {
            A[i] = (rand.nextInt() % 100 + 100) % 100;
            System.out.print(A[i]);
            System.out.print(" ");
        }
        System.out.print("\nSorted Array: ");
        sorter.sort(A, 0, 9);
        for (int i=0; i < 10; i++)
        {
            System.out.print(A[i]);
            System.out.print(" ");
        }
    }
}
