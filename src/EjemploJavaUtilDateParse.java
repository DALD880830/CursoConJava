import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); //Damos un formato a la fecha
        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");

        //Convertimos un String en fecha
        try { //Es neceario el uso de try-catch en estos casos de pasar un string a fecha para el manejo de excepciones
            Date fecha = format.parse(s.next());//Obtenemos el String del usuario y se convierte en formato de fecha
            System.out.println("fecha = " + fecha); //Se imprime la fecha sin formato
            System.out.println("format = " + format.format(fecha)); //Se imprimer la fecha con el formato que establecimos
            
            Date fecha2 = new Date(); //Nueva fecha, es la fecha actual
            System.out.println("fecha2 = " + fecha2);

            if(fecha.after(fecha2)){ //Si la fecha que nos da el usuario es despues que la fecha actual
                System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
            } else if(fecha.before(fecha2)){ //Si la fecha que nos da el usuario es antes que la fecha actual
                System.out.println("fecha es anterior que fecha2");
            } else if(fecha.equals(fecha2)){ //Si la fecha que nos da el usuario es igual que la fecha actual
                System.out.println("fecha es igual a fecha2");
            }

            // ,compareTo también funciona para comparar fechas
            if(fecha.compareTo(fecha2) > 0){ // Si retorna mayor que cero es despues de la fecha actual
                System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
            } else if(fecha.compareTo(fecha2) < 0){ // Si retorna menor que cero es antes de la fecha actual
                System.out.println("fecha es anterior que fecha2");
            } else if(fecha.compareTo(fecha2) == 0){ // Si retorna igual a cero es antes de la fecha actual
                System.out.println("fecha es igual a fecha2");
            }

            
        } catch (ParseException e) { //manejo de la excepcion si el usuario da algo que no es una fecha
            //e.printStackTrace();
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage()); //Se menciona que el formato está mal y con e.getMessage() obtenemos el String que el usuario ingreso
            System.err.println("El formato debe ser 'yyyy-MM-dd'"); // Reiteramos el formato que se debía ingresar
            System.exit(1); //En vez de volver a iniciar el main, salimos de la aplicacion
            //main(args);
        }
    }
}
