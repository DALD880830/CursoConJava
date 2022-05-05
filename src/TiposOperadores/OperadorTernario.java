package TiposOperadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        
        String variable = 7 == 5 ? "si es verdadero" : "si es falso"; // ? Es usado para preguntar (verificar) si se ciumple la condicion
        // : es usado para devolver un valor si es verdadero y si no, toma el otro camino, es como el if else
        System.out.println("variable = " + variable);
        
        String estado = "";//Este string adquiere su valor más adelante
        double promedio = 0.0;//Se mantiene en cero para que se obtenga su valor mediante la clase scanner

        //Operador ternario, se llama así porque esta formado por tres elementos
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de matemáticas entre 2.0 - 7.0:");
        matematicas = s.nextDouble(); //Capturamos la primera nota y el nextDouble lo convierte a Double

        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0:");
        ciencias = s.nextDouble(); //Capturamos la segunda nota

        System.out.println("Ingrese la nota de historia entre 2.0 - 7.0:");
        historia = s.nextDouble(); //Capturamos la tercera nota

        promedio = (matematicas + ciencias + historia) / 3; //Las materias van entre 3 para la precedencia de datos y después se divide entre 3 para el promedio
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado": "Rechazado"; //Esta expresion equivale al if que esta abajo (version abreviada de un IF ELSE con un valor)
        System.out.println("estado = " + estado);

       /* if(promedio >= 5.49){
            estado = "Aprobado";
        } else {
            estado = "Rechazado";
        }*/
    }
}
