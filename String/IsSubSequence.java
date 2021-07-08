import java.util.Scanner;

class IsSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the small String : ");
        String str1 = sc.next();
        System.out.println("Enter the main String : ");
        String str2 = sc.next();
        boolean ans = isSubSequence(str1, str2);
        System.out.println("Output : " + ans);
        sc.close();
    }

    public static boolean isSubSequence(String s, String t) {

        int l1 = s.length();
        int l2 = t.length();

        if (l1 > l2) {
            return false;
        }
        if (l1 == 0) {
            return true;
        }

        int i = 0;

        for (int j = 0; j < l2 && i < l1; j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            if (i == l1) {
                return true;
            }
        }

        return false;

    }
}