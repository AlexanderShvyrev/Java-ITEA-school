package Homework.OOP;

import java.util.Arrays;
import java.util.Objects;

public class Matrix {
    public double[][] myArray;
    public int rows;
    public int cols;

    public Matrix(double[][] myArray, int rows, int cols) {
        this.myArray = myArray;
        this.rows = rows;
        this.cols = cols;
    }

    public double[][] add(double[][] data){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                myArray[i][j] += data[i][j];
            }
        }
        return myArray;
    }

    public double[][] multiply(double num) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                myArray[i][j] *= num;
            }
        }
        return myArray;
    }

    public void displayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public double[][] multiply(double[][] array){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                myArray[i][j] *= array[i][j];
            }
        }
        return myArray;
    }
    @Override
    public String toString() {
        return "Array: " + Arrays.deepToString(myArray) + ", Rows: " + rows + ", Cols: " + cols;
    }
    public static void main(String[] args) {
        Matrix matrix = new Matrix(new double[][]{{32,45,65}, {234,456,78}},2,3);
        System.out.println(matrix);
        matrix.myArray = matrix.add(new double[][]{{23,523,564,}, {235,457,58}});
        System.out.println("Adding new array to initial matrix...");
        matrix.displayMatrix();
        matrix.myArray = matrix.multiply(3.5);
        System.out.println("Multiplying matrix by a number provided...");
        matrix.displayMatrix();
        matrix.myArray = matrix.multiply(new double[][]{{2,2,2}, {2,2,2}});
        System.out.println("Multiplying matrix by another matrix...");
        matrix.displayMatrix();
    }
}
