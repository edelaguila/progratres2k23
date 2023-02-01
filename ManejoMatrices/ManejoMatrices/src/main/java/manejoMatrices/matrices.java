/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoMatrices;

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
    }
    
}
