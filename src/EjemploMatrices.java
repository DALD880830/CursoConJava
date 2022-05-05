public class EjemploMatrices {
    public static void main(String[] args) {

        int[][] numeros = new int[2][4]; //Definimos la matriz de numeros enteros con int[][], creamos la instancia
        //new int[][], la matriz tendra un tamaño de 2 filas con 4 columnas [2][4]

        numeros[0][0] = 1; //A la posicion [0][0] le damos el valor de uno
        numeros[0][1] = 2; //posicion [0][1] valor 2
        numeros[0][2] = 3; //[fila 0] [columna 1] valor 3
        numeros[0][3] = 4;

        numeros[1][0] = 11; //[fila 1] [columna 0] valor 11
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        System.out.println("número de filas: " + numeros.length); //Imprimimos el numero de filas de la matriz con numeros.lenght
        System.out.println("número de columnas: " + numeros[0].length); //Imprimimos el numero de columnas, esta definido que son las columnas
        // por numeros[0].lenght se coloca el cero, porque es la fila en que revisará el numero de columnas

        System.out.println("primer elemento de la matriz: " + numeros[0][0]);//Imprimimos el primer elemento de la matriz
        // para imprimir se debe referenciar una posición especifica, en este caso, es la posicion [fila 0][columna 0]

        System.out.println("último elemento: " + numeros[numeros.length -1][numeros[1].length -1]); //Para obtener el ultimo dato de la matriz
        //se puede no referenciar su posicion sino referenciar que es el ultimo dato, se imprime la posicion [largo de la fila -1][largo de la columna -1]

        int num1 = numeros[0][0]; //Asignamos el dato guardado en una posicion especifica a la Variable num1
        int num2 = numeros[0][1];
        int num3 = numeros[0][2];
        int num4 = numeros[0][3];//Asignamos el dato guardado en una posicion especifica a la Variable num4
        int num5 = numeros[1][0];
        int num6 = numeros[1][1];
        int num7 = numeros[1][2];//Asignamos el dato guardado en una posicion especifica a la Variable num7
        int num8 = numeros[1][3];

        System.out.println("num1 = " + num1); //Imprimimos el valor de la posicion usando variables
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
    }
}
