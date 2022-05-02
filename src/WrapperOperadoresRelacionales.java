public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000); //Objeto Integer forma explicito
        Integer num2 = num1; //Objeto Integer forma implicita

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 1000; //A num2 se le asigna otro objeto, la clase Wrapper compara por objeto y no por valor

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2)); //Contiene el mismo valor pero no es la misma instancia

        System.out.println("tienen el mismo valor? " + (num1.equals(num2)));//Con el metodo equals compara por valor
        System.out.println("tienen el mismo valor? " + (num1.intValue() == num2.intValue()));//Convertimos ambos a primitivos y ya se compara por valor

        //Cabe señalar, que Java compara por valor hasta antes de 128, o sea, de 128 hacia arriba ya no compara por valor sino por objeto

        num2 = 500;
        boolean condicion = num1 > num2; //Cuando se usa > >= < <= al igual que los operadores aritmeticos + - * / % tambien
        //se puede trabajar con objetos de referencia, ya que hace un auto unboxing o sea, hace una auto conversion de objeto a primitivo
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);
    }
}
