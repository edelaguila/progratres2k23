/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoMatrices;

import java.util.Scanner;

/**
 *
 * @author visitante
 */
public class matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int miMatriz[][] = new int[3][3];
        for (int i = 0; i < miMatriz.length; i++) {
            for ( int j = 0; j < miMatriz.length; j++){
                miMatriz[i][j] = 0;
                System.out.println(String.format("matriz posición:  %d, %d, %d ", i, j, miMatriz[i][j]));
            }
        }
        System.out.println("Matriz Inicializada");
        Scanner entrada = new Scanner(System.in);

        float sumaFila = 0;
        System.out.println("Uso de matrices");
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz.length; j++) {
                System.out.println("Ingrese el numero en la fila " + (i)
                        + " columna " + j + " :");
                miMatriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Analisis de los datos ingresados en la matriz");
        for (int i = 0; i < miMatriz.length; i++) {
            sumaFila = 0;
            for (int j = 0; j < miMatriz[i].length; j++) {
                sumaFila += miMatriz[i][j];
                System.out.println(String.format(" %d ", miMatriz[i][j]));
            }
            System.out.println(String.format(" Suma fila: %f, promedio fila: %f ", sumaFila, sumaFila / miMatriz.length));
            System.out.println();
        }      
    }
    
}
