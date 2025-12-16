import java.util.*;
class Demo2 {
    public static void main (String [] args ) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st Number :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number ");;
        int c = sc.nextInt();

        int larg = Math.max(a,Math.max(b,c));
        System.out.print("largest of 3 number is :"+larg);
    }
}