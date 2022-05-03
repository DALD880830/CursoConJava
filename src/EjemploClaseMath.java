public class EjemploClaseMath {
    public static void main(String[] args) {

        //La clase Math es una clase que no se puede instanciar al igual que la clase System, ya que son métodos estáticos

        int absoluto = Math.abs(-3); //Math.abs() Es para retornar el valor absoluto de un numero, en donde no importa el signo
        System.out.println("absoluto = " + absoluto);
        
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.5, 1.2); //Math.max() retorna el mayor entre dos numeros
        System.out.println("max = " + max);
        
        double min = Math.min(3.5, 1.2);//Math.min() retorna el menor entre dos numeros
        System.out.println("min = " + min);
        
        double techo = Math.ceil(3.5); //Math.ceil() redondea el valor hacia arriba, entonces retorna 4
        System.out.println("techo = " + techo);
        
        double piso = Math.floor(3.5); //Math.floor() redondea el valor hacia abajo, entonces retorna 3
        System.out.println("piso = " + piso);
        
        long entero = Math.round(Math.PI); //Math.round() redondea el valor, puede ser hacia arriba o hacia abajo, segun sea el valor, Math.PI muestra el valor de Pi
        System.out.println("entero = " + entero);
        
        double exp = Math.exp(1); //Math.exp() Tiene como constante la variable e (2.718281828459045...) y exp es el exponente que se le realizará
        System.out.println("exp = " + exp);
        
        double log = Math.log(10); //Math.log() Es el Logaritmo natural
        System.out.println("log = " + log);
        
        double potencia = Math.pow(10, 3); //Math.pow() Potencia, 10 elevado a la potencia 3
        System.out.println("potencia = " + potencia);
        
        double raiz = Math.sqrt(5); //Math.sqrt() Raiz cuadrada
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57); //Math.toDegrees() Convertimos un angulo de Radianes a Grados
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00); //Math.toRadians() Convertimos un angulo de Grados a Radianes
        System.out.println("convertir de grados a radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes)); //Math.sin() Retorna el seno, sin() recibe el valor en radianes
        System.out.println("cos(90): " + Math.cos(radianes)); //Math.cos() Retorna el coseno, cos() recibe el valor en radianes

        radianes = Math.toRadians(180.00); //Convertimos a radianes y en la siguiente instrucción obtenemos el coseno
        System.out.println("cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00); //Convertimos a radianes y en la siguiente instrucción obtenemos el coseno
        System.out.println("cos(0): " + Math.cos(radianes));

    }
}
