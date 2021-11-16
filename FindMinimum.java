package Assignment3;

	//Input: nums = [3,4,5,1,2]
	//Output: 1
	//Explanation: The original array was [1,2,3,4,5] rotated 3 times.

public class FindMinimum {
	
	public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(nums[mid] < nums[low]) {
                // right is sorted
                if(nums[mid] < min) min = nums[mid];
                high = mid - 1;
            } else if(nums[mid] > nums[high]) {
                // left is sorted
                if(nums[high] < min) min = nums[high];
                low = mid + 1;
            } else {
                // all sorted
                if(nums[low] < min) min = nums[low];
                high = mid - 1;
            }
        }
        return min;
    }
}
