// Taking input section is not correct but function is fully correct.

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the character array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array of character : ");
        char c[] = new char[n];
        for (int i = 0; i < n; i++) {
            char x = sc.next().charAt(0);
            c[i] = x;
        }

        System.out.println("Output : ");

        fun(c);

        sc.close();
    }

    public static void fun(char[] c) {

        int low = 0, high = c.length - 1;

        while (low <= high) {
            char temp;
            temp = c[low];
            c[low] = c[high];
            c[high] = temp;
            low++;
            high--;
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i] + " ");
        }

    }

}
