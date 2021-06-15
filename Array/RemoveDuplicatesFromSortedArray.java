import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }

        int res=fun(arr, n);

        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    public static int fun(int arr[], int n) {

        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[count - 1]) {
                arr[count] = arr[i];
                count++;
            }
        }

        return count;
    }

}
