import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length; //Obtenemos el largo de arreglo
        int total = arreglo.length; //Obtenemos el largo de arreglo
        for(int i = 0; i < total2; i++){ //i empieza en 0; mientras que i sea menor que total2; i incrementa en 1
            String actual = arreglo[i]; //Obtenemos el elemento actual
            String inverso = arreglo[total-1-i]; //Obtenemos el ultimo elemento usando total-1-i
            arreglo[i] = inverso; //Colocamos el elemento actual en la posicion del ultimo y el ultimo en la posicion del actual
            arreglo[total-1-i] = actual; //En la posicion inversa colocamos el actual
            total2--; //Total2 decrementa en 1 ya que cuando llegue a la mitad, dejará de ordenar, porque si sigue ordenando regresará todo al estado inicial
        }
    }

    public static void sortBurbuja(Object[] arreglo){ //Arreglo de objetos Object es generico

        int total = arreglo.length; //Obtenemos el largo de arreglo
        int contador = 0; //Verificamos cuantas veces se realiza la iteración

        for(int i = 0; i < total - 1; i++){ //i inicia en 0; mientras que i sea menor que total - 1; i incrementa en 1
            //Se realiza el total - 1 porque ya no es necesario que haga la iteracion en el ultimo elemento porque ya estaría ordenado

            for(int j = 0; j < total -1 -i; j++){ //j inicia en 0; mientras que j sea menor que total; j incrementa en 1
                //Se realiza el total - 1 porque en el en el for tenemos j+1

                if( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) > 0 ){ //Comparamos el elemento de i con el elemento de j con comparaTO()
                    // j+1 compara los siguientes 2 elementos del segundo for   Comparable es el generico para comparar
                    //Si queremos que sea de a-z y de menor a mayor debe estar con <       Para z-a y mayor a menor debe estar en >

                    Object auxiliar = arreglo[j]; //Intercambiamos las posiciones con una variable auxiliar, guardamos la posición que tenía j
                    arreglo[j] = arreglo[j+1]; //Asignamos j con el valor de j+1
                    arreglo[j+1] = auxiliar; //A j+1 le asignamos el valor de la variable auxiliar
                }
                contador++; //Aumentamos el contador en 1
            }
        }

        System.out.println("contador = " + contador);
    }

    public static void main(String[] args) {

        String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generación", "Bicicleta Oxford" };

        int total = productos.length; //Obtenemos el largo de arreglo

        sortBurbuja(productos); //Invocamos el metodo y le pasamos el parametro del arreglo productos

        System.out.println("=== Usando for ===");
        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4]; //Para no tener conflicto con el metodo, no puede ser un arreglo de primitivos int, sino debe ser de tipo Integer

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros); //Invocamos el metodo y le pasamos el parametro del arreglo numeros

        for(int i = 0; i < numeros.length; i++){ //i inicia en 0; mientras que i sea menor al largo del arrglo numeros; i incrementa en 1
            System.out.println("i = " + i + " : " + numeros[i]);
        }
    }
}