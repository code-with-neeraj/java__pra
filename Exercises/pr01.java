
public class pr01 {
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        /* 
        Qs1. Write a Java program to print the sum of two numbers.

        int a = 12;
        int b = 55;
        int c = a + b;
        System.out.println(c);
        */

        /* 
        Qs2. Write a Java program to divide two numbers and print them on
        the screen.
        Test Data :

        int a = 12;
        int b = 3;
        int c = a / b;
        System.out.println(c); 
        */
        
        /* 
        Qs3. Write a Java program to print the results of the following 
        operations.
            Test Data:
            a. -5 + 8 * 6
            b. (55+9) % 9
            c. 20 + -3*5 / 8
            d. 5 + 15 / 3 * 2 - 8 % 3

        int a = -5 + 8 * 6;
        int b = (55+9) % 9;
        int c = 20 + -3*5 / 8;
        int d =  5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
        */

        /* 
        Qs4. Write a Java program that takes two numbers as input and 
        displays the product of two numbers.

        int a = 25;
        int b = 5;
        int c = a * b;
        System.out.println(c);
        */

        /* 
        Qs5. Write a Java program to print the sum (addition), multiply, 
        subtract, divide and remainder of two numbers.

        int a = 125;
        int b = 24;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        */

        /* 
        Qs6. Write a Java program that takes a number as input and prints its multiplication table up to 10.

        int n=5;
        for(int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n", n,i,n*i);
        }

        //////
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number");
        int num = in.nextInt();

        for(int i=0; i<10; i++){
            System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1)));
        }
        */

        /* 
        Qs7. Write a Java program to display the following pattern.
        Sample Pattern :
        
           J    a   v     v  a                                                  
           J   a a   v   v  a a                                                 
        J  J  aaaaa   V V  aaaaa                                                
         JJ  a     a   V  a     a

        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
        */

        /* 
        Qs8. Write a Java program to compute the specified expressions and print the output.
        Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))

        
        System.out.println( ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
        */
        
        /* 
        Qs9. Write a Java program to print the area and perimeter of a circle.
        Test Data: Radius = 7.5

        double r = 7.5;
        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * r * r;
        System.out.println("Area of circle: "+ area);
        System.out.println("Perimeter of circle: " + perimeter);
        */

        /*
        Qs10. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

       Scanner in = new Scanner(System.in);
       System.out.println("Input first number: ");
       int num1 = in.nextInt();
       System.out.println("Input second number: ");
       int num2 = in.nextInt();
       System.out.println("Input third number: ");
       int num3 = in.nextInt();

       System.out.println("Average of five number is: " +(num1+num2+num3)/3);
        */

        /*
        Qs11. Write a Java program to print the area and perimeter of a rectangle.
        Test Data: Width = 5.5 Height = 8.5

        double width = 5.5;
        double height = 8.5;

        System.out.println("Area of rectangle: "+ width*height);
        System.out.println("Perimeter of rectangle: "+ (width+height)*2);
         */

         /* 
        Qs12. Write a Java program to swap two variables.

        int a, b;
        a = 15;
        b = 27;
        System.out.println("Before swapping: a, b = "+ a + ","+b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : a, b =" +a+","+b);
        */

        /* 
        Qs13. Write a Java program to compare two numbers.
        Input Data:  Input first integer: 25, Input second integer: 39

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Input first integer");
        num1 = input.nextInt();
        System.out.println("Input second integer");
        num2 = input.nextInt();

        if(num1 == num2)
            System.out.printf("%d == %d\n", num1, num2);
        if(num1 != num2)
            System.out.printf("%d != %d\n", num1, num2);
        if(num1 < num2)
            System.out.printf("%d < %d\n", num1, num2);
        if(num1 > num2)
            System.out.printf("%d > %d\n", num1, num2);
        if(num1 <= num2)
            System.out.printf("%d > %d\n", num1, num2);
        if(num1 >= num2)
            System.out.printf("%d > %d\n", num1, num2);
        */

        /* 
        Qs.14 Write a Java program and compute the sum of an integer's digits.
            Input Data: Input an integer: 25

        Scanner input  = new Scanner(System.in);
        long n = input.nextLong();
        System.out.println("The sum of the digits is: " + sumDigits(n));  // function upper likha hai
        */

        

        



    }
}
