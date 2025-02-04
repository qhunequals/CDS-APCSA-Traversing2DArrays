// Radioactivity Starter      A+CR
class Main {
  public static void main(String[] args) {
    
		double[][] grid = {{45, 36, 17, 35, 4, 38},{25,32,60,43,60,1}, {50,4,65,42,2,26},{36,24,3,43,41,11}};

		for(double i[] : grid){
      for(double j : i){
        if(j < 10){
          System.out.print((int)j + "  ");
        }
        else{
          System.out.print((int)j + " ");
        }
      }
      System.out.println("");
    }

    int max = (int)grid[0][0];
    int maxRow = 0;
    int maxCol = 0;
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        if(max < grid[r][c]){
          max = (int)grid[r][c];
          maxRow = r;
          maxCol = c;
        }
      }
    }
    System.out.println("\n\nThe greatest number is " + max + " and it is at location " + (maxRow + 1) + ", " + (maxCol + 1) + "\n\n");



    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        if(grid[r][c] >= 50){
          System.out.println("There are dangerous levels of radiation at location " + (r + 1) + ", " + (c + 1));
        }
      }
    }



  }
}