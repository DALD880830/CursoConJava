public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo); //Forma explicita de crear un objeto del tipo integer
                                                        //toma la literal y la convierte en un objeto
        Integer intObjeto2 = intPrimitivo; //Forma implicita de crear un objeto del tipo integer
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto; //Toma el objeto Integer y lo convierte en un entero primitivo Forma implicita
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); //Toma el objeto Integer y lo convierte en un entero primitivo Forma explicita
        System.out.println("num2 = " + num2);
        
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd); //Convertimos el String en un valor entero
        System.out.println("valor = " + valor);
        
        Short shortObjeto = intObjeto.shortValue();//Convertimos el Objeto Integer en un valor Short, aunque hay perdida de informacion
        System.out.println("shortObjeto = " + shortObjeto);
        
        Byte byteObjeto = intObjeto.byteValue();//Convertimos el Objeto Integer en un valor Byte, aunque hay perdida de informacion
        System.out.println("byteObjeto = " + byteObjeto);
        
        Long longObjeto = intObjeto.longValue(); //Convertimos el Objeto Integer en un valor Long, aunque hay perdida de informacion
        System.out.println("longObjeto = " + longObjeto);

    }
}
