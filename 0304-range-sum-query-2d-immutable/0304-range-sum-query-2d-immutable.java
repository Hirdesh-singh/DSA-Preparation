class NumMatrix {
    int[][] p;
    public NumMatrix(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;
        p= new int[n][m];
        p[0][0]= matrix[0][0];
        for(int i=1; i<n; i++){
            p[i][0]= p[i-1][0]+matrix[i][0];
        }
        for(int i=1; i<m; i++){
            p[0][i]= p[0][i-1]+matrix[0][i];
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m;j++){
                p[i][j]= p[i-1][j]+p[i][j-1]-p[i-1][j-1]+matrix[i][j];
            }
        }

    }
    
    public int sumRegion(int r1, int c1, int r2, int c2) {
        return p[r2][c2]
            - (c1>0 ? p[r2][c1-1] : 0)
            - (r1>0 ? p[r1-1][c2] : 0)
            + ( r1>0 && c1>0 ? p[r1-1][c1-1] : 0);
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */