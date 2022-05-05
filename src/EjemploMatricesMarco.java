public class EjemploMatricesMarco {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5]; //Creamos una matriz con 5 filas y 5 columnas
        // por default, los valores de la matriz estan en 0

        for(int i = 0; i < matriz.length;i++){ //Recorremos las filas de la matriz
            // i empieza en 0; mientras i sea menor que el largo de las filas; i incrementa en 1

            for(int j = 0; j < matriz[i].length; j++){ //Recorremos las columnas de la matriz
                // j empieza en 0; mientras j sea menor que el largo de las columnas; j incrementa en 1

                if(i == 0 || i == matriz.length - 1 //Si i es igual a 0 o i es igual a la ultima fila, esto llena la primera y la ultima fila
                || j == 0 || //Si j es igual a 0, esto llena la primera columna
                        j == matriz[i].length -1 || //j es igual a la ultima fila, esto llena la ultima columna
                        i == j){ //i es igual a j, esto llena la diagonal
                    matriz[i][j] = 1;
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
