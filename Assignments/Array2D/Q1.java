public class Q1 {
    public static void count7(int arr[][], int target){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == target){
                    count++;
                }
            }
        }
        System.out.println("Number of "+target+" in the matrix: "+count);
    }
    public static void main(String args[]){
        int arr[][] = {{4, 7, 8},{8, 8, 7}};
        count7(arr, 7);
    }
}
