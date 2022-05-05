package Arreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje; //Arreglo de las materias
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0; //Las suma de las notas se inician en 0
        claseMatematicas = new double[7]; //Instancias de los arreglos
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner s = new Scanner(System.in); //Scanner para ingresar datos en el sistema
        System.out.println("Ingrese 7 notas de estudiantes para matemáticas:");
        for(int i = 0; i < claseMatematicas.length; i++){ //i empieza en 0; mientras i sea menor al largo del arreglo; i incrementa en 1
            claseMatematicas[i] = s.nextDouble(); //Almacena en a los valores ingresados
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia:");
        for(int i = 0; i < claseHistoria.length; i++){ //i empieza en 0; mientras i sea menor al largo del arreglo; i incrementa en 1
            claseHistoria[i] = s.nextDouble(); //Almacena en a los valores ingresados
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje:");
        for(int i  = 0; i < claseLenguaje.length; i++){ //i empieza en 0; mientras i sea menor al largo del arreglo; i incrementa en 1
            claseLenguaje[i] = s.nextDouble(); //Almacena en a los valores ingresados
        }

        for(int i = 0; i < 7; i++){ //i empieza en 0; mientras i sea menor a 7; i incrementa en 1
            sumNotasMatematicas += claseMatematicas[i]; //sumNotasMatematicas = sumNotasMatematicas + claseMatematicas[i]
            sumNotasHistoria += claseHistoria[i]; //
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematica = (sumNotasMatematicas/claseMatematicas.length); //La suma de las notas se divide entre el largo del arreglo
        double promedioHistoria = (sumNotasHistoria/claseHistoria.length);
        double promedioLenguaje = (sumNotasLenguaje/claseLenguaje.length);
        System.out.println("Promedio clase matemáticas: " + promedioMatematica);
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguaje: " + promedioLenguaje);
        System.out.println("Promedio total del curso: "
                + (promedioMatematica + promedioHistoria + promedioLenguaje)/3); //Los promedios los dividimos entre 3 para el promedio total

        System.out.println("Ingrese el identificador del alumno (de 0 - 6):");
        int id = s.nextInt(); //Se pide al usuario el numero de alumno
        double promedioAlumno = (claseHistoria[id] + claseLenguaje[id] + claseMatematicas[id])/3; //Se obtiene el promedio especifico de un alumno
        System.out.println("Promedio alumno Nro " + id + " : " + promedioAlumno);
    }
}
