package MazeGame;

import java.util.Random;
import java.util.Scanner;

public class MazeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Maze mze = new Maze(0, 0);
        System.out.println("\n=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
        System.out.println("\t\tWelcome to Maze game!");
        System.out.println("=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
        System.out.print("\nRow: ");
        mze.setRow(sc.nextInt());
        System.out.print("Column: ");
        mze.setColumn(sc.nextInt());

        int row = mze.getRow();
        int column = mze.getColumn();
        char[][] maze = new char[row][column];

        int RowP = random.nextInt(1, row / 2);
        int RowE = random.nextInt(row / 2, row - 1);
        int ColumnP = random.nextInt(1, 2);
        int ColumnE = random.nextInt(column - 2, column - 1);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                maze[i][j] = ' ';
                maze[RowP][ColumnP] = 'P';
                maze[RowE][ColumnE] = 'E';
                maze[0][j] = '#';
                maze[row - 1][j] = '#';
                maze[i][0] = '#';
                maze[i][column - 1] = '#';
            }
        }

        boolean isfinished = true;
        int step = 0;
        while (isfinished) {
            System.out.println("Please write direction: ");
            String direction = sc.nextLine();
            if((RowP == 0) || ColumnP == 0){
                System.out.println("Divara deydi");
                break;
            } else if (direction.equals("up")) {
                RowP = RowP - 1;
            } else if (direction.equals("down")) {
                RowP = RowP + 1;
            } else if (direction.equals("right")) {
                ColumnP = ColumnP + 1;
            } else if (direction.equals("left")) {
                ColumnP = ColumnP - 1;
            }
            System.out.println("\nMaze: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    maze[i][j] = ' ';
                    maze[RowP][ColumnP] = 'P';
                    maze[RowE][ColumnE] = 'E';
                    maze[0][j] = '#';
                    maze[row - 1][j] = '#';
                    maze[i][0] = '#';
                    maze[i][column - 1] = '#';
                    System.out.print(maze[i][j] + " ");
                }
                System.out.println();
            }
            step++;
            if (maze[RowP][ColumnP] == maze[RowE][ColumnE]) {
                System.out.println("\n=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
                System.out.println("Congratulations! Game finished successfully in " + (step - 1) + " step");
                System.out.println("=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
                isfinished = false;
            }
        }
    }
}
