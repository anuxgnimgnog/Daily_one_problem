package everyday_ex.d20_10_30;

public class easy_10_30 {
    public static void main(String[] args) {

    }
    public int islandPerimeter(int[][] grid){
        int land = 0;
        int border = 0;
        for (int i = 0;i<grid.length;i++){
            for (int j = 0;j<grid[i].length;j++){
                if (grid[i][j] == 1){
                    land++;
                    if (i < grid.length-1 && grid[i+1][j] == 1){
                        border++;
                    }
                    if (j< grid[i].length-1 && grid[i][j+1]==1){
                        border++;
                    }
                }
            }
        }
        return land*4 - border*2;
    }
}
