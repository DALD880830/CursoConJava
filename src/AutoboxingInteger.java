public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7,
                8, 9, 10, 11, 12, 13, 14, 15}; //Arreglo de objetos del tipo Integer

        int suma = 0; //Suma de tipo primitivo

        for(Integer i: enteros){ //Tipo Integer del arreglo enteros
            if(i.intValue() % 2 == 0){ //Si el entero de cada objeto i calculando el resto o modulo de 2 es igual a cero es par
                suma += i.intValue(); //Sumamos el objeto i   intValue retorna int como primitivo
            }
        }
        System.out.println("suma = " + suma);

        //Este siguiente es igual a la suma anterior solo que los i estan de forma implicita
        suma = 0;
        for(Integer i: enteros){
            if(i % 2 == 0){
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
