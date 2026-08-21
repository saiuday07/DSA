import java.util.*;

class Palindrome{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int original=n;
        int reverse = 0;
        while(n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        if(reverse==original){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}