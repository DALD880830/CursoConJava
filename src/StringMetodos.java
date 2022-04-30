import java.util.Locale;

public class StringMetodos {

    public static void main(String[] args) {

        String nombre = "Alejandro";
        System.out.println("nombre.length() = " + nombre.length());//Cantidad de caracteres
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());//Convierte a mayusculas
        System.out.println("nombre.toLowerCase( = " + nombre.toLowerCase());//Convierte a minusculas
        System.out.println("nombre.equals(\"Alejandro\") = " + nombre.equals("Alejandro"));//Compara y si es igual es true
        System.out.println("nombre.equals(\"alejandrO\") = " + nombre.equals("alejandrO"));//Compara pero es sensible a mayusculas y minusculas, por consiguiente es false
        System.out.println("nombre.equalsIgnoreCase(\"AlEjAnDrO\") = " + nombre.equalsIgnoreCase("AlEjAnDrO")); //Compara ignorando la sensibilidad a mayusculas y minusculas
        System.out.println("nombre.compareTo(\"Alejandro\") = " + nombre.compareTo("Alejandro"));//Otra forma de comparar, Si es Cero, entonces son iguales
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));//Nos da el caracter en la posicion que mandemos
        System.out.println("nombre.substring(4) = " + nombre.substring(4));//Desde un caracter en adelante los imprime
        System.out.println("nombre.substring(2, 6) = " + nombre.substring(2, 6));//Toma desde uno hasya otro, no incluyendo este último, o sea, el caracter 6 no lo incluye


        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.replace(\"a\", \"s\") = " + trabalengua.replace("a", "s"));//Reemplaza todos los caracteres de un tipo por otro nuevo
        System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a'));//Imprime la primera ocurrencia que encuentra y nos da la posicion si no lo encuentra nos da -1
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));//Nos da la posicion de la ultima ocurrencia del caracter si no lo encuentra nos da -1
        System.out.println("trabalengua.contains(\"l\") = " + trabalengua.contains("l"));//Puede ser un string, nos retorna un valor booleano, si lo encuentra true, si no nos da false
        System.out.println("trabalengua.startsWith(\"traba\") = " + trabalengua.startsWith("traba"));//Nos retorna un booleano si la palabra empieza con lo que se pide
        System.out.println("trabalengua.endsWith(\"guas\") = " + trabalengua.endsWith("guas"));//Nos retorna un booleano, si la palabra termina con lo que se pide
        System.out.println("   trabalenguas   ".trim());//Quita los espacios del inicio y los espacios del final


        //Ejemplo de obtener la extensión de un archivo o bueno, obtener los caracteres
        String archivo = "algun_documento.docx";
        System.out.println("archivo = " + archivo);
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo = " + archivo.substring(i+1));
        
        
        //Convertir un String en un arreglo de caracteres
        String computadora = "computadoras";
        System.out.println("computadora.toCharArray() = " + computadora.toCharArray());//Asi solo nos imprime el hash de la instancia

        char [] arreglo = computadora.toCharArray(); //Convertimos el String a un arreglo de caracteres
        int largo = arreglo.length;//Conseguimos el largo de la palbra
        System.out.println("largo = " + largo);//Imprimimos el largo de la palabra
        for(int j = 0; j < largo; j++){ //Imprimimos el arreglo de caracteres mediante un for
            System.out.print(" " + arreglo[j]);
        }

        System.out.println();
        System.out.println("computadora = " + computadora.split("o"));//Convertir un arreglo String con un parametro segun ena expresion . Imprime un hash

        String[] arregloDos = computadora.split("o");//La o funciona como separador del arreglo de String
        //Si en algun momento llegamos a utilizar un punto en vez de la o, como es reservado se debe escribir de la siguiente forma "[.]"
        int k = arregloDos.length;  //Nos da el largo del arreglo
        for (int l=0; l<k; l++){  //Imprime iterando las partes del arreglo
            System.out.println(arregloDos[l]);
        }
        
    }

}
