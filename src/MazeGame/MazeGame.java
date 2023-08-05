package MazeGame;//package org.example.Lesson9;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class MazeGame {
//
//    public static void createMaze(int row, int column) {
//        Random random = new Random();
//        char[][] maze = new char[row][column];
//
//        int RowP = random.nextInt(1, row / 2);
//        int RowE = random.nextInt(row / 2, row - 1);
//        int ColumnP = random.nextInt(1, 2);
//        int ColumnE = random.nextInt(column - 2, column - 1);
//    }
//
//    public static void showMaze(int row, int column, char[][] maze,int ColumnP, int RowP, int RowE, int ColumnE) {
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                maze[i][j] = ' ';
//                maze[RowP][ColumnP] = 'P';
//                maze[RowE][ColumnE] = 'E';
//                maze[0][j] = '#';
//                maze[row - 1][j] = '#';
//                maze[i][0] = '#';
//                maze[i][column - 1] = '#';
//                System.out.print(maze[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void mazeGame(){
//        boolean isfinished = true;
//        while (isfinished) {
//            System.out.println("Please write direction: ");
//            String direction = sc.nextLine();
//            if (direction.equals("up")) {
//                RowP = RowP - 1;
//            } else if (direction.equals("down")) {
//                RowP = RowP + 1;
//            } else if (direction.equals("right")) {
//                ColumnP = ColumnP + 1;
//            } else if (direction.equals("left")) {
//                ColumnP = ColumnP - 1;
//            }
//            showMaze();
//
//            if (maze[RowP][ColumnP] == maze[RowE][ColumnE]) {
//                System.out.println("Congratulations! Game finished successfully");
//                isfinished = false;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Row: ");
//        int row = sc.nextInt();
//        System.out.println("Column: ");
//        int column = sc.nextInt();
//        createMaze(row, column);
//    }
//}