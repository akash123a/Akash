import java.util.*;

public class FirstNegativeinEveryWindowofsizek
{

//    Examples:
//
//    Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
//    Output: [-8, 0, -6, -6]
//    Explanation:
//    Window {-8, 2}: First negative integer is -8.
//    Window {2, 3}: No negative integers, output is 0.
//    Window {3, -6}: First negative integer is -6.
//    Window {-6, 10}: First negative integer is -6.
    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Add the current element index to the queue if it's negative
            if (arr[i] < 0) {
                queue.add(i);
            }

            // Remove elements that are out of the current window
            if (!queue.isEmpty() && queue.peek() < i - k + 1) {
                queue.poll();
            }

            // Add the first negative number in the window to the result
            if (i >= k - 1) {
                if (!queue.isEmpty()) {
                    result.add(arr[queue.peek()]);
                } else {
                    result.add(0);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(FirstNegativeInteger(arr, k));
    }
}
