package Matrices;

public class EjemploMatricesColumnasVariable {
    public static void main(String[] args) {

        int[][] matriz = new int[3][]; //Definimos la matriz de numeros enteros con int[][], creamos la instancia
        //new int[][], la matriz tendra un tamaño de 2 filas con columnas variables [3][]

        matriz[0] = new int[2]; //Especificamos que la fila 0 contendra 2 columnas
        matriz[1] = new int[3]; //Especificamos que la fila 0 contendra 3 columnas
        matriz[2] = new int[4]; //Especificamos que la fila 0 contendra 4 columnas

        System.out.println("matriz length: " + matriz.length); //Imprimimos el largo de la matriz, el numero de filas que contiene la matriz
        System.out.println("fila 0 length: " + matriz[0].length); //Imprimimos el largo de la fila 0
        System.out.println("fila 1 length: " + matriz[1].length); //Imprimimos el largo de la fila 1
        System.out.println("fila 2 length: " + matriz[2].length); //Imprimimos el largo de la fila 2

        for(int i = 0; i < matriz.length; i++){ //Recorremos las filas de la matriz
            // i empieza en 0; mientras i sea menor que el largo de las filas; i incrementa en 1

            for(int j = 0; j < matriz[i].length; j++){ //Recorremos las columnas de la matriz
                // j empieza en 0; mientras j sea menor que el largo de las columnas; j incrementa en 1

                matriz[i][j] = i*j; //Asignamos a cada elemento la multiplicacion de i por j
            }
        }

        for(int i = 0; i < matriz.length; i++){ //Recorremos las filas de la matriz
            // i empieza en 0; mientras i sea menor que el largo de las filas; i incrementa en 1

            for(int j = 0; j < matriz[i].length; j++){//Recorremos las columnas de la matriz
                // j empieza en 0; mientras j sea menor que el largo de las columnas; j incrementa en 1

                System.out.print(matriz[i][j] + "\t"); //Imprimimos filas y columnas, siendo fila 0 con 2 elementos
                //siendo fila 1 con 3 elementos, siendo fila 2 con 4 elementos
            }
            System.out.println();
        }
    }
}
