import java.util.*;
class Demo7 {
    public static void main (String Args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number ");
    int n = sc.nextInt();
    int fact=1;
        for(int i=1;i<=n;i++) {
            fact = fact*i;
        }
        System.out.print("Factorial is : " + fact);
    }
}