public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -5;

        //Los operadores unarios es para cambiar el valor de signo, mas por mas queda positivo
        //menos por menos queda positivo, mas por menos o menos por mas queda con valor negativo
        int j = +i; // j = (1)*i => -5   Es multiplicar +1 por el valor de i
        System.out.println("j = " + j);
        
        int k = -i; // k = (-1)*i => 5   Es multiplicar -1 por el valor de i
        System.out.println("k = " + k);

        i = 6;
        j = +i;
        System.out.println("j = " + j);//Es multiplicar valor de i=6 por +1, queda +6
        
        k = -i;
        System.out.println("k = " + k);//Es multiplicar valor de i=6 por -1, queda -6
    }
}
