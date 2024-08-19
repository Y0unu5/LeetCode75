package com.programs;

public class ExpandStrings {
    public static String expand(String input){
        StringBuilder result=new StringBuilder();
        char currentChar= '\0';
        int number = 0;
        boolean buildingNumber = false;
        for (int i=0; i< input.length(); i++){
            char ch= input.charAt(i);
            if (Character.isLetter(ch)){
                if (buildingNumber){
                    result.append(String.valueOf(currentChar).repeat(Math.max(0, number)));
                }
                currentChar=ch;
                number = 0;
                buildingNumber = false;
            }else if (Character.isDigit(ch)){
                number = number * 10 + (ch - '0');
                buildingNumber = true;
            }
        }

        if (buildingNumber) {
            result.append(String.valueOf(currentChar).repeat(Math.max(0, number)));
        }

        return result.toString();
    }

    public static void printPattern(int n) {
        int[][] matrix = new int[n][n];
        int value = 1;

        // Fill the matrix in the desired pattern
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col + row < n) {
                    matrix[row][col] = value++;
                }
            }
        }

        // Print the matrix in the required format
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] != 0) {
                    System.out.print(matrix[row][col] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String input1 = "a1b10";
        String input2 = "b3c6d15";
        int n=7;
        printPattern(n);
        System.out.println(expand(input1));
        System.out.println(expand(input2));
    }
}
