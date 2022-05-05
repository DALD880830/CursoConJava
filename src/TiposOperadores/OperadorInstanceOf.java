package TiposOperadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase String ... que tal!";

        Integer num = 7;

        Boolean b1 = texto instanceof String;//Verifica si texto es una instancia de la clase String

        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object;//Verifica si texto es una instancia de la clase Object(clase padre de todos los objetos)
        System.out.println("texto es del tipo Object = " + b1);

        b1 = num instanceof Integer;//Verifica si num es una instancia de la clase Integer
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;//Verifica si num es una instancia de la clase Number
        System.out.println("num es del tipo Number = " + b1);

        b1 = num instanceof Object;//Verifica si num es una instancia de la clase Object
        System.out.println("num es del tipo Object = " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Number;//Verifica si decimal es una instancia de la clase Number
        System.out.println("decimal es del tipo Number = " + b1);

        b1 = b1 instanceof Boolean;//Verifica si b1 es una instancia de la clase Boolean
        System.out.println("b1 es del tipo Boolean = " + b1);
    }
}
