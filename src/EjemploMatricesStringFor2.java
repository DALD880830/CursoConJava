public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = { {"Pepe", "Pepa"}, {"Josefa", "Paco"}, {"Lucas", "Pancha"}}; //Creamos la matriz de forma simplificada usando llaves
        //La primera llave es para determinar la matriz principal, despues se colocan llaves para ejemplificar las filas y se separan por coma
        //Dentro de las llaves de filas, se colocan los valores de las columnas separados por comas

        for(String[] fila: nombres){ //Por cada iteracion corresponde a un tipo arreglo de tipo String, obtenemos fila
            for(String nombre: fila){ //Por cada fila se obtiene el nombre que esta en la columna
                System.out.print(nombre + "\t"); //Imprimimos los nombres obtenidos separados por tabulador
            }
            System.out.println();
        }

    }
}
