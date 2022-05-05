package IfCaseAndBucles;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {


        bucle: //Identificador del FOR, siempre pegado al FOR, 1 línea arreba del FOR o al lado del FOR
        for (int i = 1; i <= 7; i++) { // i inicia en 1, mientras i sea menor o igual a 7, j incrementa en 1
            int j = 1;
            while ( j <= 8) { //mientras j sea menor o igual a 8 realiza la instruccion
                if (i == 6 || i == 7) { //si i es igual a 6 o si i es igual a 8 realiza la instruccion
                    System.out.println("Dia " + i + ": descanso de fin de semana!");
                    continue bucle; //Continua con la siguiente iteracion
                    //Si en el while es la iteracion 2, realiza la instruccion del trabajo(la siguiente), solo si es
                    //6 o 7 realiza la instruccion del if
                }
                System.out.println("Día " + i + ", trabajando a las " + j + "hrs. ");
                j++;
            }
        }
        System.out.println("\n=================================================");

        bucle1: //Identificador del FOR, siempre pegado al FOR, 1 línea arreba del FOR o al lado del FOR
        for (int i = 0; i < 5; i++) { // i inicia en 0, mientras i sea menor a 5, j incrementa en 1

            System.out.println();
            int j = 0;
            while ( j < 5) { //j inicia en 0 mientras sea menor a 5
                if (i == 2) { //Si i es igual a 2 lo salta
                    continue bucle1; //No salimos del for, continuamos con la siguiente iteracion
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
                j++;
            }
        }
        System.out.println("\n=================================================");


        etiqueta: //Identificador del FOR, siempre pegado al FOR, 1 línea arreba del FOR o al lado del FOR
        for (int i = 0; i < 5; i++) { // i inicia en 0, mientras i sea menor a 5, j incrementa en 1

            System.out.println();
            for (int j = 0; j < 5; j++) { // j inicia en 0, mientras j sea menor a 5, j incrementa en 1
                if (i == 2) { //Si i es igual a 2 se lo salta
                    break etiqueta; //Salimos del bucle FOR
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
    }
}
