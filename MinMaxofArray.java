public class MinMaxofArray {

    static class Pair {
        int min, max;

        // O(N) Time
        public static Pair minMaxPair(int[] arr, int low, int high) {
            Pair minMax = new Pair();
            Pair minmaxLeft = new Pair();
            Pair minmaxRight = new Pair();

            int middle;

            // if there is only one elem
            if (low == high) {
                minMax.max = arr[low];
                minMax.min = arr[low];
                return minMax;
            }

            // if there are two elems
            if (high == low + 1) {
                if (arr[low] > arr[high]) {
                    minMax.max = arr[low];
                    minMax.min = arr[high];
                } else {
                    minMax.max = arr[high];
                    minMax.min = arr[low];
                }
                return minMax;
            }

            // if there are more than 2 elems
            middle = (low + high) / 2;
            minmaxLeft = minMaxPair(arr, low, middle);
            minmaxRight = minMaxPair(arr, middle + 1, high);

            // compare the results
            minMax.min = (minmaxLeft.min > minmaxRight.min) ? minmaxRight.min : minmaxLeft.min;
            minMax.max = (minmaxRight.max > minmaxLeft.max) ? minmaxRight.max : minmaxLeft.max;

            return minMax;
        }
    }
}
