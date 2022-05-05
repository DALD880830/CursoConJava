package TiposOperadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre incremento
        //Primero se incrementa el valor de i y despues se asigna a j
        int i = 1;
        int j = ++i; // i = i + 1

        System.out.println("i = " + i);//Con el pre incremento el valor de i es 2
        System.out.println("j = " + j);//Con el pre incremento el valor de j es 2
        
        // Post incremento
        //Primero se asigna el valor de j y despues se incrementa el valor de i
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++;
        System.out.println("i = " + i);//Con el post incremento el valor de i es 3
        System.out.println("j = " + j);//Con el post incremento el valor de j es 2

        // Pre decremento
        //Primero se decrementa el valor de i y despues se asigna a j
        i = 3;
        j = --i; // i = i - 1 = 2
        System.out.println("i = " + i);//Con el pre decremento el valor de i es 2
        System.out.println("j = " + j);//Con el pre decremento el valor de i es 2

        // Post decremento
        //Primero se asigna el valor de j y despues se decrementa el valor de i
        i = 4;
        j = i--;
        System.out.println("i = " + i);//Con el pre decremento el valor de i es 3
        System.out.println("j = " + j);//Con el pre decremento el valor de i es 4

        System.out.println("j = " + (++j));//Preincremento, entonces primero vale 4, incrementa a 5 e imprime
        System.out.println("j = " + (j++));//Postincremento, entonces primero vale 5 e imprime y despues se incrementa a 6
        System.out.println("j = " + j);//Imprimimos el valor de 6 de la instruccion anterior
    }
}
