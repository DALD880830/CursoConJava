package TiposOperadores;

import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);

        System.out.println("i + j = " + (i + j));//Para que se realice la suma y no se concatene con el String se usan los parentesis
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));//Los parentesis permiten que no se concatene con el String

        int multi = i * j;
        System.out.println("multiplicación = " + multi);
        
        int div = i / j;//No maneja decimales, por consiguiente su resultado es 1
        float div2 = (float) i / (float)j;//Para poder realizar la división, se tiene que hacer el CAST
                                //en cada uno de las variables, el CAST es poner (float) y luego la variable i
        System.out.println("div = " + div);//El resultado es con un int y queda en 1
        System.out.println("div2 = " + div2);
        
        int resto = i % j;//El entero que sobra lo podemos visualizar con resto
        System.out.println("resto = " + resto);
        
        resto = 8 % 5;
        System.out.println("resto = " + resto);//El resultado de resto es 3

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));//Ingresa caracter, se convierte a int
        if(numero % 2 == 0){//Si el resto es igual a cero
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }
    }
}
