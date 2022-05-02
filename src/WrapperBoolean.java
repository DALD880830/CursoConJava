public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2; //Variables Objeto del tipo Integer
        num1 = 1;//Forma implicita
        num2 = 2;//Forma implicita

        boolean primBoolean = num1 > num2; //false
        Boolean objBoolean = Boolean.valueOf(primBoolean); //Forma explicita de convertir el Objeto Boolean a primitivo
        Boolean objBoolean2 = Boolean.valueOf("false"); //Se crea a partir de un string
        Boolean objBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        //No se comporta como los Integer aqui si compara su valor de true o false
        System.out.println("comparando dos objetos boolean: " + (objBoolean == objBoolean2));
        System.out.println("comparando dos objetos boolean: " + (objBoolean.equals(objBoolean2)));
        System.out.println("comparando dos objetos boolean: " + (objBoolean2 == objBoolean3));
        System.out.println("comparando dos objetos boolean: " + (objBoolean == objBoolean3));
        
        boolean primBoolean2 = objBoolean2.booleanValue();//Se retorna un tipo primitivo
        System.out.println("primBoolean2 = " + primBoolean2);
    }
}
