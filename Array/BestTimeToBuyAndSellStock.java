import java.util.Scanner;

/**
 * BestTimeToBuyAndSellStock
 */
public class BestTimeToBuyAndSellStock {

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

       int res=maxProfit(arr);
       System.out.print("Output : "+ res);

        sc.close();
    }

    public static int maxProfit(int price[]){

        int buyDate=price[0];
        int maxProfit=0;

        for(int i=1;i< price.length;i++){
            maxProfit=Math.max(maxProfit, price[i]-buyDate);
            buyDate=Math.min(buyDate, price[i]);
        }

        return maxProfit;



    }
}