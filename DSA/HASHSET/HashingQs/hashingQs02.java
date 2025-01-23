
import java.util.HashSet;


public class hashingQs02 {
    public static int union(int arr1[], int arr2[]) {  //0(n)
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++){
            set.add(arr2[j]);
        }

        return set.size();
    }
    public static void main(String[] args) {
        // Union of 2 Arrays
        // arr1 = {7, 3, 9}
        // arr2 = {6, 3, 9, 2, 9, 4}

        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        System.out.println(union(arr1, arr2));

    }
}
