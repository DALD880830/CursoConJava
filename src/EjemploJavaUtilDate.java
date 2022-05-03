import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        
        Date fecha = new Date(); //Tipo Date, new Date es la instancia

        System.out.println("fecha = " + fecha); //La fecha la da en Día de la semana, Mes, Numero de día, Hora, Minuto, Segundo, ZonaHoraria Año

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM 'del' yyyy"); //Clase SimpleDateFormat
        //new SimpleDateFormat es la instancia, (en el argumento pasamos el formato que deseemos, aunque hay un estandar para formatos)
        //EEEE dia de la semana dd dia del mes MMMM mes en nombre completo yyyy año
        //HH hora mm minutos ss segundos z zona horaria
        String fechaStr = df.format(fecha);

        long j = 0;
        for(int i = 0; i < 100000000; i++){
            j +=i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime(); //getTime, obtiene el numero de milisegundos desde el 1 de julio de 1970
        //se hace la resta para calcular el tiempo en milisegundos en el que se realiza el for
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);
    }
}
