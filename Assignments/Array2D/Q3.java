public class Q3 {
    public static void main(String args[]){
        int row=2, col=3;
        int mat[][] = {{11, 12, 13},{21, 22, 23}};

        //Print Matrix
        System.out.println("Normal Matrix: ");
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<col; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        //Transpose Matrix
        int transpose[][] = new int[col][row];
        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<row; j++){
                transpose[i][j] = mat[j][i];
            }
        }

        //Print Transpose
        System.out.println("Transpose Matrix: ");
        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<row; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
