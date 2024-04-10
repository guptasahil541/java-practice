package InfiniteArraySearch;

public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
        int target = 8;

        int linearSearchPosition = searchElementLinear(nums, target);
        System.out.println("Target element found through is at position: " + linearSearchPosition);
    }

    static int searchElementLinear(int[] nums, int target) {
        int start = 0;
        boolean stop = false;

        while(!stop) {
            if(nums[start] == target) {
                return start;
            } else if(nums[start] > target) {
                stop = true;
            } else {
                start++;
            }
        }

        return -1;
    }
}
