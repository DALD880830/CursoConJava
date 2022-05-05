package Variables;

public class SistemasNumericosUno {

    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        //Metodos de Integer para convertir los numeros a binario
        System.out.println("numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        //Metodos de Integer para convertir los numeros a octal
        System.out.println("numero octal de = " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);
        //Metodos de Integer para convertir los numeros a Hexadecimal
        System.out.println("numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

    }

}
