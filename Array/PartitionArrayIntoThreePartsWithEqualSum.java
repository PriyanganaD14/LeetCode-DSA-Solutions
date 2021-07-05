import java.util.ArrayList;
import java.util.Scanner;

public class PartitionArrayIntoThreePartsWithEqualSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }

        boolean ans=fun(arr);
        System.out.println("Output : "+ans);

        sc.close();
    }

    public static boolean fun(int arr[]){



        int n=arr.length;

        ArrayList<Integer> ans = new ArrayList<Integer>();

        int totalSum=0;

        for(int i=0;i<n;i++){

            totalSum+=arr[i];

        }

        if(totalSum%3!=0){
            return false;
        }

        int s=totalSum/3, currSum=0, count=0;

        for(int i=0;i<n;i++){
            currSum+=arr[i];
            
            if(currSum==s){
                count++;
                ans.add(i);
                currSum=0;

                if(count==3){
                    
                    return true;
                }
            }
            
        }


       
        

        return false;
    }
    
}
