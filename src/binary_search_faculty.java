import java.util.*;
class binary_search_faculty {
    public static void main(String[] args) {
        Search obj = new Search();
        int [] x = {7,2, 9 ,3};
        bubble_sort(x); // [2, 3, 7, 9]
        System.out.println("The position of 7 is: " + obj.BinarySearch(x,0,x.length-1, 7)); // expected value 2 for given array
    }
    private static void bubble_sort(int[] x)
    {
        for (int i = 0; i < x.length-1; i++)
        {
            for (int j = i+1; j < x.length; j++)
            {
                if (x[j] < x[i])
                {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }
}



class Search
{
    public int BinarySearch(int [] arr, int left, int right, int value)
    {
        while (left <= right)
        {
            int mid = (left+right)/2;
            if (arr[mid]==value)
            {
                return mid;
            }
            else if (arr[mid]>value)
            {
                right=mid-1;
            }
            else if (arr[mid]<value)
            {
                left = mid+1;
            }
        }
        return -1;
    }
}