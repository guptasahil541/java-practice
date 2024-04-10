package MaxItem;

import java.util.Scanner;

public class MaxItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an array of numbers: ");
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int maxNum = maxNum(arr);

        System.out.println("Maximum number is: " + maxNum);
    }

    static int maxNum(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
