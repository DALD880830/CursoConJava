public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10; //Variable primitiva, una variable primitiva siempre se pasa por valor no por referencia


        System.out.println("iniciamos el método main con i = " + i);
        test(i); //Invoca al metodo test, entonces realiza las instrucciones del metodo
        //Pasa por argumento el valor de i
        System.out.println("Finaliza el método main con el valor de i (se mantiene igual) = " + i);//Se pasa por valor
        //Entonces a pesar de que en el método el valor de i cambia, en el main se mantiene en 10
    }

    public static void test(int i){ //Metodo test
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;//cambiamos el valor de i
        System.out.println("Finaliza el método test con i = " + i);
    }
}
