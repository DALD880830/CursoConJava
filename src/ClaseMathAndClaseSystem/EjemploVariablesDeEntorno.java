package ClaseMathAndClaseSystem;

import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv(); //Arreglo del tipo Map, lleva elementos u objetos de cualquier tipo entre <>
        //y le damos un valor a ese mapa   .getenv Obtiene las variables de entorno del sistema
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        System.out.println("------ Listando variables de entorno del sistema ------");

        for(String key: varEnv.keySet()){ //key es la llave dentro del mapa varEnviroment  keySet retorna un conjunto con los nombres de llaves
            System.out.println(key + " => " + varEnv.get(key)); //Por cada nombre de llave, retornamos el valor
            //Imprime la variable de entorno y despues el key por ejemplo JAVA_HOME => C:\Program Files\Java\jdk-11.0.4
        }
        
        String username = System.getenv("USERNAME"); //Obtenemos una variable de entono especifica
        System.out.println("username = " + username);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);

        String appEnv = varEnv.get("APPLICATION_ENV");
        System.out.println("appEnv = " + appEnv);

        String hola = varEnv.get("SALUDAR_HOLA");
        System.out.println("hola = " + hola);
    }
}
