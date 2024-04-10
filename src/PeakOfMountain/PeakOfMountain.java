package PeakOfMountain;

import java.util.Scanner;

public class PeakOfMountain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        System.out.print("Enter the elements of the array: ");
        int[] nums = new int[size];
        for(int i = 0; i < size; i++) {
            nums[i] = input.nextInt();
        }

        int peakPos = findPeak(nums);
        System.out.println("Peak element is at index: " + peakPos);
    }

    static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start)/2;

        while(start < end){
            if(nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = start + (end - start)/2;
        }

        return start;
    }
}
