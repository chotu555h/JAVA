import java.util.*;
class Demo4 {
    public static void main (String Args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter s String : ");
        String str = sc.nextLine();
        String Reversed = new StringBuilder(str).reverse().toString();
        System.out.print("Reversed String is : " + Reversed);
    }

}