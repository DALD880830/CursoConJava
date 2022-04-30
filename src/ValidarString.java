public class ValidarString {

    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if(esNulo){ //Si es nulo se le da un valor
            curso = "Programacion Java";
        }
        System.out.println(curso.toUpperCase());
        System.out.println(curso + " desde cero");

        if(esNulo){
            curso = " "; //Este se va a validar, es un caracter de espacio
        }

        boolean esVacio = curso.length() == 0;//Valida que el string tenga un tamaño, verifica cantidad de caracteres
        System.out.println("esVacio = " + esVacio);

        boolean esVacioDos = curso.isEmpty();
        System.out.println("esVacioDos = " + esVacioDos);

        boolean esBlanco = curso.isBlank();// Revisa los espacios en blanco o espacios
        System.out.println("esBlanco = " + esBlanco);

        if(!(esVacio)) {
            System.out.println(curso.toUpperCase());
            System.out.println(curso + " desde cero... si es diferente de vacio imprime");
        }

        if(!esVacioDos) {
            System.out.println(curso.toUpperCase());
            System.out.println(curso + " desde cero.. si es diferente de vacio");
        }

        if(esBlanco == false) {
            System.out.println(curso.toUpperCase());
            System.out.println(curso + " desde cero... si es diferente de blanco");
        }


    }

}
