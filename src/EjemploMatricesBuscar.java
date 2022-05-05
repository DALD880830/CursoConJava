public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        int[][] matrizDeEnteros = { //Creamos una matriz de forma simplificada con 3 filas
                {35, 90, 3, 1978}, //Fila 0
                {15, 2020, 10, 5}, //Fila 1
                {677, 127, 32767, 1999} //Fila 2
        };

        int elementoBuscar = 1999; //Ingresamos el elemento a buscar
        boolean encontrado = false; //Usamos boolean para saber si encontramos el elemento que estamos buscando, por defecto es False
        int i; //Definimos i para colocarlo en el ultimo if
        int j = 0; //Definimos j para colocarlo en el ultimo if, j si se inicializa con 0 en la definicion de la variable
        buscar: for(i = 0; i < matrizDeEnteros.length; i++){ //buscar es la etiqueta del FOR... Recorremos las columnas de la matriz
            // i empieza en 0; mientras i sea menor que el largo de las columnas; i incrementa en 1

            for(j = 0; j < matrizDeEnteros[i].length; j++){ //Recorremos las columnas de la matriz
                // j empieza en 0; mientras j sea menor que el largo de las columnas; j incrementa en 1

                if(matrizDeEnteros[i][j] == elementoBuscar){ //Verificamos si el elemento en el que estamos es igual al elemento buscado
                    encontrado = true; //Si son iguales, entonces el valor de boolean cambia a true
                    break buscar; //Si encontramos el elemento salimos del for con etiqueta buscar
                }
            }
        }

        if(encontrado){ // Si el valor del boolean es true
            System.out.println("Encontrado " + elementoBuscar + " en las coordenadas " + i + "," + j); //Imprimimos el elemento buscado y la posicion en la que se encontro
        } else { //Si no se encontró el elemento y el boolean se mantiene en false
            System.out.println(elementoBuscar + " no se encontró en la matriz!");
        }
    }
}
