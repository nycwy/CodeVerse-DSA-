public class MaximumWater {
    public static int maximumWater(int arr[]) {
        int maxWater = Integer.MIN_VALUE;
        // int difference;
        // int currContainedWater;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int difference = j - i;
                int currContainedWater = (Math.min(arr[i], arr[j])) * difference;
                if (maxWater < currContainedWater) {
                    maxWater = currContainedWater;
                }
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maximumWater(arr));
    }
}
