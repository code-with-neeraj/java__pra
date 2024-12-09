public class pra {

    public static void main(String[] args) {

        // Question1:
        // *****
        // *****
        // *****
        // *****

        // int n=4;
        // int m =5;
        // // outer loop
        // for(int i = 1; i<=n; i++){
        //     // inner loop
        //   for (int j = 1; j <=m; j++) {
        //       System.out.print("*");
        //   }
        //   System.out.println("*");
        // }


        // Question2:
        // *****
        // *   *
        // *   *
        // *****

        // int n = 4;
        // int m = 5;
        // //outr loop 
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=m;j++){
        //         //cell ->(i,j)
        //         if(i == 1 || j==1 || i ==n || j==m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Question3:
        // *
        // **
        // ***
        // ****

        // int n = 4;
        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Question4:
        // ****
        // ***
        // **
        // *

        // int n =4;
        // //outer loop
        // for(int i=n; i>=1; i--){
        //     // inner loop
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Question5:
        //    *
        //   **
        //  ***
        // ****
        
        // int  n =4;
        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop ->space print 
        //     for(int j =1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     //inner loop -> star print 
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Question6:
        // 1 
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5


        // int n = 5;
        // //outer loop
        // for(int i=1; i<=n; i++){
        //     for(int j =1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // Question7:
        // 12345
        // 1234
        // 123
        // 12
        // 1


        // int n =5;
        // // outer loop
        // for(int i=1; i<=n; i++){
        //     // inner loop
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Question8:
        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        // int n = 5;
        // int number = 1;

        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j = 1; j<= i; j++){
        //         System.out.print(number+" ");
        //         number++; // number = number + 1
        //     }
        //     System.out.println();
        // }

        // Question9:
        // 1 
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        // int n = 5;

        // //outer loop
        // for(int i=1; i<=n; i++){
        //     // inner loop
        //     for(int j=1; j<=i; j++){
        //         int sum = i+j;
        //         if(sum % 2 == 0){ // even
        //             System.out.print("1 ");
        //         } else { //odd
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Question10:
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *


        // int n = 5;
        // // upper half
        // for(int i=1; i<=n; i++){
        //     // 1st part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
            

        //     //spaces
        //     int spaces = 2 * (n-i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }

        //     //2nd part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //lower half

        // for(int i=n; i>=1; i--){
        //     // 1st part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
            

        //     //spaces
        //     int spaces = 2 * (n-i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }

        //     //2nd part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Question11:
        //     *****
        //    *****
        //   *****
        //  *****
        // *****

        // int n = 5;

        // for(int i=1; i<=n; i++){
        //     //spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     //stars
        //     for(int j=1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Question12:
        //     1 
        //    2 2
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5

        // int n = 5;
        // for(int i =1; i<=n; i++){
        //     //spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     //numbers ->print row no, row no time
        //     for(int j=1; j<=i; j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        // Question13:
        //      1
        //     212
        //    32123
        //   4321234
        //  543212345


        // int n = 5;

        // for(int i=1; i<=n; i++){
        //     //spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     //1st half numbers
        //     for(int j=i; j>=1; j--){
        //         System.out.print(j);
        //     }

        //     //2nd half numbers
        //     for(int j=2; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Question14:
    //      *
    //     ***
    //    *****
    //   *******
    //   *******
    //    *****
    //     ***
    //      *

        // int n =4; 
        // //upper half
        // for(int i=1; i<=n; i++){
        //     //spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     //stars
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //lower half
        // for(int i=n; i>=1; i--){
        //     //spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     //stars
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}