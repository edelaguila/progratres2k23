/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoVectores;

import java.util.Scanner;

/**
 *
 * @author visitante
 */
public class vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        // Definición de variables
        float promedioDatos = 0;
        float sumaDatos = 0;
        int numeroMayor = 0;
        int numeroMenor = 0;
        int[] miVector = new int[5];
        // Inicializamos el vector
        for (int i = 0; i < miVector.length; i++) {
            miVector[i] = 0;
        }
        System.out.println("Vector inicializado");
        // Ingreso de datos del usuario
        for (int i = 0; i < miVector.length; i++) {
            System.out.println("Ingrese el numero en la posicion " + (i) + ":" );
            miVector[i] = entradaDatos.nextInt();
        } 
        // Calcular los totales para el promedio e identificación del mayor y el menor
        for (int i = 0; i < miVector.length; i++) {
            sumaDatos += miVector[i];
            if (numeroMayor < miVector[i]) {
                numeroMayor = miVector[i];
            }
            System.out.println(String.format("Posicion [%d] Elemento: %d", i, miVector[i]));
        }         
        numeroMenor = numeroMayor;
        for (int i = 0; i < miVector.length; i++) {
  
            if (numeroMenor > miVector[i]) {
                numeroMenor = miVector[i];
            }
            //System.out.println(String.format("Posicion [%d] Elemento: %d", i, miVector[i]));
        }                 
        promedioDatos = sumaDatos / miVector.length;
        System.out.println("Resultados analisis del vector");
        int contadorDatos;
        for (int i = 0; i < miVector.length; i++) {
            contadorDatos=0;
            for (int j = i; j < miVector.length; j++) {
                if ( miVector[i] == miVector[j]){
                    contadorDatos++;
                }
            }
            System.out.println(String.format("El numero %d se repite %d veces", miVector[i], contadorDatos));
            System.out.println(String.format("La suma de los datos es %.2f, el promedio de los datos es %.2f, el numero mayor es %d, el menor es %d", sumaDatos, promedioDatos, numeroMayor, numeroMenor));
        }                         
        // TODO code application logic here
    }
    
}
