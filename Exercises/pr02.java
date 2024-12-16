




public class pr02 {
    public static void count(String x) {
        char[] ch = x.toCharArray();

        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i< x.length(); i++){
            if(Character.isLetter(ch[i])){
            }
            else if (Character.isDigit(ch[i])){
                num++;
            }
            else if (Character.isSpaceChar(ch[i])){
                space++;
            }
            else {
                other++;
            }
        } 
        System.out.println("\"The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.println("letter: " + letter);
        System.out.println("space: "+ space);
        System.out.println("number: "+ num);
        System.out.println("other: "+ other);

    } 

    public static boolean sumoftwo(int x, int y, int z){
        return ((x + y) == z || (y + z) == x || (z + x) == y);
    }

    public static boolean is_Prime(int n){
        for (int i = 3; i*i <=n; i+=2) {
            if(n % i == 0){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Qs15. Write a Java program to reverse a string.
        // Input Data: Input a string: The quick brown fox

        /* 
        // Qs16 Write a Java program to reverse a string.
        // Input Data:

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        //Read the input string and convert it to a character array
        char[] letters = sc.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        //Iterate through the character array in reverse order and print each character
        for (int i = letters.length - 1; i>= 0; i--) {
            System.out.print(letters[i]);
        }
        //Print a newline character to end the output line
        System.out.print("\n");
        */


        /* 
        // Qs17. Write a Java program to count letters, spaces, 
        // numbers and other characters in an input string.

        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        count(test);
        */

        /* 
        // Qs18. Write a Java program to create and display a unique three-digit number 
        // using 1, 2, 3, 4. Also count how many three-digit numbers are there.

        int amount = 0;

        for (int i = 1; i<=4; i++){
            for (int j = 1; j <= 4; j++){
                for (int k = 1; k <= 4; k++){
                    if (k != i && k != j && i !=j){
                        amount++;
                        System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is " + amount);
        */

        /* 
        // Qs19. Write a Java program to print the ASCII value of a given character.

        int chr = 'Z';
        System.out.println("The ASCII value of Z is: " +chr);
        */

        // Qs20. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.

        // int n;
        // char s1, s2, s3;
        // Scanner in = new Scanner(System.in);
        // System.out.println("Input number: ");
        // n = in.nextInt();
        // System.out.printf("%d + %d%d + %d%d%d\n",n, n, n, n, n, n);

        /* 
        // Qs21. Write a Java program to display system time.

        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
        */

        /* 
        // Qs22. Write a Java program to print odd numbers from 1 to 99. Prints one number per line.
        int i;
        for (i = 1; i<100; i++){
            if (i % 2 !=0){
                System.out.println(i);
            }
        }
        */

        /* 
        // Qs23. Write a Java program to accept a number and check whether the number is even or not. 
        // Prints 1 if the number is even or 0 if odd.

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = sc.nextInt();

        if ( n % 2 == 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        */

        /* 
        // Qs24. Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.

        System.out.println("\nDivided by 3: ");
        for (int i = 1; i<100; i++) {
            if(i % 3 == 0)
                System.out.print(i + ", ");
        }

        System.out.println("\nDivided by 5: ");
        for (int i = 1; i<100; i++) {
            if(i % 5 == 0)
                System.out.print(i + ", ");
        }

        System.out.println("\n\nDivided by 3 & 5: ");
        for (int i = 1; i< 100; i++){
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("\n");
        */

        /* 
        // Qs25. Write a Java program to convert a string to an integer.

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number (string): ");
        String str1 = sc.nextLine();
        int result = Integer.parseInt(str1);
        System.out.printf("The integer value is: %d", result);
        System.out.printf("\n");
        */

        /* 
        // Qs26. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int x = sc.nextInt();
        System.out.println("Input the second number: ");
        int y = sc.nextInt();
        System.out.println("Input the third number: ");
        int z = sc.nextInt();
        System.out.print("The result is: " + sumoftwo(x, y, z));
        System.out.print("\n");
        */

        /* 
        // Qs27. Write a Java program to capitalize the first letter of each word in a sentence.

        Scanner in = new Scanner(System.in);
        System.out.println("Input a Sentence: ");
        String line = in.nextLine();
        String upper_case_line = "";
        Scanner lineScan = new Scanner(line);
        while (lineScan.hasNext()){
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case_line.trim());
        */

        /* 
        // Qs28. Write a Java program to find the penultimate (next to the last) word in a sentence.

        Scanner in = new Scanner(System.in);
        System.out.println("Input a Sentence: ");
        String line = in.nextLine();
        String[] words = line.split("[ ]+");
        System.out.println("Penultimate word: " + words[words.length - 2]);
        */

        /* 
        // Qs29. Write a Java program to reverse a word.

        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a word: ");
        String word = in.nextLine();
        word = word.trim();
        String result = "";
        char[] ch = word.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--){
            result +=ch[i];
        }
        System.out.println("Reverse word: " + result.trim());
        */

        /* 
        // Qs30. Write a Java program to compute the sum of the first 100 prime numbers.

        int sum = 1;
        int ctr = 0;
        int n = 0;

        while (ctr < 100) {
            n++;
            if (n % 2 != 0) {
                if (is_Prime(n)){
                    sum += n;
                }
            }
            ctr++;
        }
        System.out.println("\nSum of the prime numbers till 100: " + sum);
        */




        
    }
}
