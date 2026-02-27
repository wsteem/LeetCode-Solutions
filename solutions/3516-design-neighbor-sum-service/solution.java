class NeighborSum {
    private int[][] grid;

    public NeighborSum(int[][] grid) {
        this.grid = grid;
    }
    
    public int adjacentSum(int value) {
        int sum = 0;
        for(int row = 0; row<grid.length; row++) {
            for(int col = 0; col<grid[row].length; col++) {

                if( (col-1) >= 0 && grid[row][col-1] == value) {
                    sum += grid[row][col];
                }
                else if((col+1) < grid[row].length && grid[row][col+1] == value) {
                    sum += grid[row][col];
                }
                else if((row-1) >=0 && grid[row-1][col] == value) {
                    sum += grid[row][col];
                }
                else if((row+1) < grid.length && grid[row+1][col] == value) {
                    sum += grid[row][col];
                }
            }
        }
        return sum;
    }
    
    public int diagonalSum(int value) {
        int sum = 0;
        for(int row = 0; row<grid.length; row++) {
            for(int col = 0; col<grid[row].length; col++) {

                if((row-1) >= 0 && (col-1) >= 0 && grid[row-1][col-1] == value) {
                    sum += grid[row][col];
                }
                else if((row-1) >= 0 && (col+1) < grid[row].length && grid[row-1][col+1] == value) {
                    sum += grid[row][col];
                }
                else if((row+1) < grid.length && (col-1) >= 0 && grid[row+1][col-1] == value) {
                    sum += grid[row][col];
                }
                else if((row+1) < grid.length && (col+1) < grid[row].length && grid[row+1][col+1] == value) {
                    sum += grid[row][col];
                }
            }
        }
        return sum;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */
