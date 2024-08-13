package neos.com.matrixfun;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixFun {
    private int[][] matrix;

    public MatrixFun(int size) {
        matrix = new int[size][size];
    }

    // nhập dữ liệu ma trận
    public void init() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập các phần tử cho ma trận:");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                while (true) {
//                    try {
//                        System.out.print("Phần tử tại vị trí [" + i + "]" + "[" + j + "]: ");
//                        String input = scanner.nextLine();
//
//                        if ( !input.matches("\\d+") ) {
//                            throw new NumberFormatException("Phần tử phải là một số nguyên.");
//                        }
//
//                        int value = Integer.parseInt(input);
//
//                        if (value != 0 && value != 1) {
//                            throw new IllegalAccessException("Phần tử nhập phải là 0 hoặc 1.");
//                        }
//
//                        matrix[i][j] = value;
//
//                        break;
//                    } catch (IllegalAccessException | NumberFormatException e) {
//                        System.out.println("Lỗi nhập liệu: " + e.getMessage() + " Vui lòng nhập lại phần tử tại vị trí [" + i + "]" + "[" + j + "]");
//                    }
//                }
//            }
//        }
//
//        scanner.close();

        matrix = new int [][] {
                {1, 0, 1, 0, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 0, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 1, 1, 1, 0, 1},
                {1, 1, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 1, 1, 1, 1}
        };
    }

    // in ma trận
    public void printMatrix() {
        System.out.println("Ma trận:");

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];

            System.out.println( Arrays.toString(row) );
        }
    }

    // in giá trị số nguyên từ chuỗi nhị phân của từng hàng
    public void convertRowToInt() {
        System.out.println("Giá trị số nguyên từ chuỗi nhị phân của từng hàng");

        for (int i = 0; i < matrix.length; i++) {
            int rowToInt = 0;

            System.out.print("Hàng thứ " + (i+1) + ": ");

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                rowToInt += (int) (matrix[i][j] * Math.pow(2, matrix[i].length - 1 -j ));
            }

            System.out.print(" -> " + rowToInt);
            System.out.println();
        }
    }

    // tìm và in ra cột nào có tổng lớn nhất (loại trừ các phần tử trên đường chéo)
    public void findBestColumn() {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[] columnSums = new int[numCols];

        System.out.println("Tổng giá trị từng cột (loại trừ các phần tử trên đường chéo)");

        for (int j = 0; j < numCols; j++) {
            int sum = 0;
            int stt = 1;

            System.out.print("Cột thứ " + (j+1) + ": ");

            for (int i = 0; i < numRows; i++) {
                if (i != j) {
                    if ( stt > 1 ) {
                        System.out.print(" + ");
                    }

                    System.out.print( matrix[i][j]);

                    sum += matrix[i][j];
                    stt++;
                }
            }
            
            columnSums[j] = sum;
            System.out.println(" = " + sum);
        }

        findMax(columnSums);
    }

    public void findMax(int[] arrInt) {
        int max = arrInt[0];
        int index = 0;

        for (int i = 0; i < arrInt.length; i++) {
            if ( arrInt[i] > max ) {
                max = arrInt[i];
                index = i;
            }
        }

        System.out.println("=> Cột " + (index + 1) + " có tổng lớn nhất là " + max);
    }
}
