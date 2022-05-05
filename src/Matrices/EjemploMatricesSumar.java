package Matrices;

public class EjemploMatricesSumar {
    public static void main(String[] args) {
        int[][] a = { //Creamos una matriz de forma simplificada con 3 filas
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] b = { //Creamos una matriz de forma simplificada con 3 filas
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        int[][] suma = new int[3][3]; //Se crea la instancia de la matriz suma, la matriz a tendra 3 filas y 3 columnas

        for(int i = 0; i < a.length; i++){ //Recorremos las filas de la matriz
            // i empieza en 0; mientras i sea menor que el largo de las filas; i incrementa en 1

            for(int j = 0; j < a[i].length; j++){ //Recorremos las columnas de la matriz
                // j empieza en 0; mientras j sea menor que el largo de las columnas; j incrementa en 1

                suma[i][j] = a[i][j] + b[i][j]; //A la posicion i j de la matriz suma le asignamos el valor de la suma
                // del valor de la posicion i j de la matriz a con el valor de la posicion i j de la matriz b
            }
        }
        for(int i = 0; i < suma.length; i++){ //Recorremos las filas de la matriz
            // i empieza en 0; mientras i sea menor que el largo de las filas; i incrementa en 1

            for(int j = 0; j < suma[i].length; j++){ //Recorremos las columnas de la matriz
                // j empieza en 0; mientras j sea menor que el largo de las columnas; j incrementa en 1
                System.out.print(suma[i][j] + "\t"); //Imprimimos el valor de la posicion \t separamos los nombres con tabulador
            }
            System.out.println();
        }
    }
}
