import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Maze {
    private final int width;
    private final int height;
    public int[][][] maze;
    private final Random random = new Random();
    private final List<String> visited = new ArrayList<>();
    private final List<String> drawingPath = new ArrayList<>();
    private boolean isExitFound = false;
    private String entranceWall = "";
    private int openExitTries = 0;

    public Maze(int with, int height) {
        this.width = with;
        this.height = height;
        this.maze = generateArray();
        this.pathGenerator();
    }

    private int[][][] generateArray() {
        int[][][] result = new int[this.height][this.width][4];
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++){
                result[i][j] = new int[]{1, 1, 1, 1};
            }
        }
        return result;
    }

    private void pathGenerator() {
        this.openEntrance();
        while(this.visited.size() < width * height) {
            List<String> neighbors = getNeighbors(drawingPath.getLast());

            if(neighbors.isEmpty()) {
                drawingPath.removeLast();
                continue;
            }
            String randomNeighbor = neighbors.get(random.nextInt(neighbors.size()));
            this.openPath(drawingPath.getLast(), randomNeighbor);
            if(!isExitFound) this.searchExit(randomNeighbor);
            this.visited.add(randomNeighbor);
            this.drawingPath.add(randomNeighbor);
        }
    }

    private void searchExit(String indexes) {
        String[] indexArr = indexes.split("-");
        int row = Integer.parseInt(indexArr[0]);
        int col = Integer.parseInt(indexArr[1]);
        String exitDirection = row == 0 ? "top" : row == this.height - 1 ? "bottom" : col == 0 ? "left" : col == this.width - 1 ? "right" : "no";
        if(exitDirection.equals("no") || exitDirection.equals(entranceWall)) return;
        if(this.openExitTries > 5) {
            this.openExitTries++;
            return;
        }
        this.isExitFound = true;
        switch (exitDirection) {
            case "top":
                this.maze[row][col][1] = 0;
            break;
            case "bottom":
                this.maze[row][col][3] = 0;
            break;
            case "left":
                this.maze[row][col][0] = 0;
            break;
            case "right":
                this.maze[row][col][2] = 0;
            break;
        }
    }

    private void openPath(String oldIndexes, String newIndexes) {
        String[] oldArr = oldIndexes.split("-");
        String[] newArr = newIndexes.split("-");
        int oldRow = Integer.parseInt(oldArr[0]);
        int oldCol = Integer.parseInt(oldArr[1]);
        int newRow = Integer.parseInt(newArr[0]);
        int newCol = Integer.parseInt(newArr[1]);
        String direction = oldRow > newRow ? "top" : oldRow < newRow ? "bottom" : oldCol > newCol ? "left" : "right";
        switch (direction) {
            case "left":
                this.maze[oldRow][oldCol][0] = 0;
                this.maze[newRow][newCol][2] = 0;
            break;
            case "right":
                this.maze[oldRow][oldCol][2] = 0;
                this.maze[newRow][newCol][0] = 0;
            break;
            case "top":
                this.maze[oldRow][oldCol][1] = 0;
                this.maze[newRow][newCol][3] = 0;
            break;
            case "bottom":
                this.maze[oldRow][oldCol][3] = 0;
                this.maze[newRow][newCol][1] = 0;
            break;
        }
    }

    private List<String> getNeighbors(String indexes) {
        List<String> result = new ArrayList<>();
        String[] indexList = indexes.split("-");
        int row = Integer.parseInt(indexList[0]);
        int col = Integer.parseInt(indexList[1]);

        if(col > 0 && !visited.contains(row + "-" + (col - 1))) {
            result.add(row + "-" + (col - 1));
        }

         if(row > 0 && !visited.contains((row - 1) + "-" + col)) {
             result.add((row - 1) + "-" + col);
         }

         if(col < this.maze[0].length - 1 && !visited.contains(row + "-" + (col + 1))) {
             result.add(row + "-" + (col + 1));
         }

         if(row < this.maze.length - 1 && !visited.contains((row + 1) + "-" + col)) {
             result.add((row + 1) + "-" + col);
         }
        return result;
    }

    private void openEntrance() {
        int wallIndex = this.random.nextInt(4);
        int randomIndex;
        String randomSquare = "";
        switch (wallIndex) {
            case 0:
                randomIndex = this.random.nextInt(this.height);
                randomSquare = randomIndex + "-0";
                this.entranceWall = "left";
                this.maze[randomIndex][0][0] = 0;
            break;
            case 1:
                randomIndex = this.random.nextInt(this.width);
                randomSquare = "0-" + randomIndex;
                this.entranceWall = "top";
                this.maze[0][randomIndex][1] = 0;
            break;
            case 2:
                randomIndex = this.random.nextInt(this.height);
                randomSquare = randomIndex + "-" + (this.width - 1);
                this.entranceWall = "right";
                this.maze[randomIndex][this.width - 1][2] = 0;
            break;
            case 3:
                randomIndex = this.random.nextInt(this.width);
                randomSquare = (this.height - 1) + "-" + randomIndex;
                this.entranceWall = "bottom";
                this.maze[this.height - 1][randomIndex][3] = 0;
            break;
        }
        this.visited.add(randomSquare);
        this.drawingPath.add(randomSquare);
    }
}
