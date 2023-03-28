package lesson23;

import java.util.Scanner;

public class YaMatrix {

    public static void main(String[] args) {

    }

    static int[][] inputMatrix(final Scanner scanner) {
        System.out.println("Введите количество строк матрицы:");
        final var rows = scanner.nextInt();
        System.out.println("Введите количество столбцов матрицы:");
        final var cols = scanner.nextInt();
        final var matrixA = new int[rows][cols];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        return matrixA;
    }

    static int[][] multiply(final int[][] matrixA, final int[][] matrixB) {
        if (matrixA[0].length != matrixB[0].length) {
            System.err.println("Эти матрицы нельзя переаножить");
            return null;
        }
        final var matrixM = new int[matrixA.length][matrixB[0].length];
        for (int i = 0; i < matrixM.length; i++) {
            for (int j = 0; j < matrixM[0].length; j++) {
                matrixM[i][j] = 0;
                for (int k = 0; k < 10; k++) {
                    matrixM[i][j] = matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return matrixM;
    }

    private static int max_len(final int[][] m) {

    }

}
