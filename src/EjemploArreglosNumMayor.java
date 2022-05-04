import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {

        int[] a = new int[5]; //Arreglo de 5 numeros enteros
        Scanner s = new Scanner(System.in); //Clase Scanner para poder ingresar numeros

        System.out.println("Ingrese 5 enteros:");
        for(int i = 0; i<a.length; i++){ //i empieza en 0; mientras i sea menor al largo del arreglo a; i incrementa en 1
            a[i] = s.nextInt(); //Almacena en a los valores ingresados
        }

        int max = 0; //Variable que guarda el índice del numero mayor
        for(int i = 1; i < a.length; i++){ //i empieza en 1; mientras i sea menor al largo del arreglo a; i incrementa en 1
            max = (a[max] > a[i])? max: i; //Operador ternario, pregunta si el indice mayor que el siguiente entonces retorna max, de lo contrario es i
        }
        System.out.println("max = " + a[max]); //Imprime el numero mayor
    }
}
