public class Display {
    private final int[][][] maze;

    public Display(int[][][] maze) {
        this.maze = maze;
    }

    public void drawMaze() {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < this.maze.length ; i++) {
            result.append(drawHorizontalLine(i));
            result.append(drawVerticalLines(i));
        }
        result.append(drawLastLine());
        System.out.println(result);
    }

    private String drawHorizontalLine(int rowIndex) {
        StringBuilder result = new StringBuilder("#");
        for(int i = 0; i < this.maze[rowIndex].length; i++) {
            if(this.maze[rowIndex][i][1] == 1) {
                result.append("###");
            }else {
                result.append("  #");
            }
        }
        result.append("\n");
        return result.toString();
    }

    private String drawVerticalLines(int rowIndex) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < this.maze[rowIndex].length; i++) {
            if(this.maze[rowIndex][i][0] == 1) {
                result.append("#  ");
            }else {
                result.append("   ");
            }

        }
        if(this.maze[rowIndex][this.maze[rowIndex].length - 1][2] == 1){
            result.append("#");
        }else {
            result.append(" ");
        }
        result.append("\n");
        return result.toString();
    }

    private String drawLastLine() {
        StringBuilder result = new StringBuilder("#");
        for(int i = 0; i < this.maze[this.maze.length - 1].length; i++) {
            if(this.maze[this.maze.length - 1][i][3] == 1) {
                result.append("###");
            }else {
                result.append("  #");
            }
        }
        return result.toString();
    }

}
