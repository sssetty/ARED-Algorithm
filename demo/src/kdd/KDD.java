/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kdd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sadhana
 */
public class KDD {

    static String[][] inputFileMatrix = new String[179][15];
    static int[][][] newMatrix = new int[15][10][178];

    static int[] d1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38};
    static int[] d2 = {39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 1008, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125};
    static int[] d3 = {126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163};
    static int[] d4 = {164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178};

    public static void readFile(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String cvsSplitBy = ",";
            String line;
            int i = 0;
            int j = 0;
            //matrix = new String[4][];			
            while ((line = br.readLine()) != null) {
                // use comma as separator
                inputFileMatrix[i] = new String[line.split(cvsSplitBy).length];
                inputFileMatrix[i++] = line.split(cvsSplitBy);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printFile() {
        for (int i = 0; i < 178; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < inputFileMatrix[i].length; j++) {
                System.out.print(inputFileMatrix[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println(inputFileMatrix[10][10]);
    }

    public static void main(String[] args) {
        File file = new File("C:\\Program Files\\NetBeans 8.0.2\\kddfile.csv");
        readFile(file);
		//printFile();

        //System.out.println("inloop");
        for (int columnNo = 0; columnNo < 15; columnNo++) {
            int indexI = 0;
            int index0 = 0;
            int index1 = 0;
            int index2 = 0;
            int index3 = 0;
            int index4 = 0;
            int index5 = 0;
            int index6 = 0;
            int index7 = 0;
            int index8 = 0;
            int index9 = 0;
            int index10 = 0;
            newMatrix[columnNo] = new int[10][178];
            // System.out.println(columnNo);
            for (int i = 0; i < 178; i++) {

                //   System.out.println("ink");
                for (int j = 0; j < 15; j++) {
                    if (j == columnNo) {
                        //sSystem.out.println("inj");
                        if (Integer.parseInt(inputFileMatrix[i][columnNo]) == 1) {
                            newMatrix[columnNo][0][index0++] = i + 1;
                            break;
                        } else if (Integer.parseInt(inputFileMatrix[i][columnNo]) == 2) {
                            newMatrix[columnNo][1][index1++] = i + 1;
                            break;
                        } else if (Integer.parseInt(inputFileMatrix[i][columnNo]) == 3) {
                            newMatrix[columnNo][2][index2++] = i + 1;
                            break;
                        } else if (Integer.parseInt(inputFileMatrix[i][columnNo]) == 4) {
                            newMatrix[columnNo][3][index3++] = i + 1;
                            break;
                        } else if (Integer.parseInt(inputFileMatrix[i][columnNo]) == 5) {
                            newMatrix[columnNo][4][index4++] = i + 1;
                            break;
                        } else if (Integer.parseInt(inputFileMatrix[i][columnNo]) == 6) {
                            newMatrix[columnNo][5][index5++] = i + 1;
                            break;
                        } else if (Integer.parseInt(inputFileMatrix[i][columnNo]) == 7) {
                            newMatrix[columnNo][6][index6++] = i + 1;
                            break;
                        } else if (Integer.parseInt(inputFileMatrix[i][columnNo]) == 8) {
                            newMatrix[columnNo][7][index7++] = i + 1;
                            break;
                        } else if (Integer.parseInt(inputFileMatrix[i][columnNo]) == 9) {
                            newMatrix[columnNo][8][index8++] = i + 1;
                            break;
                        } else if (Integer.parseInt(inputFileMatrix[i][columnNo]) == 10) {
                            newMatrix[columnNo][9][index9++] = i + 1;
                            break;
                        }
                    }
                }
            }
        }

        float pc[][][] = new float[15][4][10];
        for (int columnNo = 0; columnNo < 15; columnNo++) {
            pc[columnNo] = new float[4][10];

            //System.out.println("\n\n*******************  " + columnNo + "  *********************");
            /*for (int i = 0; i < 10; i++) {
             // System.out.print(i + " ");
             for (int j = 0; j < 178; j++) {
             if(newMatrix[columnNo][i][j] != 0){
             System.out.print(newMatrix[columnNo][i][j] + " ");
             }
             }
             System.out.println("");
             }*/
            /*for (int i=0; i<(newMatrix[columnNo].length); i++ ) {
             for (int j=0;j<newMatrix[columnNo][i].length;j++){
             System.out.print(newMatrix[columnNo][i][j]+" ");
             }
             System.out.println();
             }*/
            //float pc[]=new flot[newMatrix[columnNo].length];
            System.out.println("\n\n************************" + columnNo + " PC d1**********************************");
            pc[columnNo][0] = new float[newMatrix[columnNo].length];
            for (int k = 0; k < newMatrix[columnNo].length; k++) {
                int count = 0;
                for (int i = 0; i < newMatrix[columnNo][k].length; i++) {
                    for (int j = 0; j < d1.length; j++) {
                        if (newMatrix[columnNo][k][i] == d1[j]) {
                            count++;

                        }
                    }
                }
                System.out.println(count);
                int length = 0;
                for (int i = 0; i < newMatrix[columnNo][k].length; i++) {
                    if (newMatrix[columnNo][k][i] != 0) {
                        length++;
                    }
                }
                if(length != 0){
                    pc[columnNo][0][k] = (float) count / length;
                }
                //System.out.format("%2d",pc[k]);
            }
            for (int q = 0; q < pc[columnNo][0].length; q++) {
                System.out.format("%3f ", pc[columnNo][0][q]);
            }

            System.out.println("\n\n************************" + columnNo + " PC d2**********************************");
            pc[columnNo][1] = new float[newMatrix[columnNo].length];
            for (int k = 0; k < newMatrix[columnNo].length; k++) {
                int count = 0;
                for (int i = 0; i < newMatrix[columnNo][k].length; i++) {
                    for (int j = 0; j < d2.length; j++) {
                        if (newMatrix[columnNo][k][i] == d2[j]) {
                            count++;
                        }
                    }
                }
                System.out.println(count);
                int length = 0;
                for (int i = 0; i < newMatrix[columnNo][k].length; i++) {
                    if (newMatrix[columnNo][k][i] != 0) {
                        length++;
                    }
                }
                if(length != 0){
                    pc[columnNo][1][k] = (float) count / length;
                }
            }
            for (int q = 0; q < pc[columnNo][1].length; q++) {
                System.out.format("%3f", pc[columnNo][1][q]);
            }

            System.out.println("\n\n************************" + columnNo + " PC d3**********************************");
            pc[columnNo][2] = new float[newMatrix[columnNo].length];
            for (int k = 0; k < newMatrix[columnNo].length; k++) {
                int count = 0;
                for (int i = 0; i < newMatrix[columnNo][k].length; i++) {
                    for (int j = 0; j < d3.length; j++) {
                        if (newMatrix[columnNo][k][i] == d3[j]) {
                            count++;
                        }
                    }
                }
                System.out.println(count);
                int length = 0;
                for (int i = 0; i < newMatrix[columnNo][k].length; i++) {
                    if (newMatrix[columnNo][k][i] != 0) {
                        length++;
                    }
                }
                if(length != 0){
                    pc[columnNo][2][k] = (float) count / length;
                }
            }
            for (int q = 0; q < pc[columnNo][2].length; q++) {
                System.out.format("%3f ", pc[columnNo][2][q]);
            }

            System.out.println("\n\n************************" + columnNo + " PC d4**********************************");
            pc[columnNo][3] = new float[newMatrix[columnNo].length];
            for (int k = 0; k < newMatrix[columnNo].length; k++) {
                int count = 0;
                for (int i = 0; i < newMatrix[columnNo][k].length; i++) {
                    for (int j = 0; j < d4.length; j++) {
                        if (newMatrix[columnNo][k][i] == d4[j]) {
                            count++;
                        }
                    }
                }
                int length = 0;
                for (int i = 0; i < newMatrix[columnNo][k].length; i++) {
                    if (newMatrix[columnNo][k][i] != 0) {
                        length++;
                    }
                }
                if(length != 0){
                pc[columnNo][3][k] = (float) count / length;
                }
            }
            for (int q = 0; q < pc[columnNo][3].length; q++) {
                System.out.format("%3f", pc[columnNo][3][q]);
            }
        }
        // System.out.print(Arrays.deepToString(p));
        //System.out.println();
        //System.out.println(p[0].length);

//calculating the support of p->d1
    /*for (int k =0; k <a.length ;k++)
         {
         int count=0;
         for(int i = 0; i <a[k].length; i++)
         {
         for(int j = 0; j <d1.length; j++)
         {
         if(a[k][i]==d1[j])
         {
         count++;
         }
         }
            
         }
         System.out.println(count);
         }
        
         System.out.println();

         }
         }
         */
        //printing of action rules threshold=0.5
        //printing pc matrix
        /*for (int columnNo = 0; columnNo < 15; columnNo++)
         {
         for(int i=0;i<4;i++)
            
         {
         for (int j = 0; j < 10; j++) 
         {
                
         System.out.print(pc[columnNo][i][j] + " ");
         System.out.println("");
         }
         }
         System.out.println("");
         }
         /*for (int i=0; i<(newMatrix[columnNo].length); i++ ) {
         for (int j=0;j<newMatrix[columnNo][i].length;j++){
         System.out.print(newMatrix[columnNo][i][j]+" ");
         }
         System.out.println();
         */
        System.out.println();
        for (int i = 0; i < 15; i++) {
            //System.out.println("Hi");
            if (i < 12) {
                for (int j = 0; j < 4; j++) {

                    //System.out.println("bye");
                    for (int k = 0; k < 10; k++) {

                        for (int l = 0; l < 10; l++) {
                            for (int q = 0; q < 3; q++) {
                                if (j < q) {
                                    if ((pc[i][j][k] * pc[i][q][l]) > 0.5) {
                                        switch (i) {
                                            case 0: {
                                                System.out.println("(DP" + (k + 1) + "-->" + "DP" + (l + 1) + ")" + "-->" + "(STATE" + (j + 1) + "-->" + "STATE" + (q + 1) + ")");
                                                break;
                                            }
                                            case 1: {

                                                System.out.println("(REF" + (k + 1) + "-->" + "REF" + (l + 1) + ")" + "-->" + "(STATE" + (j + 1) + "-->" + "STATE" + (q + 1) + ")");
                                                break;
                                            }
                                            case 2: {

                                                System.out.println("(GG" + (k + 1) + "-->" + "GG" + (l + 1) + ")" + "-->" + "(STATE" + (j + 1) + "-->" + "STATE" + (q + 1) + ")");
                                                break;
                                            }
                                            case 3: {

                                                System.out.println("(HF" + (k + 1) + "-->" + "HF" + (l + 1) + ")" + "-->" + "(STATE" + (j + 1) + "-->" + "STATE" + (q + 1) + ")");
                                                break;
                                            }
                                            case 4: {

                                                System.out.println("(UED" + (k + 1) + "-->" + "UED" + (l + 1) + ")" + "-->" + "(STATE" + (j + 1) + "-->" + "STATE" + (q + 1) + ")");
                                                break;
                                            }
                                            case 5: {

                                                System.out.println("(ECO" + (k + 1) + "-->" + "ECO" + (l + 1) + ")" + "-->" + "(STATE" + (j + 1) + "-->" + "STATE" + (q + 1) + ")");
                                                break;
                                            }
                                            case 6: {

                                                System.out.println("(SL" + (k + 1) + "-->" + "SL" + (l + 1) + ")" + "-->" + "(STATE" + (j + 1) + "-->" + "STATE" + (q + 1) + ")");

                                                break;
                                            }
                                            case 7: {

                                                System.out.println("(PS" + (k + 1) + "-->" + "PS" + (l + 1) + ")" + "-->" + "(STATE" + (j + 1) + "-->" + "STATE" + (q + 1) + ")");
                                                break;
                                            }
                                            case 8: {

                                                System.out.println("(HR" + (k + 1) + "-->" + "HR" + (l + 1) + ")" + "-->" + "(STATE" + (j + 1) + "-->" + "STATE" + (q + 1) + ")");
                                                break;
                                            }
                                            case 9: {

                                                System.out.println("(SEC" + (k + 1) + "-->" + "SEC" + (l + 1) + ")" + "-->" + "(STATE" + (j + 1) + "-->" + "STATE" + (q + 1) + ")");
                                                break;
                                            }
                                            case 10: {

                                                System.out.println("(FE" + (k + 1) + "-->" + "FE" + (l + 1) + ")" + "-->" + "(STATE" + (j + 1) + "-->" + "STATE" + (q + 1) + ")");
                                                break;
                                            }
                                            case 11: {

                                                System.out.println("(EXD" + (k + 1) + "-->" + "EXD" + (l + 1) + ")" + "-->" + "(STATE" + (j + 1) + "-->" + "STATE" + (q + 1) + ")");
                                                break;
                                            }
                                            default: {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            } else if (i > 12) {
               
                for (int j = 0; j < 4; j++) {
            //System.out.println("bye");
                    for (int q = 0; q < 4; q++) {
                        if (j < q) {
                             
                            for (int k = 0; k < 10; k++) {
                                //System.out.println("Here");
                                if ((pc[i][j][k] * pc[i][q][k]) > 0.1) {
                                    //System.out.println("Here........");
                                    switch (i) {
                                        case 13: {
                                            System.out.println("(POPULATION" + (k + 1) + "-->" + "POPULATION" + (k + 1) + ")" + "-->" + "(STATE" + (j + 1) + "-->" + "STATE" + (q + 1) + ")");
                                            break;
                                        }
                                        case 14: {

                                            System.out.println("(LANDAREA" + (k + 1) + "-->" + "LANDAREA" + (k + 1) + ")" + "-->" + "(STATE" + (j + 1) + "-->" + "STATE" + (q + 1) + ")");
                                            break;
                                        }
                                        default: {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }
}
