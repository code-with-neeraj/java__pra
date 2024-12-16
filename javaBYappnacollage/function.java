
import java.util.Scanner;
public class function {
    public static void printMyName(String name) {
        System.out.println(name);
        // return;
    }

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int calculateMul(int a, int b){
        return a * b;
         
    }
    public static void printFaactorial(int n){
        //loop
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // printMyName(name); //call kiya function ko

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println("Sum of 2 numbers is : "+sum);

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("Multiply of 2 numbers is : "+ calculateMul(a, b));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFaactorial(n);
    }
}
