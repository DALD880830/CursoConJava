package Matrices;

public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        String[][] nombres = new String[3][2];//Definimos la matriz de String String[][], creamos la instancia
        //new String[][], la matriz tendra un tamaño de 3 filas con 2 columnas [3][2]
        //El valor por defecto es null, si no asignamos un valor a nombre, entonces se imprimira null

        nombres[0][0] = "Pepe"; //A la posicion [0][0] le damos el valor de Pepe
        nombres[0][1] = "Pepa";
        nombres[1][0] = "Josefa";
        nombres[1][1] = "Paco"; //[fila 1] [columna 1] valor Paco
        nombres[2][0] = "Lucas";
        nombres[2][1] = "Pancha";

        System.out.println("Iterando con for: ");

        for(int i = 0; i < nombres.length; i++){ //Recorremos las filas de la matriz
            // i empieza en 0; mientras i sea menor que el largo de las filas; i incrementa en 1

            for(int j = 0; j < nombres[i].length; j++){ //Recorremos las columnas de la matriz
                // j empieza en 0; mientras j sea menor que el largo de las columnas; j incrementa en 1
                System.out.print(nombres[i][j] + "\t"); //Imprimimos el valor de la posicion \t separamos los nombres con tabulador
            }
            System.out.println();
        }

        System.out.println("Iterando con foreach: ");

        for(String[] fila: nombres){ //Por cada iteracion corresponde a un tipo arreglo de tipo String, obtenemos fila
            for(String nombre: fila){ //Por cada fila se obtiene el nombre que esta en la columna
                System.out.print(nombre + "\t"); //Imprimimos los nombres obtenidos separados por tabulador
            }
            System.out.println();
        }

    }
}
