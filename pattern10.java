public class pattern10 {

    public static void main(String args[]) {

        int n = 5;
        int i;
        
        // Upper half

        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");

            }
                

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");

            }
            System.out.println();

        }

        // lower half

        for (i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");

            }
                

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");

            }
            System.out.println();

        }
        

    }

}
