package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3b {
    public static void main(String[] args) {

        int[] a = new int[7]; //Arreglo de numeros enteros
        int numero, posicion, ultimo; //Definimos las variables

        Scanner s = new Scanner(System.in); //Clase scanner para introducir valores al sistema

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt(); //Capturamos los numeros ingresados en a
        }
        System.out.println();

        System.out.println("Ingrese un número a insertar:");
        numero = s.nextInt(); //Capturamos un numero nuevo a insertar en numero

        ultimo = a[a.length - 1]; //Ultimo tiene el valor del arreglo a con el indice a.lenght-1 //Respaldamos ultimop antes de modificar

        posicion = 0; //Variable de control

        while(posicion < 6 && numero > a[posicion]){ //Mientras la posicion sea menor que 6 Y mientras numero sea mayor a algun valor
            posicion++; //Incrementamos la posicion
        }

        for(int i = a.length - 2; i >= posicion; i--){ //i parte desde el penultimo valor; mientras que i sea mayor o igual a la variable posicion; i decreementa en 1
            a[i+1] = a[i];//El valor actual a[i] se lo damos a la posicion a[i+1]  El for arranca en la posición 6, entonces el valor 7 que esta
            // en la posición 6 lo pasamos a la posición 7
        }

        int[] b = new int[a.length + 1]; //Creamos un nuevo arreglo con la cantidad del largo de a mas 1
        System.arraycopy(a, 0, b, 0, a.length); //Clase System para copiar el arreglo System.arraycopy
        //origen a, parte desde 0, destino b, parte desde 0, tamaño del arreeglo b.length el cual corresponde a a.lenght

        if(numero > ultimo){ //Si numero es mayor que ultimo dejamos a numero
            b[b.length - 1] = numero; //Nuevo arreglo b, se le pasa a la ultima posicion b.lenght-1 el valor de numero
        } else { //Si numero no es mayor que ultimo //Dejamos a ultimo en la ultima posicion
            b[b.length - 1] = ultimo; //Nuevo arreglo b, se le pasa a la ultima posicion b.lenght-1 el valor de ultimo
            b[posicion] = numero; //Dejamos a numero en la posicion indicada
        }
        System.out.println("El nuevo arreglo ordenado:");
        for(int i = 0; i < b.length; i++){ //Recorremos el arreglo b
            System.out.println(i + " => " + b[i]);
        }

    }
}
