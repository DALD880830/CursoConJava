public class EjemploMatricesTransponerMatriz {
    public static void main(String[] args) {

        int[][] a, b; //Se crea la matriz a y b
        a = new int[8][4]; //Se crea la instancia, la matriz a tendra 8 filas y 4 columnas
        b = new int[4][8]; //Se crea la instancia, la matriz b tendra 4 filas y 8 columnas

        for(int i = 0; i < a.length; i++){ //Recorremos las filas de la matriz
            // i empieza en 0; mientras i sea menor que el largo de las filas; i incrementa en 1

            for(int j = 0; j < a[i].length; j++){ //Recorremos las columnas de la matriz
                // j empieza en 0; mientras j sea menor que el largo de las columnas; j incrementa en 1

                a[i][j] = i+j*3; //El valor de i j tendra el valor de posicion j por 3 mas el valor de posicion de i es igual que poner i+(j*3)
                System.out.print(a[i][j] + "\t"); //Imprimimos el valor de la posicion \t separamos los nombres con tabulador
            }
            System.out.println();
        }

        //Transponemos los valores de la matriz a hacia la matriz b
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                b[j][i] = a[i][j]; //El i j de a se lo asignamos al i j de b
            }
        }

        System.out.println("La matriz transpuesta b:");
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}