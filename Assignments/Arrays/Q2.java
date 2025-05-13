public class Q2 {
    public static int rotatedArr(int nums[], int target){
        int si = 0;
        int ei = nums.length-1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[mid] > target){
                ei = mid-1;
            }else{
                ei = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(rotatedArr(nums, target));
    }
}
