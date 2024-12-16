public class Recursion1 {
    public static void printNumb(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }


    // public static void printNumb(int n){
    //     if(n == 6){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n+1);
    // }

    public static void printSum(int i, int n, int sum){
        if(i == n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);  
        System.out.println(i);
    }

    public static int calcfactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int fact_nm1 = calcfactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }


    public static void prinFib(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        prinFib(b, c, n-1);
    }

    public static int calcPower(int x, int n){
        if(n == 0) { //base case 1
            return 1;
        }
        if(x == 0){ // base case 2
            return 0;
        }
        // int xPownm1 = calcPower(x, n-1);
        // int xPown = x * xPownm1;
        // return xPown;


        //if n is even
        if(n % 2 == 0){
            return  calcPower(x, n/2) * calcPower(x, n/2);
        } else {
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        // Qs. Print Numbers from 5 to 1
        // int n = 5;
        // printNumb(n);  //n=5

        // Qs. Print Numbers from 1 to 5
        // int n = 1;
        // printNumb(n); // n=1

        // Qs. Print sum of first n natural numbers
        // printSum(1, 5, 0);

        // Qs. Print Factorial of a number n
        // int n = 5;
        // int ans = calcfactorial(n);
        // System.out.println(ans);

        // Qs. Print the fibonacci sequence till nth term*
        // int a = 0, b =1;
        // System.out.println(a);
        // System.out.println(b);
        // int n = 7;
        // prinFib(a, b, n-2);

        // Qs. Print x^n (stack height = n)
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
