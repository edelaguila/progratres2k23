/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoMatricesMultiplicacion;

import java.util.Scanner;

/**
 *
 * @author visitante
 */
public class matricesMultiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el tamaño de la matriz: ");
        int tamanio = entrada.nextInt();
        int miMatriz[][] = new int[tamanio][tamanio];
        int miMatriz2[][] = new int[tamanio][tamanio];
        int miMatriz3[][] = new int[tamanio][tamanio];
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz.length; j++) {
                miMatriz[i][j] = 0;      
                miMatriz2[i][j] = 0;
                miMatriz3[i][j] = 0;
            }
        }
        System.out.println("Matriz Inicializada");
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[0].length; j++) 
            {
                miMatriz[i][j] = generaNumerosAleatorios(0,25);
                miMatriz2[i][j] = generaNumerosAleatorios(0,25);
                miMatriz3[i][j] = miMatriz[i][j] * miMatriz2[i][j];
       
            }
        }        
        System.out.println("Matriz 1");
        muestraMatriz(miMatriz);
        System.out.println("Matriz 2");
        muestraMatriz(miMatriz2);        
        System.out.println("Matriz Resultado");
        muestraMatriz(miMatriz3);                
    }
    public static void muestraMatriz(int[][] matriz)
    {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println(matriz[i][j] + " ");            }
        }        
        System.out.println(" ");
    }
    public static int generaNumerosAleatorios( int minimo, int maximo)
    {
        return (int)Math.floor(Math.random()* ( minimo - ( maximo + 1))+( maximo + 1));
    }        
    
    
}
