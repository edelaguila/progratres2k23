/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoMatricesDinamicas;

import java.util.Scanner;

/**
 *
 * @author visitante
 */
public class matricesdinamicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el numero de columnas deseada: ");
        int numeroColumnas = entrada.nextInt();
        int miMatriz[][] = new int[3][numeroColumnas];
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz.length; j++) {
                miMatriz[i][j] = 0;                
            }
        }
        System.out.println("Matriz Inicializada");
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[0].length; j++) {
                miMatriz[i][j] = generaNumerosAleatorios(0,9);                
                System.out.println(miMatriz[i][j] + " ");
            }
        }
    }
    public static int generaNumerosAleatorios( int minimo, int maximo)
    {
        return (int)Math.floor(Math.random()* ( minimo - ( maximo + 1))+( maximo + 1));
    }
}
