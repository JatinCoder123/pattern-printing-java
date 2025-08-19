
public class Main {
    /*
    *****
    *****
    *****
    *****
     */
    static void Square(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /*  
    *****
    *****
    *****
     */
    static void Rectangle(int m, int n) {
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /*
       *
      **
     ***
    ****
     */
    static void LeftTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col > n - row)
                    System.out.print("*");
                else
                    System.out.print("_");
            }
            System.out.println();
        }
    }

    /*
    *
    **
    ***
    *****
     */
    static void RightTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
    */
    static void RightArrow(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int col = 1; col <= c; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    /*
     * 1
     * 12
     * 123
     * 1234
     */
    static void print4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    /*
     * 1
     * 22
     * 333
     * 4444
     */
    static void print5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    /*
    
    ****
    ***
    **
    *
     */
    static void print6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    
    ****
     ***
      **
       *
     */
    static void print11(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col > row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    /*
     * 
     * 1234
     * 123
     * 12
     * 1
     */
    static void print7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    /*
        *
       ***
      *****
    
    */
    static void print8(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n + row - 1; col++) {
                if (col > n - row) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
        *
       * *
      * * *
     * * * *
     
     */
    static void print12(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col > n - row)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
        
      *****
       ***
        *
    
    */
    static void print9(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2 * n - row; col++) {
                if (col < row)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
      
       * * * * *
        * * * *
         * * *
          * *
           *
     
     */
    static void print13(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col < row)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
      
      
        * * * *
         * * *
          * *
           *
           *
          * *
         * * *
        * * * *
     
     */
    static void print15(int n) {
        for (int row = 1; row <= 2*n; row++) {
            for (int col = 1; col <= n; col++) {
                if(row>n){
                      if (col > 2*n - row)
                    System.out.print("* ");
                   else
                    System.out.print(" ");
                }
                else{
                    if (col < row)
                    System.out.print(" ");
                else
                    System.out.print("* ");

                }  
            }
            System.out.println();
        }
    }

    /*
        *
       ***
      *****
      *****
       ***
        *
    
    */
    static void print10(int n) {
    for(int row=1;row<=2*n;row++){
    int c=row>n?2*n-(row-n):n+row-1;
       for(int col=1;col<=c;col++){
        if(row>n){
            if((row-n-1)<col)System.out.print("*");
            else System.out.print(" ");
        }
        else{
            if(col>n-row)System.out.print("*");
            else System.out.print(" ");
        }
    }
            System.out.println();
        }
    }
    /*
        *
       ***
      *****
       ***
        *
    
    */
    static void print16(int n) {
for(int row=1;row<2*n;row++){
    int c=row>n?2*n-(row-n)-1:n+row-1;
       for(int col=1;col<=c;col++){
        if(row>n){
            if((row-n)<col)System.out.print("*");
            else System.out.print(" ");
        }
        else{
            if(col>n-row)System.out.print("*");
            else System.out.print(" ");
        }
    }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print16(5);
    }
}