import java.util.*;

class Pattern8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = n; i > 0; i--) {

            // spaces
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}