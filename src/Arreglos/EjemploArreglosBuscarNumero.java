package Arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {

        int[] a = new int[10]; //Arreglo de numeros enteros

        Scanner s = new Scanner(System.in); //Clase scanner para ingresar datos al sistema

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt(); //Capturamos los datos ingresados en a
        }

        System.out.println("\r\nIngrese un número a buscar:");
        int num = s.nextInt(); //Capturamos el numero ingresado en num
        int i = 0;
        for(; i < a.length && a[i] != num; i++){} //El primer valor se deja vacio con el ; porque ya esta inicializado en una linea anterior
        //i inicia en 0; mientras i sea menor al largo del arreglo Y el valor sea diferente de num, cuando num es igual, sale del FOR

        if(i == a.length){ //Si i es igual a la longitud del arreglo, el numero no estaba en el arreglo
            System.out.println("Número no encontrado");
        } else if(a[i] == num){ //Si el valor en la iteracion es igual a la variable num, entonces el numero se encontró en el arreglo
            System.out.println("Encontrado en la posición: " + i);
        }
    }
}
