import java.util.*;

class Pattern4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 0; i < n; i++) {

            for(int j = 0; j <=i; j++) {

                System.out.print(i+1);

            }

            System.out.println();
        }
    }
}