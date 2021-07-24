import java.util.Scanner;

public class Isomorphic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 1st string : ");
        String str1=sc.next();
        System.out.println("Enter the 2nd string : ");
        String str2=sc.next();
        boolean ans=fun(str1, str2);
        System.out.println("Output : "+ans);
        sc.close();
    }

    public static boolean fun(String str1, String str2){

        if(str1.length()!=str2.length()|| str1==null ||str2==null){
            return false;
        }

        int arr1[]=new int[255];
        int arr2[]=new int[255];

        for(int i=0;i<str1.length();i++){
            if(arr1[str1.charAt(i)]!=arr2[str2.charAt(i)]){
                return false;
            }

            arr1[str1.charAt(i)]=i+1;
            arr2[str2.charAt(i)]=i+1;

        }

        return true;
    }
    
}
