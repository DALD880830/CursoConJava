package Matrices;

public class EjemploMatricesIdentidad {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5]; //Creamos una matriz con 5 filas y 5 columnas
        // por default, los valores de la matriz estan en 0

        for(int i = 0; i < matriz.length;i++){ //Recorremos las filas de la matriz
            // i empieza en 0; mientras i sea menor que el largo de las filas; i incrementa en 1

            for(int j = 0; j < matriz[i].length; j++){ //Recorremos las columnas de la matriz
                // j empieza en 0; mientras j sea menor que el largo de las columnas; j incrementa en 1

                if(i == j){ //Si i es igual a j, entonces nos encontramos en la diagonal principal, esto es
                    // fila 0 columna 0, fila 1 columna 1, fila 2 columna 2, fila 3 columna 3

                    matriz[i][j] = 1; //Modificamos la celda de la diagonal principal y le damos el valor de 1
                }
            }
        }

        for(int i = 0; i < matriz.length; i++){ //Recorremos las filas de la matriz
            // i empieza en 0; mientras i sea menor que el largo de las filas; i incrementa en 1

            for(int j = 0; j < matriz[i].length; j++){ //Recorremos las columnas de la matriz
                // j empieza en 0; mientras j sea menor que el largo de las columnas; j incrementa en 1

                System.out.print(matriz[i][j] + "\t"); //Imprimimos el valor de la posicion \t separamos los nombres con tabulador
            }
            System.out.println();
        }
    }
}
