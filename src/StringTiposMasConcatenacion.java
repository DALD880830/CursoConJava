public class StringTiposMasConcatenacion {

    public static void main(String[] args) {

        String curso = "Curso de Java"; //Esto es en la Literal
        String curso2 = new String("curso de java"); // Esto es con una instancia

        boolean esIgual = curso == curso2; //Son distintos Curso se crea de manera implicita y Curso 2 de manera Explicita
        System.out.println("curso == curso2 = " + esIgual);

        //Para comparar el String se usa equals
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        //Este es igual porque cuando se crea un objeto en la literal y despues se crea un nuevo objeto con el mismo
        //valor, no crea un nuevo objeto, sino más bien asigna la referencia. Esto optimiza para no crear muchos objetos
        String curso3 = "Curso de Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);


        //A partir de aqui son concatenaciones
        String cursoJava = "Curso completo de java";
        String tomadoPor = "tomado por Alex";

        String concatenado = "Este es un " + cursoJava + " " + tomadoPor;
        System.out.println(concatenado);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(concatenado + numeroA + numeroB);//En el resultado sale esto Alex105 por la precedencia
        // de los operadores, como primero encuentra una cadena, java asume que todo es una cadena
        //Para cambiar esto se pueden utilizar los parentesis

        System.out.println(concatenado + (numeroA + numeroB));//Los parentesis dan prioridad a la precedencia

        System.out.println(numeroA + numeroB + concatenado);//Por la precedencia de datos, aqui primero suma y luego concatena

        //Esto es otra forma de concatenar
        String concatenar2 = cursoJava.concat(tomadoPor);
        System.out.println("concatenar2 = " + concatenar2);

    }


}
