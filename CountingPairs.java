
import java.util.*;

class CountingPairs {

    static int binarySearch(int arr[], int low,
                            int high, int x)
    {
        if (high >= low)
        {
            int mid = low + (high - low) / 2;
            if (x == arr[mid])
                return mid;
            if (x > arr[mid])
                return binarySearch(arr, (mid + 1),
                        high, x);
            else
                return binarySearch(arr, low,
                        (mid - 1), x);
        }
        return -1;
    }

    static int countPairsWithDiffK(int arr[], int n, int k)
    {
        int count = 0, i;

        Arrays.sort(arr);
        for (i = 0; i < n - 1; i++)
            if (binarySearch(arr, i + 1, n - 1,
                    arr[i] + k) != -1)
                count++;

        return count;
    }

    // Driver code
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an lenght of array: ");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter "+ length+" values: ");
        for (int i=0;i<length;i++){
            arr[i]=input.nextInt();
        }
        System.out.print("Enter the difference value between pair values: ");
        int difference = input.nextInt();

        System.out.println("Count of pairs with given diff is "
                + countPairsWithDiffK(arr, length, difference));
    }
}

// This code is contributed by Sahil_Bansall
