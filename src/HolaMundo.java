public class HolaMundo {
    public static void main(String[] args){

        String saludar= "Este es un hola usando una variable";

        System.out.println("Primer hola de ALEX");

        System.out.println(saludar);

        //Podemos usar soutv + TAB como atajo para lo siguiente:
        //Si ponemos un punto despues del saludar, nos va a dar diferentes métodos a usar
        System.out.println("saludar con el método toUpperCase = " + saludar.toUpperCase());
        
        //Variable int
        int numero = 10;
        
        //Si lo usamos como Integer, nos da la oportunidad para usar métodos
        Integer num = 5;
        //Este método se verá después
        num.toString();

        System.out.println("numero = " + numero);

        System.out.println("num = " + num);
        
        boolean valor= true;

        int edad = 1;
        System.out.println("edad = " + edad);
        //int Edad está definido afuera, entonces ya no necesita definirse en el if, solo como edad

        if(valor){
            //El valor de edad cambia dentro del if
            edad = 7;
            System.out.println("edad = " + edad);
        }

        var numero4= 15;
        var palabra= "Var puede ser muchas cosas, no es necesario indicar que tipo de dato es";

        System.out.println("numero4 = " + numero4);
        System.out.println("palabra = " + palabra);

        String nombre;
        nombre = "Alejandro";

        if (numero>9){
            //Si numero es mayor que 9, cambia el nombre a Daniel, y como 10 mayor que 9 entonces:
            nombre= "Daniel";
        }
        System.out.println("nombre = " + nombre);
        /*
        Asi comentamos bloques completos, Dentro del código de Java
        Aunque podemos seleccionar código y dar clic en CODE, buscar la opción de comentar con líneas o por bloque
         */
    }



}
