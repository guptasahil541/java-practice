package EvenDigits;

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = input.nextInt();

        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int numEvenDigits = countEvenDigitNums(arr);

        System.out.println("Number of even digit elements is: " + numEvenDigits);
    }

    static int countEvenDigitNums(int[] arr) {
        int count = 0;

        for(int elem: arr) {
            if(containsEvenDigits(elem)) {
                count++;
            }
        }

        return count;
    }

    static boolean containsEvenDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count % 2 == 0;
    }
}
