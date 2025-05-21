public class MatZeroOptimal {
    public static void makeZero(int[][] mat){
        int col0 = 1;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 0){
                    mat[i][0] = 0;
                    if(j != 0){
                        mat[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        for(int i = 1; i < mat.length; i++){
            for(int j = 1; j < mat[0].length; j++){
                if(mat[0][j] == 0 || mat[i][0] == 0){
                    mat[i][j] = 0;
                }
            }
        }

        if(mat[0][0] == 0){
            for(int j = 0; j < mat[0].length; j++){
                mat[0][j] = 0;
            }
        }

        if(col0 == 0){
            for(int i = 0; i < mat.length; i++){
                mat[i][0] = 0;
            }
        }
    }

    public static void printMatrix(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
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
        makeZero(mat);
        printMatrix(mat);
    }
}
