package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {

        int[] a = new int[10]; //Arreglo de numeros enteros
        int ultimo; //Declaramos la variable ultimo
        Scanner s = new Scanner(System.in); //Clase scanner para introducir valores al sistema

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese el número:");
            a[i] = s.nextInt(); //Capturamos los numeros ingresados en a
        }
        System.out.println();
        ultimo = a[a.length-1]; //Le asignamos a la variable el valor del ultimo elemento del arreglo
        for(int i = a.length -2; i >= 0; i--){ //i parte desde el penultimo valor; mientras que i sea mayor o igual a cero; i decrementa en 1
            a[i+1] = a[i]; //El valor actual se lo damos a la posicion a[i+1]  El for arranca en la posición 8, entonces el valor 9 que esta
            // en la posición 8 lo pasamos a la posición 9
        }
        a[0] = ultimo; //A la posición 0 le asignamos el valor de la variable ultimo que teniamos guardada

        System.out.println("El arreglo:");
        for(int i = 0; i < a.length; i++){ //Arreglo para imprimir los valores
            System.out.println(a[i]);
        }

    }
}
