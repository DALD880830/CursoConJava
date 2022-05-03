import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        double random = Math.random(); //Math.random() Proporciona un numero aleatorio entre 0 y 1
        System.out.println("random = " + random);
        random *= colores.length; //Se obtiene un numero aleatorio hasta el largo del arreglo que es 6,

        System.out.println("random = " + random);
        
        random = Math.floor(random); //Se debe redondear hacia abajo, porque si se redondea arriba se incluirá la posición 6 y dicha posicion no existe
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]); //Retorna un color aleatorio basado en su posición, se hace el CAST porque random es un Double
        
        Random randomObj = new Random(); //Creamos la ionstancia de la clase Random, tiene mas amplitud, rangos mas apmplios y acepta enteros
        int randomInt = 15 + randomObj.nextInt(25-15+1); //El primer 15 es para que la creacion del numero aleatorio empiece en 15 y
        // dentro de los argumentos se le debe restar, el 25 es el numero máximo, sin embargo, no lo incluye, para incluirlo se coloca el +1
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length); //Nos retornara un numero aleatorio usando el largo del arreglo (6)
        System.out.println("randomInt = " + randomInt); //Retorna un numero aleatorio usando el arreglo como numero minimo y maximo
        System.out.println("colores = " + colores[randomInt]); //Imrpime el color de la posicion que da con el numero aleatorio que retorna
    }
}
