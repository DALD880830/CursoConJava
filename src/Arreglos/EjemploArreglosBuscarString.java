package Arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {

        String[] a = new String[4]; //Arreglo de String

        Scanner s = new Scanner(System.in); //Clase scanner para ingresar datos al sistema

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un nombre: ");
            a[i] = s.next(); //Capturamos los datos ingresados en a
        }

        System.out.println("\r\nIngrese un nombre a buscar:");
        String nombre = s.next(); //Capturamos el String en nombrem
        int i = 0;
        for(; i < a.length && !a[i].equalsIgnoreCase(nombre); i++){}  //El primer valor se deja vacio con el ; porque ya esta inicializado en una linea anterior
        //i inicia en 0; mientras i sea menor al largo del arreglo Y el valor sea diferente de nombre, cuando nombre es igual, sale del FOR

        if(i == a.length){ //Si i es igual a la longitud del arreglo, el String no estaba en el arreglo
            System.out.println("Número no encontrado");
        } else if(a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0){ //Si el valor en la iteracion es igual a la variable nombre, entonces el String se encontró en el arreglo
            System.out.println("Encontrado en la posición: " + i);
        }
    }
}
