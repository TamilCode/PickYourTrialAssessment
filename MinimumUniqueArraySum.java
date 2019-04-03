import java.util.*;

public class MinimumUniqueArraySum {

    static int findMinSum(ArrayList<Integer> arr, int n)
    {
        int sum = arr.get(0), prev = arr.get(0);

        for (int i = 1; i < n; i++) {

            if (arr.get(i).equals( prev)) {
                prev = prev + 1;
                sum = sum + prev;
            }

            else {
                sum = sum + arr.get(i);
                prev = arr.get(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an lenght of array: ");
        int length = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(length);
        System.out.print("Enter "+ length+" values: ");
        for (int i=0;i<length;i++){
            int value=input.nextInt();
            arr.add(value);
        }
        Collections.sort(arr);
        System.out.println(findMinSum(arr, length));
    }
}
