package IfCaseAndBucles;

public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0; //Se inicializa un valor
        while(i <= 5){ //Mientras que i sea menor o igual a 5 se realiza la instruccion
            System.out.println("i = " + i);
            i++; //Se incrementa el valor de i
        }

        i = 0; //Retornamos el valor de i a 0
        boolean prueba = true; //Asignamos el valor de true a prueba

        while(prueba){ //Mientras prueba sea verdadero se ejecuta el bloque de instruccion

            if(i == 7){ //Si i es igual a 7 entonces cambia el valor de prueba a false
                prueba = false;
            }
            System.out.println("i = " + i);
            i++; //Incrementamos el valor de i
        }

        prueba = false; //Asignamos el valor false a prueba
        do { //Se ejecuta una vez la instruccion
            System.out.println("se ejecuta al menos una vez");
        } while (prueba); //Evalua que prueba es falso y no itera

        prueba = true; //Cambiamos prueba a true
        i=0;

        do { //Se realiza al menos una vez
            if(i == 10){ //Cuando i sea igual a 10 prueba cambia a false
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (prueba); //Evalua que prueba ya es falso y deja de iterar
    }
}
