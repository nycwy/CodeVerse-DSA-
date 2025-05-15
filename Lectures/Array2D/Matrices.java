import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int r = matrix.length, c = matrix[0].length;

        //Input Elements
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //Print Matrix
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //Smallest and Largest element in the matrix
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matrix[i][j] < small){
                    small = matrix[i][j];
                }
                if(matrix[i][j] > large){
                    large = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest Number in matrix is: "+small);
        System.out.println("Largest Number in matrix is: "+large);
    }
}
