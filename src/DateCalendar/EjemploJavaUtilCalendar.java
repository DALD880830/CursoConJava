package DateCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance(); //No se puede crear la instancia con el operador new en esta clase en especifico

        //calendario.set(2019, Calendar.SEPTEMBER, 25, 18, 20, 10);
        calendario.set(Calendar.YEAR, 2020); //Con .set establecemos una fecha específica, aqui indicamos un año
        calendario.set(Calendar.MONTH, Calendar.MARCH); //Aquí establecemos el mes
        calendario.set(Calendar.DAY_OF_MONTH, 25); //Establecemos el día

        //calendario.set(Calendar.HOUR_OF_DAY, 21); //Así asignamos la hora en formato 24hrs
        calendario.set(Calendar.HOUR, 7); //Establecemos una hora especifica
        calendario.set(Calendar.AM_PM, Calendar.PM); //Establecemos el formato de am o pm
        calendario.set(Calendar.MINUTE, 20); //Establecemos un minuto
        calendario.set(Calendar.SECOND, 10); //Establecemos segundos
        calendario.set(Calendar.MILLISECOND, 125); //Establecemos milisegundos

        Date fecha = calendario.getTime(); //Retorna la fecha actual si no customizamos con .set, al customizar, la fecha cambia
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a"); //Damos el formato que queremos a la fecha creada
        String fechaConFormato = formato.format(fecha); //se pasa el objeto Date
        System.out.println("fecha Con Formato = " + fechaConFormato);


        //Comparamos la fecha ingresada con la fecha actual
        Calendar calActual = Calendar.getInstance(); //Obtenemos la fecha actual
        Date fecha2 = calActual.getTime();

        if(fecha.after(fecha2)){ //Si la fecha que nos da el usuario es despues que la fecha actual
            System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
        } else if(fecha.before(fecha2)){ //Si la fecha que nos da el usuario es antes que la fecha actual
            System.out.println("fecha es anterior que fecha2");
        } else if(fecha.equals(fecha2)){ //Si la fecha que nos da el usuario es igual que la fecha actual
            System.out.println("fecha es igual a fecha2");
        }

        if(fecha.compareTo(fecha2) > 0){ // Si retorna mayor que cero es despues de la fecha actual
            System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
        } else if(fecha.compareTo(fecha2) < 0){ // Si retorna mayor que cero es antes de la fecha actual
            System.out.println("fecha es anterior que fecha2");
        } else if(fecha.compareTo(fecha2) == 0){ // Si retorna mayor que cero es igual de la fecha actual
            System.out.println("fecha es igual a fecha2");
        }

    }
}
