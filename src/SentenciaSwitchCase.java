import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el número del mes entre 1 - 12:");
        int mes = s.nextInt(); // Captura el numero de mes que da el usuario
        String nombreMes = null;
        
        switch(mes){
        
            case 1: //Si el numero ingresado int coincide con 1, entonces realiza la instruccion
                nombreMes = "Enero";
                break; // break nos permite salir del switch y que no se brinque al siguiente case, ya que si no
                        // hubiera break, entonces al meter el 1 nos marcaria que el mes 1 es febrero
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default: //Si el dato ingresado no coincide con ninguno de los casos, se realiza el default
                nombreMes = "Indefinido";
        }

        System.out.println("nombreMes = " + nombreMes);

        char num = 'A';

        switch(num){
            case '0':
                System.out.println("El num es cero");
                break;
            case '1':
                System.out.println("El num es uno");
                break;
            case '2':
                System.out.println("El num es dos");
                break;
            case '3':
                System.out.println("El numero es tres");
                break;
            case 'a':
                System.out.println("El caracter es a");
                break;
            default:
                System.out.println("Número o caracter desconocido");
        }

        String nombre = "Admin";

        switch(nombre){
            case "admin": //También se puede realizar con String, aunque es sensible a mayusculas y minusculas
                System.out.println("Hola admin, bienvenido!");
                break;
            case "andres":
                System.out.println("Hola andres!");
                break;
            case "pepe":
                System.out.println("Hola pepe");
                break;
            default:
                System.out.println("Usuario desconocido!");
        }

        
    }
}
