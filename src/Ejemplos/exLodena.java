package Ejemplos;

import java.util.Arrays;
import java.util.Random;

public class exLodena {
    public static void main(String[] args) {
        //Escribir un programa que cree de manera aleatoria 10 números entero
        //entre 1-100 almacenándolos en un vector y luego los imprima en orden
        //inverso al de entrada.
        //OJO! --> LOS NÚMEROS NO SE PUEDEN REPETIR
        int[] matriz= new int[10];
        generar(matriz);

        imprimir(matriz);

    }

    private static void imprimir(int[] matriz) {
        for(int i=matriz.length-1;i>0;i--) {
            System.out.print(matriz[i]+" ");
        }
    }

    private static void generar(int[] matriz) {
        Random r=new Random();
        // Recorremos el array de delante a atrás pq sort deja los ceros al principio
        for(int x=9;x>=0;x--) {
            int num=r.nextInt(1, 11);
            // Ordenamos el array antes del binarysearch
            Arrays.sort(matriz);
            while (Arrays.binarySearch(matriz, num)>=0) {
                num=r.nextInt(1, 11);
            }
            matriz[x]=num;
        }
    }

}
