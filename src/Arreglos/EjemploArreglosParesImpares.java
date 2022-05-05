package Arreglos;

import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int[] a, pares, impares; //Arreglo a, pares e impares
        int totalPares = 0, totalImpares = 0; //Pares e impares parten en 0
        a = new int[10];
        Scanner s = new Scanner(System.in); //Scanner para ingresar datos en el sistema

        System.out.println("Ingrese 10 números:");

        //Llenamos el arreglo con los datos
        for(int i = 0; i < a.length; i++){ //i empieza en 0; mientras i sea menor al largo del arreglo a; i incrementa en 1
            a[i] = s.nextInt(); //Almacena en a los valores ingresados
        }

        for(int i = 0; i < a.length;i++){ //i empieza en 0; mientras i sea menor al largo del arreglo a; i incrementa en 1

            if(a[i]%2 == 0){ //El valor de a se divide entre dos y Si el modulo o resto es igual a 0
                totalPares++; //Incrementamos pares
            } else { //Si el resto o modulo es diferente de 0
                totalImpares++; //Incrementamos impares
            }
        }
        pares = new int[totalPares]; //Arreglo de numero de pares
        impares = new int[totalImpares]; //Arreglo de numeros impares

        int j = 0; //Variable de control para pares
        int k = 0; //Variable de control para impares
        for(int i = 0; i < a.length; i++){ //i empieza en 0; mientras i sea menor al largo del arreglo a; i incrementa en 1
            if(a[i] % 2 == 0){ //El valor de a se divide entre dos y Si el modulo o resto es igual a 0
                pares[j++] = a[i]; //Incrementamos pares asignandole el valor de a
            } else { //Si el resto o modulo es diferente de 0
                impares[k++] = a[i]; //Incrementamos impares asignandole el valor de a
            }
        }

        System.out.println("Pares");
        for(int i = 0; i < pares.length; i++){ //i empieza en 0; mientras i sea menor al largo del arreglo a; i incrementa en 1
            System.out.print(pares[i] + " ");
        }

        System.out.println("\r\nImpares");
        for(int i = 0; i < impares.length; i++){ //i empieza en 0; mientras i sea menor al largo del arreglo a; i incrementa en 1
            System.out.print(impares[i] + " ");
        }
        System.out.println();
        
    }
}
