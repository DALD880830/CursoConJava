package Matrices;

public class EjemploMatricesSimetrica {
    public static void main(String[] args) {

        boolean simetrica = true; //Definimos boolean para saber si la matriz es simetrica

        int[][] matriz = { //Creamos una matriz de forma simplificada con 4 filas
                {1,2,3,4}, //Fila 0
                {2,1,0,5}, //Fila 1
                {3,0,1,6}, //Fila 2
                {4,5,6,7} //Fila 3
        };

        salir: for(int i = 0; i < matriz.length; i++){ //Recorremos las filas de la matriz
            // i empieza en 0; mientras i sea menor que el largo de las filas; i incrementa en 1

           for(int j = 0;j < i; j++){
               if(matriz[i][j] != matriz[j][i]){ //Si en la matriz las celdas i j es dierente a su transpuesta j i
                   simetrica = false; //Se cambia el valor del boolean simetrica por false
                   break salir; //Salimos del FOR
               }
           }
        }

        if(simetrica){ // Si el valor del booleanse mantiene en true
            System.out.println("La matriz es simétrica");
        } else{ //Si la matriz no es simetrica, el boolean cambia a false
            System.out.println("La matriz no es simétrica");
        }
    }
}
