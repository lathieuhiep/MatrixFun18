package neos.com.main;

import neos.com.matrixfun.MatrixFun;

public class Main {
    public static void main(String[] args) {
        MatrixFun matrixFun = new MatrixFun(8);

        matrixFun.init();
        System.out.println();

        matrixFun.printMatrix();
        System.out.println();

        matrixFun.convertRowToInt();
        System.out.println();

        matrixFun.findBestColumn();
    }
}