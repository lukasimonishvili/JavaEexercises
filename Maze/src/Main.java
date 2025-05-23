public class Main {
    static Maze maze = new Maze(10, 10);
    static Display display = new Display(maze.maze);

    public static void main(String[] args) {
        display.drawMaze();
    }
}