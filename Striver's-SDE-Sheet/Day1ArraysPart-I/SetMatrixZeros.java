public class SetMatrixZeros{
    public static void setZeros(int mat[][]){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==0){
                    makeRow(mat, i); //-1
                    makeCol(mat, j); //-1
                }
            }
        }
        printMatrix(mat);
    }
    public static void makeRow(int mat[][], int i){
        for(int j=0; j<mat[0].length; j++){
            if(mat[i][j] != 0){
                mat[i][j] = -1;
            }
        }
    }
    public static void makeCol(int mat[][], int j){
        for(int i=0; i<mat.length; i++){
            if(mat[i][j] != 0){
                mat[i][j] = -1;
            }
        }
    }
    public static void printMatrix(int mat[][]){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == -1){
                    mat[i][j] = 0;
                }
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int mat[][] = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };
        setZeros(mat);
    }
}