package neos.com.main;

import neos.com.matrixfun.MatrixFun;

public class Main {
    public static void main(String[] args) {
        MatrixFun matrixFun = new MatrixFun(8);

        matrixFun.init();
        matrixFun.printMatrix();
        matrixFun.convertRowToInt();
        matrixFun.findBestColumn();
    }
}