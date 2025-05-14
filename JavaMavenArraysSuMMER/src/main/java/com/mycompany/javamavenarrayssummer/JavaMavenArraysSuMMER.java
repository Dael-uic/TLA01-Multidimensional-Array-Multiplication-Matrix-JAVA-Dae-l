/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javamavenarrayssummer;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaMavenArraysSuMMER {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        int[][] matrix = new int[10][10];
        //int row = 1;
        //int column = 1;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                matrix[i][j] = (i + 1) * (j + 1);
            }
        };
        /*
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
        matrix[0][4] = 5;
        matrix[0][5] = 6;
        matrix[0][6] = 7;
        matrix[0][7] = 8;
        matrix[0][8] = 9;
        matrix[0][9] = 10;
        // 2nd row
        matrix[1][0] = 2;
        matrix[1][1] = 4;
        matrix[1][2] = 6;
        matrix[1][3] = 8;
        matrix[1][4] = 10;
        matrix[1][5] = 12;
        matrix[1][6] = 14;
        matrix[1][7] = 16;
        matrix[1][8] = 18;
        matrix[1][9] = 20;
        */
        System.out.println("\n\n@-------------------------Multiplication-Table-------------------------@");
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.print(matrix[x][y] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("@----------------------------------------------------------------------@\n\n");
    }
}

