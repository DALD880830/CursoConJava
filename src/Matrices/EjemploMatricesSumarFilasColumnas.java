package Matrices;

public class EjemploMatricesSumarFilasColumnas {
    public static void main(String[] args) {

        int sumaFila, sumaColumna; //Definimos las variables de enteros sumaFila y sumaColumna

        int[][] a = { //Creamos una matriz de forma simplificada con 3 filas
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i = 0; i < a.length; i++){ //Recorremos las filas de la matriz
            // i empieza en 0; mientras i sea menor que el largo de las filas; i incrementa en 1

            sumaColumna = 0; //Inicializamos la suma de sumaColumna
            sumaFila = 0; //Inicializamos la suma de sumaFila

            for(int j = 0; j < a[i].length; j++){ //Recorremos las columnas de la matriz
                // j empieza en 0; mientras j sea menor que el largo de las columnas; j incrementa en 1

                sumaFila += a[i][j]; //Igual que sumaFila = sumaFila+a[i][j], empieza en 0 y suma el valor de la fila
                //en la siguiente iteracion, a ese resultado le suma el nuevo valor
                sumaColumna += a[j][i]; //Igual que sumaColumna = sumaColumna+a[j][i], empieza en 0 y suma el valor de la columna
                //en la siguiente iteracion, a ese resultado le suma el nuevo valor
            }
            System.out.println("Total fila " + i + ": " + sumaFila); //Imprime la sumatoria de la fila
            System.out.println("Total columna " + i + ": " + sumaColumna); //Imprime la sumatoria de la columna
        }

    }
}
