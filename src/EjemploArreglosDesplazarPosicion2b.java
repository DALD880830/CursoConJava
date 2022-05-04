import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {

        int[] a = new int[10]; //Arreglo de numeros enteros
        int elemento, posicion, ultimo; //Definimos las variables
        Scanner s = new Scanner(System.in); //Clase scanner para introducir valores al sistema

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese el número:");
            a[i] = s.nextInt(); //Capturamos los numeros ingresados en a
        }
        System.out.println();

        System.out.println("Nuevo elemento:");
        elemento = s.nextInt(); //Pedimos y capturamos el valor del nuevo elemento

        System.out.println("Posición donde agregar (de 0 a 9)");
        posicion = s.nextInt(); //Pedimos y capturamos la posicion del nuevo elemento

        ultimo = a[a.length -1]; //Ultimo tiene el valor del arreglo a con el indice a.lenght-1
        for(int i = a.length - 2; i >= posicion; i--){ //i parte desde el penultimo valor; mientras que i sea mayor o igual a la variable posicion; i decrementa en 1
            a[i+1] = a[i];//El valor actual se lo damos a la posicion a[i+1]  El for arranca en la posición 8, entonces el valor 9 que esta
            // en la posición 8 lo pasamos a la posición 9
        }
        int[] b = new int[a.length+1]; //Copiamos el arreglo en uno nuevo, el arreglo tendrá el tamaño del arreglo anterior mas 1
        System.arraycopy(a, 0, b, 0, a.length); //Clase System para copiar el arreglo System.arraycopy
        //origen a, parte desde 0, destino b, parte desde 0, tamaño del arreeglo b.length el cual corresponde a a.lenght

        a = b; //Mantenemos el arreglo a y el arreglo b queda con un arreglo temporal

        a[posicion] = elemento; //En b agregamos la nueva posicion que queremos agregar el nuevo elemento, b es el nuevo arreglo

        a[a.length -1] = ultimo; //Agregamos la ultima posicion e insertamos ultimo

        System.out.println("El arreglo:");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
