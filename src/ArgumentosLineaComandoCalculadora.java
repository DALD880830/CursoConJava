public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {

        if(args.length != 3){ //Validamos que el numero de argumentos ingresados sean 3, si son más argumentos
            // se mandará el mensaje de error y sale de la aplicacion
            System.err.println("Por favor ingresar una operación " +
                    "(suma, resta, div o multi) y dos enteros");
            System.exit(-1);
        }

        String operacion = args[0]; //El primer parametro se obtiene del indice 0 del arreglo
        int a = 0; //Inicializamos a
        int b = 0; //Inicializamos b
        double resultado = 0.00; //Obtenemos el resultado

        try {
            a = Integer.parseInt(args[1]); //El segundo parametro esta en el indice 1 del arreglo
            b = Integer.parseInt(args[2]); //El tercer parametro esta en el indice 2 del arreglo
        } catch (NumberFormatException e){ //Manejo de excepcion si el usuario ingresa un numero que no sea entero
            System.err.println("Cuidado a y b deben ser enteros, vuelva a intentar!");
            System.exit(-1); //Salimos de la aplicación
        }
        switch(operacion){
            case "suma": //Caso suma
                resultado = a+b;
                break;
            case "resta": //Caso resta
                resultado = a-b;
                break;
            case "multi": //Caso multiplicacion
                resultado = a*b;
                break;
            case "div": //Caso division
                if(b == 0){ //Si es cero, mandará mensaje de error y saldrá de la aplicacion
                    System.err.println("No se puede dividir por zero!");
                    System.exit(-1);
                }
                resultado = (double)a/b; //Para obtener el valor con precision uno de los dos valores debe convertirse en un double
                break;
            default:
                resultado = a+b; //Si no se aplica ninguno, por defecto los valores su sumaran
        }

        System.out.println("Resultado de la operación '" + operacion + "' es: " +resultado); //Imprimimos el resultado de la operacion
    }

    //Para compilar con línea de comando:
    // 1. Debemos abrir una terminal
    // 2. Nos debemos colocar en la carpeta del proyecto
    // 3. Usamos el comando javac para compilar javac nombredelarchivo.java -encoding utf8
    //Para iniciar el programa colocamos:
    // 4. java nombredelarchivo Argumento1(suma resta multi div) Argumento2 Argumento3

}
