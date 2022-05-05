package Variables;

public class CaracteresPrimitivos {

    public static void main(String[] args) {

        char caracter = 'A';
        System.out.println("caracter = " + caracter);
        char caracterunicode = '\u0040';//Caracter con codigo Unicode
        char caracterdecimal = 55;//Caracter con codigo decimal
        System.out.println("caracterunicode = " + caracterunicode);
        System.out.println("caracterdecimal = " + caracterdecimal);

        char caracter2 = 'B';
        char espacio = ' ';//Podemos usar char para realizar un espacio
        char retroceso = '\b';// Borra el caracter anterior
        char tabulador = '\t';// Da un espacio de tabulador
        char saltoLinea = '\n';// Salto de linea
        char retornoCarro = '\r';// Da un retorno de carro
        System.out.println("caracter =" +espacio + caracter2); // Concatena un espacio al String con el Caracter
        System.out.println("caracter = " + System.lineSeparator() + caracter);//Hay metodos de sistema para dar saltos de linea

    }

}
