package CheckArmstrong;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it is armstrong: ");
        int num = input.nextInt();

        boolean isArmstrong = isArmstrong(num);

        System.out.println("Is the entered number armstrong: " + isArmstrong);
    }

    static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;

        while(num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        return sum == temp;
    }
}
