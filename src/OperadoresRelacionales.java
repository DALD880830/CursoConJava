public class OperadoresRelacionales {
    public static void main(String[] args) {
        
        int i = 3;
        byte j = 7;
        float k = 127e-4f;//0.0127
        double l = 2.1413e3;//2141.3
        boolean m = false;
        
        boolean b1 = i == j;//i es igual a j, 3 no es igual 7
        System.out.println("b1 = " + b1);
        
        boolean b2 = !b1;//Invertimos el valor booleano de false a true
        System.out.println("b2 = " + b2);
        
        boolean b3 = i != j; // <>  Si i es diferente de j retorna true
        System.out.println("b3 = " + b3);
        
        boolean b4 = m == true;//Compara el valor de la variable, true no es igual a false
        System.out.println("b4 = " + b4);

        boolean b5 = m != true;//Compara el valor de la variable, true es diferente de false
        System.out.println("b5 = " + b5);
        
        boolean b6 = i > j;//Verifica si i es mayor de j, retorna false porque 3 no es mayor que 7
        System.out.println("b6 = " + b6);
        
        boolean b7 = j < i;//Verifica si j es menor de i, retorna false porque 7 no es menor que 3
        System.out.println("b7 = " + b7);
        
        boolean b8 = (l >= k);//Mayor o igual l es mayor que k 2mil es mayor a 0.01
        System.out.println("b8 = " + b8);
        
        boolean b9 = l <= k;//Menor o igual l es menor que k 2mil no es menor a 0.01
        System.out.println("b9 = " + b9);

        System.out.println("l = " + l);
        System.out.println("k = " + k);


    }
}
