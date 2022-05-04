import java.util.Scanner;

public class EjemploArreglosEliminarElemento {
    public static void main(String[] args) {

        int[] a = new int[10]; //Arreglo de numeros enteros

        Scanner s = new Scanner(System.in); //Clase scanner para introducir valores al sistema

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt(); //Capturamos los numeros ingresados en a
        }
        System.out.println();
        System.out.println("Ingrese una posición a eliminar entre 0 - 9:");
        int posicion = s.nextInt(); //Pedimos y capturamos el valor a eliminar

        for(int i = posicion; i < a.length - 1; i++){ //i parte desde la posicion a eliminar; mientras que i sea menor al largo del arreglo; i incrementa en 1
            a[i] = a[i+1]; //El ultimo valor lo pasamos a posicion del penultimo valor
        }

        int[] b = new int[a.length-1]; //Copiamos el arreglo en uno nuevo, el arreglo tendrá el tamaño del arreglo anterior menos 1
        System.arraycopy(a, 0, b, 0, b.length); //Clase System para copiar el arreglo System.arraycopy
        //origen a, parte desde 0, destino b, parte desde 0, tamaño del arreeglo b.length el cual corresponde a a.lenght-1

        a = b; //Mantenemos el arreglo a y el arreglo b queda con un arreglo temporal
        for(int i = 0; i<a.length;i++){
            System.out.println(i + " => " + a[i]); //Imprimimos el arreglo
        }
    }
}
