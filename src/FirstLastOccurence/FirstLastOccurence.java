package FirstLastOccurence;

import java.util.Arrays;

public class FirstLastOccurence {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 9, 10};
        int target = 11;
        int[] ans = searchRange(nums, target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
        int first = firstOccurence(nums, target);
        int last = lastOccurence(nums, target);

        return new int[]{ first, last };
    }

    static int firstOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start)/2;

        int ans = -1;

        while(start <= end) {
            if(nums[mid] == target) {
                ans = mid;
                end = mid - 1;
                mid = start + (end - start) / 2;
            } else if(nums[mid] > target) {
                end = mid - 1;
                mid = start + (end - start) / 2;
            } else {
                start = mid + 1;
                mid = start + (end - start) / 2;
            }
        }

        return ans;
    }

    static int lastOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start)/2;

        int ans = -1;

        while(start <= end) {
            if(nums[mid] == target) {
                ans = mid;
                start = mid + 1;
                mid = start + (end - start) / 2;
            } else if(nums[mid] > target) {
                end = mid - 1;
                mid = start + (end - start) / 2;
            } else {
                start = mid + 1;
                mid = start + (end - start) / 2;
            }
        }

        return ans;
    }
}
