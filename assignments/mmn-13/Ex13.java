import static java.util.Arrays.stream;

public class Ex13 {
    // QUESTION 1
    /**
     * This method finds the shortest path between two roads.
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param road1 first road
     * @param road2 second road
     * @return the time it takes when taking the shortest path between the two roads.
     */
    public static int shortestRoad(int[] road1, int[] road2) {
        int firstRoadLen = roadLength(road1);
        int secondRoadLen = roadLength(road2);
        int shortestPath = Math.min(firstRoadLen, secondRoadLen);

        int currentFirstRoadSum = firstRoadLen;
        int currentSecondRoadSum = secondRoadLen;

        for (int roadSegment = 0; roadSegment < road1.length; roadSegment++) {
            currentFirstRoadSum = updateLen(currentFirstRoadSum, road1[roadSegment], road2[roadSegment]);
            currentSecondRoadSum = updateLen(currentSecondRoadSum, road2[roadSegment], road1[roadSegment]);
            int currentMin = Math.min(currentFirstRoadSum, currentSecondRoadSum);
            shortestPath = Math.min(currentMin, shortestPath);
        }

        return shortestPath;
    }

    /**
     * This method calculates the length of a road.
     * @param road the road to calculate the length of.
     * @return the length of the road.
     */
    private static int roadLength(int[] road) {
        return stream(road).sum();
    }

    /**
     * This method updates the length of a road.
     * @param currentSum the current length of the road.
     * @param fromRoad1 the length of the road segment from road 1.
     * @param fromRoad2 the length of the road segment from road 2.
     * @return the updated length of the road.
     */
    private static int updateLen(int currentSum, int fromRoad1, int fromRoad2) {
        return currentSum - fromRoad1 + fromRoad2;
    }


    // QUESTION 2
    /**
     * This method finds the missing value in an arithmetic progression.
     *
     * Time complexity: O(log(n))
     * Space complexity: O(1)
     *
     * @param arr the array to search in.
     * @return the missing value.
     */
    public static int missingValue (int[] arr) {
        int low = 0;
        int high = arr.length;
        int arithmeticDis = (arr[1] - arr[0]);

        int result = binarySearch(arr, low, high, arithmeticDis);
        return result;
    }

    /**
     * This method uses a binary search to find the missing value in an arithmetic progression.
     * @param arr the array to search in.
     * @param low the lower bound of the array.
     * @param high the upper bound of the array.
     * @param dis the arithmetic progression distance.
     * @return the missing value.
     */
    private static int binarySearch (int[] arr, int low, int high, int dis)  {
        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (arr[middle] - ((middle - low) * dis) == arr[low])
                low = middle;

            else
                return arr[low] + dis;

            middle = low + (high - low) / 2;

        }

        return arr[low] + dis;
    }


    // QUESTION 3
    /**
     * This method finds the longest palindrome in an array.
     *
     * Time complexity: O(2^n)
     * Space complexity: O(n)
     *
     * @param arr the array to search in.
     * @return the length of the longest palindrome.
     */
    public static int longestPalindrome (int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        return getLongestPalindromeLength(arr, low, high);
    }

    /**
     * This method finds the length of the longest palindrome in an array.
     * @param arr the array to search in.
     * @param low the lower bound of the array.
     * @param high the upper bound of the array.
     * @return the length of the longest palindrome.
     */
    private static int getLongestPalindromeLength (int[] arr, int low, int high) {
        if (low > high) {
            return 0; // Base case: empty subarray
        }

        if (low == high) {
            return 1; // Base case: single element subarray
        }

        if (arr[low] == arr[high]) {
            int innerLength = getLongestPalindromeLength(arr, low + 1, high - 1);
            return 2 + innerLength; // Current elements contribute to the palindrome
        }

        int length1 = getLongestPalindromeLength(arr, low, high - 1);
        int length2 = getLongestPalindromeLength(arr, low + 1, high);
        return Math.max(length1, length2);
    }


    // QUESTION 4
    /**
     * This method checks if there is a subset in an array that sums up to a given number.
     *
     * Time complexity: O(2^n)
     * Space complexity: O(n)
     *
     * @param arr the array to search in.
     * @param num the number to check if there is a subset that sums up to it.
     * @return true if there is a subset that sums up to num, false otherwise.
     */
    public static boolean isSum(int[] arr, int num) {
        return hasSubsetWithSum(arr, num, 0, false);
    }

    /**
     * This method checks if there is a subset in an array that sums up to a given number.
     * @param arr the array to search in.
     * @param num the number to check if there is a subset that sums up to it.
     * @param index the current index in the array.
     * @param adjacentTaken true if the previous element was taken, false otherwise.
     * @return true if there is a subset that sums up to num, false otherwise.
     */
    private static boolean hasSubsetWithSum(int[] arr, int num, int index, boolean adjacentTaken) {
        if (num == 0) {
            return true; // Base case: subset with sum equal to num is found
        }

        if (index >= arr.length) {
            return false; // Base case: reached the end of the array
        }

        // Exclude the current element and continue searching
        boolean exclude = hasSubsetWithSum(arr, num, index + 1, false);

        // Include the current element if it satisfies the conditions
        boolean include = false;
        if (!adjacentTaken && (index == 0 || index >= 2 && arr[index] != arr[index - 2])) {
            include = hasSubsetWithSum(arr, num - arr[index], index + 1, true);
        }

        return include || exclude;
    }
}
