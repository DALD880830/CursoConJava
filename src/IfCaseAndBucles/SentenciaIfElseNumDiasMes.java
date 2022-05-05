package IfCaseAndBucles;

import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {

        //Ejemplo que nos dará el numero de días del mes de un año específico

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el número del mes de 1 - 12");
        int mes = s.nextInt(); //Guardamos el mes que nos indique el usuario

        int numeroDias = 0;
        System.out.println("Ingrese el año (YYYY)");
        int anio = s.nextInt(); //Guardamos el año que nos indique el usuario

        if(mes == 1 || mes ==3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){ //Si el mes ingresado es uno de estos, nos dara la siguiente instruccion
            numeroDias = 31;
        } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){ //Al no ser de los meses anteriores, entonces se evalua si es uno de estos meses
            numeroDias = 30;
        } else if(mes == 2){ //Si no es uno de los anteriores, evalua si es el mes 2 (febrero)
            if(anio % 400 == 0 || ( (anio % 4 == 0) && !(anio % 100 == 0))){ //Si año es divisible entre 400 y el modulo o resto es 0
                //o si año es divisible entre 4 y el modulo o resto es 0 y ademas el año NO es divisible entre 100 y el modulo o resto es da 0 entonces realiza la instrucción
                numeroDias = 29;
            } else { //Si no es año bisiesto, entonces realiza la siguiente instruccion
                numeroDias = 28;
            }
        }
        System.out.println("numeroDias = " + numeroDias);
    }
}
