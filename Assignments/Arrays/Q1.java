public class Q1{
    public static boolean repeat(int nums[]){
        Arrays.sort(nums);
        int i=nums.length-1;
        while (i >= 0) {
            if(nums[i-1] == nums[i]){
                return true;
            }
            i--;
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(repeat(nums));
    }
}