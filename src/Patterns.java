public class Patterns {
    public static void main(String[] args) {
        rightTriangle(5);
        leftTriangle(5);
        leftRight(5);
        pyramid(5);
        pattern30();
        pattern31(5);
        pattern32(4);
    }
    //right Triangle
    public static  void rightTriangle(int n){
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //left Triangle
    public static void leftTriangle(int n){
        System.out.println();
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Full pyramid
    public static void leftRight(int n){
        System.out.println();
        for (int row = 0; row<=2*n-1 ; row++) {
            int col = row>n ? 2*n-row:row;
            for (int j = 0; j<col ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //pyramid
    public static void pyramid(int n){
        System.out.println();
        for (int i = 0; i <= 2*n-1 ; i++) {
            int noOfCol = i>n ? 2*n-i : i;
            int spaces = n-noOfCol;
            for (int j = 0; j <= spaces ; j++) {
                System.out.print(" ");
            }

            for (int col = 0; col < noOfCol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //pattern30
    static void pattern30(){
        System.out.println();
        for (int row = 0; row <= 5 ; row++) {
            for(int space = 0; space <= 5-row; space++){
                System.out.print(" ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    //pattern31
    static void pattern31(int n){
        System.out.println();
        for (int row = 1; row <= 2 * n  ; row++) {
            int c = row > n ? 2*n - row:row;
            for(int space = 0; space <= n-c; space++){
                System.out.print(" ");
            }
            for (int col = c; col >= 1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= c ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern32(int n){
        for (int i = 0; i < 2*n; i++) {
            for (int j = 0; j < 2*n; j++) {
                int atEveryIndex = (2*n) - (Math.min(Math.min(i,j),Math.min(2*n-i,2*n-j)));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
