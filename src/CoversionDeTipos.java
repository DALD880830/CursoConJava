public class CoversionDeTipos {

    public static void main(String[] args) {

        //String A Int
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        //String a Double
        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        //String a boolean
        String logicoStr = "true"; //Puede estar en mayuscula o minuscula True o False
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);


        //De aqui hacia abajo son datos a Strings
        int otroInt = 100;
        System.out.println("otroInt = " + otroInt);

        String otronumeroStr = Integer.toString(otroInt);
        System.out.println("otronumeroStr = " + otronumeroStr);

        otronumeroStr = String.valueOf(otroInt+10);
        System.out.println("otronumeroStr = " + otronumeroStr);

        double otroRealDouble = 1.12346789e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        //Hasta aqui la conversion de los diferentes tipos a Strings

        //De aqui a los que sobran son de primitivos a primitivos cuando sean compatibles
        int i = 10000;
        short s = (short)i;//Forzamos la conversion se llama "CAST", si colocamos un numero mayor al que soporte habrá perdida de informacion
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        float f = (float)i;
        System.out.println("f = " + f);

    }

}
