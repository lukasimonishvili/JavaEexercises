public class Display {
    private int[][][] maze;

    public Display(int[][][] maze) {
        this.maze = maze;
    }

    public void drawMaze() {
        String result = "";
        for(int i = 0; i < this.maze.length ; i++) {
            result += drawHorizontalLine(i);
            result += drawVerticalLines(i);
        }
        result += drawLastLine();
        System.out.println(result);
    }

    private String drawHorizontalLine(int rowIndex) {
        String result = "#";
        for(int i = 0; i < this.maze[rowIndex].length; i++) {
            if(this.maze[rowIndex][i][1] == 1) {
                result += "###";
            }else {
                result += "\u0020\u0020#";
            }
        }
        result += "\n";
        return result;
    }

    private String drawVerticalLines(int rowIndex) {
        String result = "";
        for(int i = 0; i < this.maze[rowIndex].length; i++) {
            if(this.maze[rowIndex][i][0] == 1) {
                result += "#\u0020\u0020";
            }else {
                result += "\u0020\u0020\u0020";
            }

        }
        if(this.maze[rowIndex][this.maze[rowIndex].length - 1][2] == 1){
            result += "#";
        }else {
            result += "\u0020";
        }
        result += "\n";
        return result;
    }

    private String drawLastLine() {
        String result = "#";
        for(int i = 0; i < this.maze[this.maze.length - 1].length; i++) {
            if(this.maze[this.maze.length - 1][i][3] == 1) {
                result += "###";
            }else {
                result += "\u0020\u0020#";
            }
        }
        return result;
    }

}
