class MedianOfTwoSortedArrays {
    // Given two sorted arrays nums1 and nums2 of size m and n respectively, return
    // the median of the two sorted arrays.
    // The overall run time complexity should be O(log (m+n)).

    // This is a really interesting problem, because the naive approach takes O(N+M)
    // time and O(n+m) space
    // but with the coonstraint of log(n+m) runtime I had to think a litte bit

    // first the naive approach using merge technique and simple median calculation

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int[] merged = new int[len1 + len2];

        // first consider a few base cases for possible saving of time
        if (len1 == 0 && len2 == 0)
            return 0.0;
        if (len1 == 0)
            return median(nums2);
        if (len2 == 0)
            return median(nums1);

        int i = 0, j = 0, index = 0;

        // merge the arrays
        while (i < len1 && j < len2) {
            if (nums1[i] < nums2[j]) {
                merged[index++] = nums1[i++];
            } else {
                merged[index++] = nums2[j++];
            }
        }
        while (i < len1) {
            merged[index++] = nums1[i++];
        }
        while (j < len2) {
            merged[index++] = nums2[j++];
        }
        double median = median(merged);
        return median;
    }

    public static double median(int[] arr) {
        int mid = arr.length / 2;
        if (arr.length % 2 == 0) {
            return ((arr[mid] + arr[mid - 1]) / 2.0);
        } else {
            return arr[mid];
        }
    }
}