import java.util.Scanner;

/**
 * RotateArray
 */
public class RotateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }

        System.out.println("Enter K : ");
        int k = sc.nextInt();

        fun(arr, k);

        System.out.println("Outpit : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }

    public static void fun(int nums[], int k) {

        int n = nums.length;

        k=k%n;

        reverse(0, (n - k - 1), nums);
        reverse((n - k), n - 1, nums);
        reverse(0, n - 1, nums);

    }

    public static int[] reverse(int x, int y, int arr[]) {

        while (x < y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++;
            y--;
        }

        return arr;
    }

}