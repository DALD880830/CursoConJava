import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try { //FileInputStream nos obliga a utilizar try-catch
            FileInputStream archivo = new FileInputStream("src/config.properties"); //Cargamos el archivo, en el argumento
            //pasamos la ruta del archivo

            Properties p = new Properties(System.getProperties()); //Agregamos el archivo a un objeto properties
            p.load(archivo); //Agregamos las nuevas configuraciones del archivo  Este tambien pide try catch pero podemos usar la clase generica de la excepcion
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");//Establecemos una configuracion con p.setProperty
            System.setProperties(p);//Establecemos una configuración en el sistema y en el argumento pasamos p que es la configuracion personalizada

            Properties ps = System.getProperties(); //Obtenemos las propiedades del sistema
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada")); //Imprimimos una configuracion del sistema especifica
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));

            ps.list(System.out); //Listamos las propiedades del sistema
        } catch(Exception e){ //Clase generica de la excepcion
            System.err.println("no existe el archivo = " + e); //Si no ecuentra el archivo, manda el mensaje de la excepcion err, lo marca en rojo
            System.exit(1); //Salimos de la aplicacion, sin error su valor es 0, cuando hay error su valor distinto de cero, 1 es cuando ocurre una excepcion
        }
    }
}
