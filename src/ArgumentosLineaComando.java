public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if(args.length == 0){ //Si el numero de argumentos es 0 pedirá al usuario que ingrese datos y cerrará la aplicacion
            System.out.println("Debe ingresar argumentos o parámetros!");
            System.exit(-1);
        }
        for(int i = 0; i < args.length; i++){ //Recorre los argumentos que se ingresen para mostrarlos en pantalla
            System.out.println("Argumentos nº " + i + ": " + args[i]);
        }

        //Para compilar con línea de comando:
        // 1. Debemos abrir una terminal
        // 2. Nos debemos colocar en la carpeta del proyecto
        // 3. Usamos el comando javac para compilar javac nombredelarchivo.java -encoding utf8
        //Para iniciar el programa colocamos:
        // 4. java nombredelarchivo Argumento1 Argumento2 Argumento3

    }
}
