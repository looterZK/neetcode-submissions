class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length; 
        int cols = matrix[0].length;

        boolean[] rZ = new boolean[rows];
        boolean[] cZ = new boolean[cols];

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(matrix[r][c] == 0){
                    rZ[r] = true;
                    cZ[c] = true;
                }
            }
        }

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(rZ[r] || cZ[c]){
                    matrix[r][c] = 0;
                }
            }
        }

    }
}
