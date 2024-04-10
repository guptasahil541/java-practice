package GetCeiling;

import java.util.Scanner;

public class GetCeiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the element to find the ceiling of: ");
        int elem = input.nextInt();

        int ceilingPos = getCeiling(arr, elem);
        System.out.println("The ceiling element is present at index: " + ceilingPos);
    }

    static int getCeiling(int[] arr, int num) {
        if(arr[arr.length - 1] < num) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int mid = calculateMid(start, end);

        while(start <= end) {
            if(arr[mid] == num) {
                return mid;
            }
            else if(arr[mid] < num) {
                start = mid + 1;
                mid = calculateMid(start, end);
            }
            else {
                end = mid - 1;
                mid = calculateMid(start, end);
            }
        }

        return start;
    }

    static int calculateMid(int start, int end) {
        return start + (end - start) / 2;
    }
}
