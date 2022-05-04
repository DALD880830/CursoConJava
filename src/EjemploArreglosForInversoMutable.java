import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo){ //Método para ordenar el arreglo de forma inversa, recibe el arreglo

        int total2 = arreglo.length; //Obtenemos el largo de arreglo
        int total = arreglo.length; //Obtenemos el largo de arreglo

        for(int i = 0; i < total2; i++){ //i empieza en 0; mientras que i sea menor que total2; i incrementa en 1
            String actual = arreglo[i]; //Obtenemos el elemento actual
            String inverso = arreglo[total-1-i]; //Obtenemos el ultimo elemento usando total-1-i
            arreglo[i] = inverso; //Colocamos el elemento actual en la posicion del ultimo y el ultimo en la posicion del actual
            arreglo[total-1-i] = actual; //En la posicion inversa colocamos el actual
            total2--;  //Total2 decrementa en 1 ya que cuando llegue a la mitad, dejará de ordenar, porque si sigue ordenando regresará todo al estado inicial
        }
    }

    public static void main(String[] args) {

        String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generación", "Bicicleta Oxford" };

        int total = productos.length; //Obtenemos el largo del arreglo

        //Ordenamos el arreglo por alfabeto a-z
        Arrays.sort(productos);

        //Arreglo que definimos al inicio
        arregloInverso(productos);

        //Collections.reverse(Arrays.asList(productos)); //El metodo Collections.reverse() requiere de un elemento
                                        // Lista, podemos converti el arreglo en lista usando el metodo Arrays.asList()

        System.out.println("=== Usando for ===");
        for(int i = 0; i < total; i++){ //FOR para imprimir el arreglo modificado
            System.out.println("para indice " + i + " : " + productos[i]);
        }
    }
}