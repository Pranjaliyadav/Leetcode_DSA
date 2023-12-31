class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        //transpose
        for(int i = 0 ; i < m ; i++){
            for(int j = 0; j < i; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }

        int p1c = 0;
        int p2c = n - 1;

        while(p1c<p2c){
        for(int i = 0 ; i < m; i++){
            int t = matrix[i][p1c];
            matrix[i][p1c] = matrix[i][p2c];
            matrix[i][p2c] = t;
        }
        p1c++;
        p2c--;
    }

    }
}