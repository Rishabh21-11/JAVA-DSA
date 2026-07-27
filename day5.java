public class day5 {
       static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    static int bS(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // First Occurrence
    static int occurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        // Linear Search
        int[] arr1 = {10, 30, 20, 40, 90};
        int target1 = 100;

        int ans1 = linearSearch(arr1, target1);

        if (ans1 == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element found at index " + ans1);
        }

        // Binary Search
        int[] arr2 = {10, 20, 30, 40, 50, 60, 70};
        int target2 = 40;

        int ans2 = bS(arr2, target2);

        if (ans2 == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element found at index " + ans2);
        }

        // First Occurrence
        int[] arr3 = {1, 2, 2, 2, 3, 4, 5};
        int target3 = 2;

        int ans3 = occurrence(arr3, target3);

        if (ans3 == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("First occurrence at index " + ans3);
        }

    }
        
}
