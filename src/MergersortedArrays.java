import  java.util.Arrays;

public class MergersortedArrays {


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