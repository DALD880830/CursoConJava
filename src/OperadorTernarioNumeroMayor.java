import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("ingrese un número");
        int num1 = s.nextInt();

        System.out.println("ingrese un segundo número");
        int num2 = s.nextInt();

        System.out.println("ingrese un tercer número");
        int num3 = s.nextInt();

        System.out.println("ingrese un cuarto número");
        int num4 = s.nextInt();

        //Operadores ternarios
        max = (num1 > num2)? num1: num2; //Pregunta si num1 es mayor a num2 y después, retorna num1, si no es mayor, retorna num2 y se asigna a max
        max = (max > num3)? max: num3; //Pregunta si max es mayor a num3 y después, retorna max, si no es mayor, retorna num3 y se asigna a max
        max = (max > num4)? max: num4;//Pregunta si max es mayor a num4 y después, retorna max, si no es mayor, retorna num4 y se asigna a max

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("el número mayor es: " + max);
    }
}