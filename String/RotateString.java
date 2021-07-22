import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 1st string : ");
        String s1=sc.next();
        System.out.println("Enter the 2nd string : ");
        String s2=sc.next();
        boolean ans=fun(s1,s2);
        System.out.println("Output : "+ans);
        sc.close();
    }

    public static boolean fun(String s, String goal){

        if(s.length()!=goal.length()){
            return false;
        }

        String str=s+s;

        if(str.contains(goal)){
            return true;
        }

        return false;
    }
}
