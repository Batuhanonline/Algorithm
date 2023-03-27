class Solution {
    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int [][] totalTable = new int[m][n];

        totalTable[0][0] = grid[0][0];

        for(int i = 1; i < m; i++){
            totalTable[i][0] = totalTable[i-1][0] + grid[i][0];
        }  
        for(int j = 1; j < n; j++){
            totalTable[0][j] = totalTable[0][j-1] + grid[0][j];
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){

                int leftBottom = totalTable[i-1][j];

                int rightTop = totalTable[i][j-1];

                totalTable[i][j] = Math.min(leftBottom, rightTop) + grid[i][j];
            }
        }

        return totalTable[m-1][n-1];

    }
}