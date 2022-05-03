import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        String username = System.getProperty("user.name"); //Obtenemos el username del equipo que usamos
        System.out.println("username = " + username);
        
        String home = System.getProperty("user.home"); //Obtenemos el home del usuario que estamos utilizando en el equipo
        System.out.println("home = " + home);
        
        String workspace = System.getProperty("user.dir"); //Obtenemos el directorio en el que se encuentra el proyecto que usamos
        System.out.println("workspace = " + workspace);
        
        String java = System.getProperty("java.version"); //Obtenemos la version de Java que usamos
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator"); //Salto de línea
        String lineSeparator2 = System.lineSeparator();//Salto de línea
        System.out.println("lineSeparator:" + lineSeparator2 + "Una línea nueva ...");

        Properties p = System.getProperties(); //Listamos todas las propiedades del sistema
        p.list(System.out); //El metodo list obtiene por argumento la instancia del tipo print string
    }
}
