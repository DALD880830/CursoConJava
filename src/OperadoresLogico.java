public class OperadoresLogico {
    public static void main(String[] args) {
        
        int i = 3;
        byte j = 3;
        float k = 127e-4f;//0.0127
        double l = 2.1413e3;//2141.3
        boolean m = false;
        
        boolean b1 = i == j && k < l && m == false;//Con AND ambos deben ser verdaderos
        //Si la primera es falsa la segunda ya no se evalua, si la primera es verdadera entonces
        //ya evalúa la segunda condicion, si esta es verdadera, entonces evalua la tercera
        System.out.println("b1 = " + b1);
        
        boolean b2 = i == j || k < l;//Al menos una debe ser true, si la primera es true, ya no es
        //necesario que se evalúe la segunda condicion
        System.out.println("b2 = " + b2);
        
        boolean b3 = i == j && (k < l || m == true);//Con los parentesis cambia la precedencia
        //Primero evalua el OR y despues evalua el AND. En el OR al menos una de las dos debe ser true
        //Despues ya evalua con el AND
        System.out.println("b3 = " + b3);

        //El AND siempre tendrá una precedencia mayor que el OR, entonces siempre se evalúa primero
        //el AND y despues se evalua el OR
        
        boolean b4 = (i == j || k < l) && m == true;//Primero se evalua lo que esta entre parentesis
        //por la precedencia, despues se evalua el AND
        System.out.println("b4 = " + b4);
        
        boolean b5 = (true || true) && false;//Evalua true OR true, el resultado es true, despues
        //evalua true AND false, entonces el resultado es false
        System.out.println("b5 = " + b5);
        
        boolean b6 = true || false && false || false; //Primero se evalua false && false, despues va
        //true OR false de la izquierda, el resultado de eso que es true se evalua con el ultimo
        //false de la derecha, entonces el resultado es true
        System.out.println("b6 = " + b6);

        boolean b7 = ((true || false) && false) || false; //Primero se evalua el true OR false, despues
        //se evalua el resultado (true) con el && false y al final se evalua el resultado (false)
        // con el OR false de la derecha
        System.out.println("b7 = " + b7);
        

    }
}
