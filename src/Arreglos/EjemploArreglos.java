package Arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7]; //Arreglo del tipo String, creamos la instancia con new String

        //Asignamos a cada posicion un valor en String   Si no asignamos valor, por defecto el valor es null
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        //Arrays.sort es una clase helpers de java util, ordenamos los datos en orden alfabetico
        Arrays.sort(productos);

        //Asignammos variables de los elementos del arreglo
        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        //Imrpimimos el valor de los elementos del arreglo
        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " + prod3);
        System.out.println("productos[3] = " + prod4);
        System.out.println("productos[4] = " + prod5);
        System.out.println("productos[5] = " + prod6);
        System.out.println("productos[6] = " + prod7);

        int[] numeros = new int[4]; //Creamos el arreglo en forma de instancia, entre los corchetes va el numero de elementos del arreglo
        //Los valores del los elementos del arreglo estan en cero por defecto hasta que se les asignen un valor

        //Asignamos valores a los int en cada posicion, el valor debe concordar con el tipo del arreglo
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7"); //Creamos una instancia de Integer
        numeros[2] = 35;
        numeros[3] = -1;
        // numeros[4] = 5; //No se debe asignar una cantidad mayor de elementos al permitido del arreglo

        //Ordenamos los numeros
        Arrays.sort(numeros);

        //Asignamos las posiciones a los elementos del arreglo, el cual va entre corchetes
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1]; //numeros.lenght Retorna el valor del numero de elementos del arreglo 4, pero como empieza en posición cero, para que no marque error es el -1
        //int m = numeros[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
