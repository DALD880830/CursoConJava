import javax.swing.*;

public class SistemasNumericosDos {

    public static void main(String[] args) {

            String numeroStr = JOptionPane.showInputDialog(null, "Ingrese numero entero");
            int numeroDecimal = 0;
            try{ //Intenta hacer la siguiente linea
                numeroDecimal = Integer.parseInt(numeroStr);
            }catch (NumberFormatException e){ //
                JOptionPane.showMessageDialog(null, "Introduce un numero entero");
                main(args);
                System.exit(0);
            }
            System.out.println("numeroDecimal = " + numeroDecimal);

            String resultadoBinario = "numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            System.out.println(resultadoBinario);

            int numeroBinario = 0b111110100;
            System.out.println("numeroBinario = " + numeroBinario);

            String resultadoOctal = "numero octal de = " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal);
            System.out.println(resultadoOctal);
            int numeroOctal = 0764;
            System.out.println("numeroOctal = " + numeroOctal);

            String resultadoHexadecimal = "numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
            System.out.println(resultadoHexadecimal);

            int numeroHex = 0x1f4;
            System.out.println("numeroHex = " + numeroHex);

            String mensaje =resultadoBinario;
            mensaje += "\n" + resultadoOctal;
            mensaje += "\n" + resultadoHexadecimal;

            JOptionPane.showMessageDialog(null, mensaje);


        }

}
