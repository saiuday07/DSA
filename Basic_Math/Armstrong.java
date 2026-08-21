import java.util.*;

class Armstrong {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int original = n;
        int temp = n;
        int digits = 0;
        int sum = 0;
        while(temp != 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while(temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for(int i = 0; i < digits; i++) {
                power = power * digit;
            }
            sum = sum + power;
            temp = temp / 10;
        }
        if(sum == original) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}