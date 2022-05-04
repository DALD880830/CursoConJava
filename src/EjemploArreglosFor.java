import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        
        String[] productos = new String[7]; //Arreglo del tipo String, creamos la instancia con new String
        int total = productos.length; //Obtenemos el largo del arreglo para convertirlo a int

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        //Realizamos un ordenamiento de los datos por alfabeto usando Arrays.sort
        Arrays.sort(productos);

        System.out.println("=== Usando for ===");

        for(int i = 0; i < total; i++){ //i inicia en cero, mientras i sea menor a total, i incrementa en 1
            System.out.println("para indice " + i + " : " + productos[i]); //Imrpimimos los valores del arreglo mediante un FOR
        }

        System.out.println("=== Usando foreach ===");

        for(String prod: productos){ //Imprimimos el valor de los productos con FOR EACH, por cada elemento se obtiene una variable de turno del tipo String productos es el origen del arreglo
            System.out.println("prod = " + prod);
        }

        System.out.println("=== Usando while ===");

        int i = 0; //Este i no choca con el del for porque los del for es propio del for
        while(i < total){ //Mientras i sea menor al total de elementos del arreglo
            System.out.println("para indice " + i + " : " + productos[i]); //Imprime valor
            i++; //Incrementa el valor de i en 1
        }

        System.out.println("=== Usando do while ===");

        int j = 0;
        do { //Realiza la instrucción al menos una vez
            System.out.println("para indice " + j + " : " + productos[j]); //Imprime el primer valor
            j++; //j incrementa su valor en 1
        } while(j < total); //Se realizará mientras j sea menor al valor del total de elementos del arreglo


        //Creamos un arreglo de numeros enteros
        int[] numeros = new int[10]; //Creamos la instancia del arreglo con new int[]

        int totalNumeros = numeros.length; //totalNumeros equivale al numero total de elementos que tiene el arreglo
        for(int k = 0; k < totalNumeros; k++){ //k inicia en cero, mientras k sea menor a totalNumeros, k incrementa en 1
            numeros[k] = k*3; //Cada numero toma el valor de su posición y se multiplica por 3, el cual es el nuevo valor de cada elemento
        }

        for(int k = 0; k < totalNumeros; k++){
            System.out.println("numeros = " + numeros[k]); //Imprimimos los valores que el arreglo modificó con el FOR anterior
        }

    }
}
