import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3]; //String [] con eso se define que ese tipo es un arreglo, dentro del parentesis
        va el numero de elementos que contendrá [3] es igual a 0, 1 y 2

        usernames[0] = "andres"; //usernames indica en donde lo va a guardar y dentro de [] la posicion en lo que lo guardara
        passwords[0] = "12345"; //passwords indica en donde lo va a guardar y dentro de [] la posicion en lo que lo guardara

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";*/
        String[] usernames = {"andres", "admin", "pepe"}; //Con llaves tambien se hacen los arreglos y es mas simple
        String[] passwords = {"123", "1234", "12345"};

        /*Si no se utilizara el arreglo, tendrían que agregarse 3 o 5 o 10 OR por ejemplo, para dos OR quedaría
         if ( (username.equals(u) && password.equals(p)) || (username2.equals(u) && password2.equals(p) )
         entonces es si username es true y password es true avanzar, si uno de los dos es falso, verifica el siguiente,
         si username2 es true Y password2 es true avanza, eventualmente si la primera verificación avanza ya no es necesario
         realizar la segunda verificacion */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();//Capturamos el username que nos da el usuario

        System.out.println("Ingrese el password");
        String p = scanner.next();//Capturamos el password que nos da el usuario

        boolean esAutenticado = false;//Valor que se coloca por defecto

        for(int i = 0; i < usernames.length; i++){ //i empieza en 0, iterará mientras i sea menor a la cantidad de elementos, i incrementerá en 1
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true: esAutenticado;//Para comparar
            //strings se utiliza equals, y usamos AND para verificar, si username es true Y password es true avanza

            /*if( (usernames[i].equals(u) && passwords[i].equals(p)) ){  //
                esAutenticado = true;
                break; //Salimos del FOR
            }*/
        }//No se maneja else porque si no encuentra usuario, el codigo de else lo repetiria varias veces

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") :
                "Username o contraseña incorrecto!\nLo sentimos, requiere autenticación";
        System.out.println("mensaje = " + mensaje);

        /*if(esAutenticado){ //Aqui va el código privado al iniciar sesion
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else { //Aqui va código público para indicar diferentes cosas si no es correcta la autenticación
            System.out.println("Username o contraseña incorrecto!");
            System.out.println("Los siento, requiere autenticación");
        }*/
    }
}
