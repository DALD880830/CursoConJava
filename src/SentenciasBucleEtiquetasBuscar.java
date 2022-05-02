public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxPalabra = palabra.length(); //Obtiene el largo de la palabra
        int maxFrase = frase.length() - maxPalabra; //Obtiene el largo de la frase menor el largo de la palabra

        int cantidad = 0;
        char letra = 'g';
        buscar: //Etiqueta del for padre
        for(int i = 0; i <= maxFrase;){ //Recorre cada caracter de la frase
            int k = i; //k va a tomar el valor de i actual para evitar interrumpir el for principal
            for(int j = 0; j < maxPalabra; j++) { //Recorre la palabra
                if (frase.charAt(k++) != palabra.charAt(j)) { //Si k coincide, continua en este for y no se va al continue del for padre
                    i++; //Cada que charAt se de, entonces se incrementa el i
                    continue buscar; //Continua en el for padre
                }
            }
            cantidad++;
            i = i + maxPalabra; //El i comienza despues de la palabra encontrada
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '"+palabra+"' en la frase");
    }
}
