package Variables;

public class NumerosPrimitivos {

    public static void main(String[] args) {
        System.out.println("Clase nueva");

        byte numeroByte = 1; //-128 a 128
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MIN_VALUE);

        short numeroShort = 32767; //
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MIN_VALUE);

        int numeroInt = 50000; //
        System.out.println("numeroShort = " + numeroInt);
        System.out.println("Int.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Int.MAX_VALUE = " + Integer.MIN_VALUE);

        long numeroLong = 777777777; //
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MIN_VALUE);

        float numeroFloat = 3.1416f; // Para indicar que es Float, el numero debe terminar con f
        System.out.println("numeroShort = " + numeroFloat);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MIN_VALUE);
        float numeroFloat2 = 3.1416e3f;//
        float numeroFloat3 = 3.1416e-3f;//Punto se recorre a la izquierda
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("numeroFloat2 = " + numeroFloat2);


        double numeroDouble = 255.1578986583789456; //
        System.out.println("numeroSouble = " + numeroDouble);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MIN_VALUE);

        var numeroVar = 30081988;
        var numeroVar2 = 3.1416f;
        var numeroVar3 = 3.789456123d;
        System.out.println("numeroVar = " + numeroVar);
        System.out.println("numeroVar2 = " + numeroVar2);
        System.out.println("numeroVar3 = " + numeroVar3);
    }

}
