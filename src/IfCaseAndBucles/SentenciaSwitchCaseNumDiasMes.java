package IfCaseAndBucles;

import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el número del mes de 1 - 12");
        int mes = s.nextInt(); //Guardamos el mes que nos indique el usuario

        int numeroDias = 0;
        System.out.println("Ingrese el año (YYYY)");
        int anio = s.nextInt(); //Guardamos el año que nos indique el usuario

        switch(mes){
            case 1: //Al no haber break, se sigue a el siguiente case y realiza la instruccion del caso que tiene break
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if(anio % 400 == 0 || ( (anio % 4 == 0) && !(anio % 100 == 0))){ //Si año es divisible entre 400 y el modulo o resto es 0
                    //o si año es divisible entre 4 y el modulo o resto es 0 y ademas el año NO es divisible entre 100 y el modulo o resto es da 0 entonces realiza la instrucción
                    numeroDias = 29;
                } else { //Si no es año bisiesto, entonces realiza la siguiente instruccion
                    numeroDias = 28;
                }
                break;
            default:
                numeroDias = 0;
        }

        System.out.println("numeroDias = " + numeroDias);
    }
}
