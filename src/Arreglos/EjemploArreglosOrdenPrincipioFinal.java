package Arreglos;

public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10]; //Arreglo de 10 numeros enteros
        int[] a = new int[10]; //Arreglo de 10 numeros enteros

        for (int i = 0; i < numeros.length; i++) { //i inicia en 0; mientras que i sea menor que el largo del arreglo; i incrementa en 1
            numeros[i] = i + 1; //Llenamos el arreglo con el valor de la iteracion, pero le sumamos 1 para que el primer valor sea 1
        }

        int aux = 0; //Variable auxiliar
        for (int i = 0; i < numeros.length - i; i++) { //i inicia en 0; mientras que i sea menor que el largo del arreglo menos i; i incrementa en 1
            //Con numeros.length-i hace un recorrido en 0 y a la vez resta la posicion 9, por lo tanto, solo hará un recorrido hasta la mitad del arreglo
            a[aux++] = numeros[i]; //LLena la primera posición con el primer valor, llena 0. Incrementa la posición con el aux++
            a[aux++] = numeros[numeros.length - 1 - i]; //Llena la segunda posicion con el ultimo valor y decrementa i. Incrementa la posicion con el aux++
            //System.out.print(numeros[i] + " ");
            //System.out.println(numeros[numeros.length - 1 - i]);
        }

        for (int i = 0; i < a.length; i++) { //Recorremos el arreglo para imprimir los valores
            System.out.println("i = " + i + " valor: " + a[i]);
        }

    }
}
