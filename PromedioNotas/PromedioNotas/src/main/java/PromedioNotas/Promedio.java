/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PromedioNotas;

import java.util.Scanner;

/**
 *
 * @author visitante
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        //Declaracion del Vector Prome
        int [] prome;
        prome= new int[20];
        //Declaración subindice de recorrido del vector Prome (contador)
        int i;
        //Declaración de la variable que contendrá el promedio de notas (acumulador)
        float total=0;
        //Recorrido del vector para la asignación de calificaciones o notas
        for(i=0;i<20;++i)
        {
            System.out.print("ingrese calificacion del alumno en la posición ["+i+"]: ");
            prome[i]=teclado.nextInt();
            total=total+prome[i];
        }
        //Despliegue del promedio de notas o calificaciones
        System.out.println("La suma de las notas es: "+total);
        total= total/20;
        System.out.println("promedio general es: "+total);
        //Despliegue de las notas desde el ultimo alumno ingresado hasta el primero
        for(i=19;i>=0;--i)
            System.out.println("alumno "+i+" su promedio es: "+prome[i]);  
    }        
        
}
