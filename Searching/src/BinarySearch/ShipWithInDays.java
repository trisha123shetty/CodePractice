package BinarySearch;

public class ShipWithInDays {

    public int shipWithinDays(int[] arr, int days) {
        int n = arr.length;
        int high = 0;
        int low = Integer.MIN_VALUE;
        
        // Find the max weight and sum of all weights
        for (int i = 0; i < n; i++) {
            if (arr[i] > low) {
                low = arr[i];  // Max weight in the array (cannot be less than this)
            }
            high += arr[i];  // Total weight (max possible capacity)
        }

        int minC = high;

        // Binary search to find the minimum capacity required to ship within 'days'
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Middle value (candidate capacity)
            int load = 0;
            int d = 1;  // Start with the first day

            // Check if it's possible to ship with the current 'mid' capacity
            for (int i = 0; i < n; i++) {
                if (load + arr[i] <= mid) {
                    load += arr[i];  // Add the current weight to the current day's load
                } else {
                    d++;  // Start a new day
                    load = arr[i];  // New day starts with the current package

                    if (d > days) {
                        break;  // If the number of days exceeds the allowed 'days', no need to check further
                    }
                }
            }

            // If we can ship within 'days' days, try to minimize the capacity
            if (d <= days) {
                minC = mid;
                high = mid - 1;  // Try a smaller capacity
            } else {
                low = mid + 1;  // Try a larger capacity
            }
        }

        return minC;  // The minimum ship capacity found
    }


}
