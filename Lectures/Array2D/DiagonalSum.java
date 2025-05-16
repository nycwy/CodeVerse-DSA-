import java.util.Scanner;

public class DiagonalSum{
    public static void printMatrix(int mat[][]){
        System.out.println("2D Array (Matrix): ");
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void diagonalSum(int mat[][]){
        int sum=0;
        for(int i=0; i<mat.length; i++){
            sum+=mat[i][i];
            if(i != mat.length-i-1){
                sum+=mat[i][mat.length-i-1];
            }
        }
        System.out.println("Diagonal Sum is: "+sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        System.out.println("Enter all the elements: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        printMatrix(mat);
        diagonalSum(mat);
    }
}