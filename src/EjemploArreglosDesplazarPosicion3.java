import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {

        int[] a = new int[7]; //Arreglo de numeros enteros
        int numero, posicion;

        Scanner s = new Scanner(System.in); //Clase scanner para introducir valores al sistema

        for(int i = 0; i < a.length - 1; i++){ //Capturamos los valores hasta la posicion 6, la posicion 7 queda vacia, su valor por defecto es 0
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt(); //Capturamos los numeros ingresados en a
        }
        System.out.println();

        System.out.println("Ingrese un número a insertar:");
        numero = s.nextInt(); //Capturamos un numero nuevo a insertar en numero

        posicion = 0; //Variable de control
        while(posicion < 6 && numero > a[posicion]){ //Mientras la posicion sea menor que 6 Y mientras numero sea mayor a algun valor
            posicion++; //Incrementamos la posicion
        }

        //Desplazamos los elementos
        for(int i = a.length - 2; i >= posicion; i--){ //i parte desde el penultimo valor; mientras que i sea mayor o igual a la variable posicion; i decreementa en 1
            a[i+1] = a[i];//El valor actual se lo damos a la posicion a[i+1]  El for arranca en la posición 6, entonces el valor 7 que esta
            // en la posición 6 lo pasamos a la posición 7
        }

        a[posicion] = numero; //En la posicion encontrada asignamos el numero

        System.out.println("El nuevo arreglo ordenado:");
        for(int i = 0; i < a.length; i++){
            System.out.println(i + " => " + a[i]); //Imprimimos el arreglo
        }

    }
}
