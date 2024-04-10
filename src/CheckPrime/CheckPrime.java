package CheckPrime;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int num = input.nextInt();

        boolean isPrime = isPrime(num);

        System.out.println("Is the entered number prime: " + isPrime);
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
