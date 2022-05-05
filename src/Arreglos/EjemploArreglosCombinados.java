package Arreglos;

public class EjemploArreglosCombinados {

    public static void main(String[] args) {

        int[] a, b, c;
        a = new int[12]; //Arreglo a contiene 12 elementos
        b = new int[12]; //Arreglo b contiene 12 elementos
        c = new int[24]; //Arreglo c contendra los 12 elementos de a y los 12 elementos de b

        for (int i = 0; i < a.length; i++) {  //i empieza en 0; mientras i sea menor al largo del arreglo a; i incrementa en 1
            a[i] = i + 1; //el valor de i toma el valor de la posicion + 1
        }

        for (int i = 0; i < b.length; i++) {  //i empieza en 0; mientras i sea menor al largo del arreglo; i incrementa en 1
            b[i] = (i + 1) * 5; //el valor de i toma el valor de la posicion + 1 y despues el resultado lo multiplica por 5
        }

        int aux = 0;
        for (int i = 0; i < b.length; i+=3) { //i empieza en 0; mientras i sea menor al largo del arreglo b; i incrementa en 3
            //i itera, realiza las 3 iteraciones del primer for de j, despues hace las 3 iteraciones del segundo for de j
            //aumenta i en 3, porque se asignan 3 valores de a y 3 valores de b
            for(int j = 0; j < 3; j++) { //j empieza en 0; mientras j sea menor que 3; j incrementa en 1
                c[aux++] = a[i+j]; //almacena en c el valor de a
            }
            for(int j = 0; j < 3; j++) { //j empieza en 0; mientras j sea menor que 3; j incrementa en 1
                c[aux++] = b[i+j]; //almacena en c el valor de b
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(i + ": " + c[i]);
        }
    }
}
