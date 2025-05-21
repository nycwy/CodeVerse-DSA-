public class Matrix {
    public static void matZero(int mat[][]){
        int row[] = new int[mat.length];
        int col[] = new int[mat[0].length];

        for(int i=0; i<row.length; i++){
            for (int j=0; j<col.length; j++){
                if(mat[i][j] == 0){
                    row[i] = 1;
                    col[i] = 1;
                }
            }
        }

        for(int i=0; i<row.length; i++){
            for(int j=0; j<col.length; j++){
                if(row[i] == 1 || col[j] == 1){
                    mat[i][j] = 0;
                }
            }
        }
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
            int[][] mat = {
            { 1, 2, 3 },
            { 4, 0, 6 },
            { 7, 8, 0 }
        };
        matZero(mat);
    }
}
