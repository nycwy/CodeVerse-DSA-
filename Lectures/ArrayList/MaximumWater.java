import java.util.*;

public class MaximumWater {
    public static int maxWaterContainer(ArrayList<Integer> height) {
        int maxWater = Integer.MIN_VALUE;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int width = j - i;
                int currWaterContainer = (Math.min(height.get(i), height.get(j))) * width;
                maxWater = Math.max(maxWater, currWaterContainer);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // ArrayList<Integer> height = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));

        System.out.println(maxWaterContainer(height));
    }
}
