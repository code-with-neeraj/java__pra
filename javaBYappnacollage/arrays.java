
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // int[] marks = new int [3];
        // marks[0] = 97;  // phy
        // marks[1] = 98; // chem
        // marks[2] = 34; //3ng
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);
        // for(int i=0; i<marks.length; i++){
        //     System.out.println(marks[i]);
        // }

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        // //input
        // for(int i=0; i<size; i++){
        //     numbers[i] = sc.nextInt();
        // }
        // //output
        // for(int i=0; i<size; i++){
        //     System.out.println(numbers[i]);
        // }

        // Question: Take an array as inpt from the user.
        // Search for a given number x and print the index 
        // at whixh it occurs.

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x found at index : " + i);
            }
        }

    }
}
