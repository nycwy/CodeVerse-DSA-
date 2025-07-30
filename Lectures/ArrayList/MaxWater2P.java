import java.util.*;

public class MaxWater2P {
    public static int maxWater(ArrayList<Integer> height) {
        int maxContainedWater = 0;
        int si = 0;
        int ei=height.size()-1;
        while (si < ei) {
            int width = ei - si;
            int containerHeight = Math.min(height.get(si), height.get(ei));
            int waterContained = containerHeight * width;
            maxContainedWater = Math.max(waterContained, maxContainedWater);
            if (height.get(si) < height.get(ei)) {
                si++;
            } else {
                ei--;
            }
        }
        return maxContainedWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        System.out.println(maxWater(height));
    }
}
