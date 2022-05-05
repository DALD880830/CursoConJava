package IfCaseAndBucles;

public class SentenciaForEach {
    public static void main(String[] args) {

        //For each se utiliza para arreglos u objetos de colleccion de Java, por cada elemento se hace algo con ese elemento

        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for(int num: numeros){ //primero el tipo de datos int por cada elemento se obtiene el elemento num del arreglo numeros
            System.out.println("num = " + num);
        }

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        
        for(String nom : nombres){ //tipo de dato String por cada elemento se obtiene elemento nom del arreglo nombres
            System.out.println("nombre = " + nom);
        }
    }
}
