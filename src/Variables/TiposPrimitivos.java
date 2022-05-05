package Variables;

public class TiposPrimitivos {
    //Para crear el main puede ser con main + TAB o con psvm + TAB
    public static void main(String[] args) {

        //Tipos de datos en JAVA
        boolean a = true;
        boolean b = false;

        char d = 'a';
        char e = '1';
        char f = '\u0021'; //Este símbolo es !

        byte enteroByte = 127; //Entre -128 a 127  8bits
        short enteroShort = 32767; //Entre -32768 a 32767   16bits
        int enteroInt = 2147483647; //Entre -2147483648 a 2147483647   32bits
        long enteroLong = 9223372036854775807L; // Entre -9223372036854775808 a 9223372036854775807   64bits

        float realFloat = 3.1416f; //Lleva f para definir que es un float Va entre -1.4E-45 a 3.4028235E38
        double realDouble = 4.7029235E3; // La E es para determinar un exponente Va entre -4.9E-324 a 1.7976931348623157E308


    }

}
