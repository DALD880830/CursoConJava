import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {

        int[] a = new int[7]; //Arreglo de 7 elementos

        Scanner s = new Scanner(System.in); //Scanner para ingresar datos en el sistema
        System.out.println("Ingrese 7 números:");
        for(int i = 0; i<a.length; i++){ //i empieza en 0; mientras i sea menor al largo del arreglo a; i incrementa en 1
            a[i] = s.nextInt(); //Almacena en a los valores ingresados
        }
        boolean ascendente = false; //Bandera boolean para marcar si es ascendente
        boolean descendente = false; //Bandera boolean para marcar si es descendente
        for(int i = 0; i < a.length - 1; i++){ //i empieza en 0; mientras i sea menor al largo del arreglo a -1; i incrementa en 1

            if(a[i] > a[i+1]){ //Si a[i] es mayor al siguiente elemento
                descendente = true; //Guardamos en la bandera descendente
            }

            if(a[i] < a[i+1]){ //Si a[i] es menor al siguiente elemento
                ascendente = true; //Guardamos en la bandera ascendente
            }
        }

        if(ascendente == true && descendente == true){ //Si ascendente y descendente son true
            System.out.println("Arreglo = desordenado");
        }

        if(ascendente == false && descendente == false){ //Si ascendente y descendente son false
            System.out.println("Arreglo = todos son iguales");
        }

        if(ascendente == true && descendente == false){ //Si ascendente es true y descendente es false
            System.out.println("Arreglo = ordenado de forma ascendente");
        }

        if(ascendente == false && descendente == true){ //Si ascendente es false y descendente es true
            System.out.println("Arreglo = ordenado de forma descendente");
        }
    }
}
