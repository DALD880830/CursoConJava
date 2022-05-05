package IfCaseAndBucles;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 6.4f;

        if(promedio == 10) { //Evalua si promedio es igual a 10, si es realiza la instruccion, sino, hace el else
            System.out.println("Felicitaciones, excelente promedio!");
        } else if(promedio >= 9){ //Al no ser 10, ahora evalua si promedio es igual o mayor a 9 si es realiza la instruccion, sino, hace el else
            System.out.println("Muy buen promedio!");
        } else if(promedio >= 8){ //Al no ser 9, ahora evalua si promedio es igual o mayor a 8 si es realiza la instruccion, sino, hace el else
            System.out.println("Buen promedio!");
        } else if(promedio >= 7){ //Al no ser 8, ahora evalua si promedio es igual o mayor a 7 si es realiza la instruccion, sino, hace el else
            System.out.println("Regular, necesitas esforzarte un poco más!");
        } else if(promedio >= 6){ //Al no ser 7, ahora evalua si promedio es igual o mayor a 6 si es realiza la instruccion, sino, hace el else
            System.out.println("Necesitas estudiar más!");
        } else { //Al no ser ninguna de las anteriores, entonces realiza la instruccion dentro del else
            System.out.println("Reprobado!");
        }

        System.out.println("tu promedio es " + promedio);
    }
}
