public class binerySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {10, 23, 35, 48, 56, 77, 89, 90};
        int target = 77;

        int index = search(arr, target, 0, arr.length - 1);
        System.out.println("Target found at index: " + index);
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        // Compare target with the element arr[m], not the index m
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }

        return search(arr, target, m + 1, e);
    }
}