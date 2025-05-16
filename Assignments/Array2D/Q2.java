public class Q2 {
    public static void main(String args[]){
        int nums[][] = {{4, 7, 8},{11, 4, 3},{2, 2, 3}};
        int j = 0;
        int sum = 0;
        while(j<nums[0].length){
            sum += nums[1][j];
            j++;
        }
        System.out.println("Sum of the numbers in the second row of nums is: "+sum);
    }
}
