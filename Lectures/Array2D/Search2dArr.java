import java.util.Scanner;

public class Search2dArr {
    public static int[] staircaseSearch(int mat[][], int target){
        int row=0, col=mat[0].length-1;

        while(row < mat.length && col >= 0){
            if(mat[row][col] == target){
                return new int[]{row, col};
            }else if(mat[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return new int[] {-1, -1}; //Not found
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of matrix (n x n): ");
        int n = sc.nextInt();

        int mat[][] = new int[n][n];

        System.out.println("Enter all the elements (row-wise sorted and column-wise sorted): ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the key to search: ");
        int target = sc.nextInt();

        int res[] = staircaseSearch(mat, target);

        if(res[0]== -1 && res[1]== -1){
            System.out.println("Value not found.");
        }else{
            System.out.println("Value found at: ("+res[0]+","+res[1]+")");
        }
    }
}
