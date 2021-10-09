public class ReverseArray {

    // iterative approach
    public static void reverseArr(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverseRecursively(int[] arr, int start, int end) {
        int temp = 0;

        if (start >= end)
            return;

        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseRecursively(arr, start + 1, end - 1);
    }
}
