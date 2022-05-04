import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {
        
        //String[] productos = new String[7]; //De esta forma es dinámica aunque cuente con límite
        String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy",  //Generamos el arreglo con llaves, declaramos posicionamos e inicializamos todo junto
                "Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air", //Esta forma no es tan dinámica porque debemos conocer el elemento y su posición
                "Chromecast 4ta generación", "Bicicleta Oxford" };

        int total = productos.length; //Obtenemos el valor total del arreglo

        /*productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";
*/

        Arrays.sort(productos); //Ordenamos de manera alfabética a a la z

        System.out.println("=== Usando for ===");

        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]); //Imprimimos el arreglo en orden incrementando la posicion de 0 en adelante
        }

        System.out.println("=== Usando for inverso ===");
        for(int i = 0; i < total; i++){
            System.out.println("para i = " + (total-1-i) + " valor: " + productos[total-1-i]); //Partimos del ultimo elemento con total-1 (6), y restamos i para que muestre el 5
        }

        System.out.println("=== Usando for inverso 2 ===");
        for(int i = total - 1; i >= 0; i--){ //Partimos del total de elementos -1; mientras que i sea mayor o igual a 0; i decrementa en 1
            System.out.println("para i = " + i + " valor " + productos[i]);
        }

    }
}
