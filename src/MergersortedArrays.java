import  java.util.Arrays;

public class MergersortedArrays {
//    Examples:
//
//    Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
//    Output:
//            2 2 3 4
//            7 10
//    Explanation: After merging the two non-decreasing arrays, we get, 2 2 3 4 7 10
//    Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
//    Output:
//            1 2 3 5 8 9
//            10 13 15 20
//    Explanation: After merging two sorted arrays we get 5 10 12 18 20.
//    Input: a[] = [0, 1], b[] = [2, 3]
//    Output:
//            0 1
//            2 3
//    Explanation: After merging two sorted arrays we get 0 1 2 3.

    public static void mergetoString(int[] arr1, int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        for (int i = n - 1, j = 0; i >= 0 && j < m; i--, j++) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };
        int n = arr1.length;
        int m = arr2.length;
        int res[] = new int[n + m];

        System.arraycopy(arr1, 0, res, 0, n);
        System.arraycopy(arr2, 0, res, n, m);

        Arrays.sort(res);

        System.out.println(Arrays.toString(res));
        mergetoString(arr1, arr2);
        System.out.println("There is a next Way ");
    }
}