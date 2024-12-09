
import java.util.HashSet;

public class Recursion2 {
    public static void towerOfHonoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("transfer disk "+ n + " from "+src+" to "+dest);
            return;
        }
        towerOfHonoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+ n + " from "+src+" to "+dest);
        towerOfHonoi(n-1, helper, src, dest);
    }
    public static void printRev(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }

    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element) {
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, idx+1, element);
    }

    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            // array is sorted till now
            return isSorted(arr, idx+1);
        }else {
            return false;
        }
    }

    public static void moveAllX(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }else {
            newString += currChar; // newString = newString + currChar
            moveAllX(str, idx+1, count, newString);
        }
    }

    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplicates(str, idx+1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }

    public static void subsequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        //to be
        subsequences(str, idx+1, newString+currChar);

        //or not to be
        subsequences(str, idx+1, newString);
    }

    public static void subsequences(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);

        //to be
        subsequences(str, idx+1, newString+currChar, set);

        //or not to be
        subsequences(str, idx+1, newString, set);
    }

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length(); i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        // Qs. Tower of Hanoi

        // int n = 3;
        // towerOfHonoi(n, "S", "H", "D");


        // Qs. Print a string in reverse
        // "abcd"

        // String str = "abcd";
        // printRev(str, str.length()-1);

        // Qs. Find the 1st & last occurance of an element in string 
        // "abaacdaefaah"

        // String str =  "abaacdaefaah";
        // findOccurance(str, 0, 'a');

        // Qs. Check if an array is sorted (Strictly Increasing)
        // {1,2,3,4,5}

        // int arr[] = {1,3,3};
        // System.out.println(isSorted(arr, 0));

        // Qs . Move all 'x' to the end of the string
        // "axbcxxd"

        // String str = "axbcxxd";
        // moveAllX(str, 0, 0, "");

        // Qs. Remove duplicates in a string 
        // "abbccda"

        // String str = "abbccda";
        // removeDuplicates(str, 0, "");

        // Qs. Print all the subsequences of a string 
        // "abc"

        // String str = "abc";
        // subsequences(str, 0, "");

        // Qs. Print all the unique subsequences of a string 
        // "aaa"

        //  String str = "aaa";
        //  HashSet<String> set = new HashSet<>();
        // subsequences(str, 0, "", set);

        // Qs. Print keypad combination

        String str = "23";
        printComb(str, 0, "");
    }
    
}
