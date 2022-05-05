public class EjemploMatricesTranspuesta {

    public static void main(String[] args) {
        int[][] matriz = { //Creamos una matriz de forma simplificada con 4 filas
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println("Matriz original");
        for(int i = 0; i < matriz.length; i++){ //Recorremos las filas de la matriz
            // i empieza en 0; mientras i sea menor que el largo de las filas; i incrementa en 1

            for(int j = 0; j < matriz[i].length; j++){ //Recorremos las columnas de la matriz
                // j empieza en 0; mientras j sea menor que el largo de las columnas; j incrementa en 1
                System.out.print(matriz[i][j] + "\t"); //Imprimimos el valor de la posicion \t separamos los nombres con tabulador
            }
            System.out.println();
        }
        int aux; //Variable auxiliar
        for(int i = 1; i < matriz.length; i++){ //Se recorren las filas desde 1, porque i se encuentra en la diagonal principal
            for(int j = 0; j < i; j++){
                aux = matriz[i][j]; //Respaldamos el valor de  i j
                matriz[i][j] = matriz[j][i]; //El valor de j i se lo pasamos al valor i j
                matriz[j][i]= aux; //A i j le pasamos el valor de auxiliar
            }
        }

        System.out.println("Matriz transpuesta");
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
