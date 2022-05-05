package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        int[] a = new int[10]; //Arreglo de numeros enteros
        int elemento, posicion; //Definimos las variables
        Scanner s = new Scanner(System.in); //Clase scanner para introducir valores al sistema

        for(int i = 0; i < a.length-1; i++){ //Capturamos los valores hasta la posicion 8, la posicion 9 queda vacia, su valor por defecto es 0
            System.out.print("Ingrese el número:");
            a[i] = s.nextInt(); //Capturamos los numeros ingresados en a
        }
        System.out.println();

        System.out.println("Nuevo elemento:");
        elemento = s.nextInt(); //Pedimos y capturamos el valor del nuevo elemento

        System.out.println("Posición donde agregar (de 0 a 9)");
        posicion = s.nextInt(); //Pedimos y capturamos la posicion del nuevo elemento

        for(int i = a.length -2; i >= posicion; i--){ //i parte desde el penultimo valor; mientras que i sea mayor o igual a la variable posicion; i decrementa en 1
            a[i+1] = a[i];//El valor actual se lo damos a la posicion a[i+1]  El for arranca en la posición 8, entonces el valor 9 que esta
            // en la posición 8 lo pasamos a la posición 9
        }
        a[posicion] = elemento; //Insertamos el elemento en la posicion que indico el usuario

        System.out.println("El arreglo:");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]); //Imprimimos el arreglo
        }

    }
}
