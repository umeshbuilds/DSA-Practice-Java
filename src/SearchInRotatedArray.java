class SearchInRotatedSearchArray {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If array is not rotated
        if (pivot == -1) {
            return binerySearch(nums, target, 0, nums.length - 1);
        }

        // If target is pivot element
        if (nums[pivot] == target) {
            return pivot;
        }

        // Decide which sub-array to search
        if (target >= nums[0]) {
            return binerySearch(nums, target, 0, pivot - 1);
        } else {
            return binerySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    int binerySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid; // Added missing target match return
            }
        }
        return -1;
    }

    int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot point (peak)
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            // Check if mid-1 is the pivot point (peak)
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Decide whether to search left or right half
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}