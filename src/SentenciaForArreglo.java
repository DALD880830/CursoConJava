import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"}; //Arreglo de nombres
        int count = nombres.length; //Se obtiene la cantidad de elementos del arreglo
        for(int i = 0; i < count; i++){
            if(nombres[i].toLowerCase().contains("MARIA".toLowerCase()) || //Primero convierte los nombres a minuscula,
                    //despues verifica si contiene el nombre MARIA el cual lo convierte a minuscula
                    nombres[i].toLowerCase().contains("bEa".toLowerCase())){ //Primero convierte los nombres a minuscula,
                //despues verifica si contiene el nombre pePa el cual lo convierte a minuscula
                continue; //Si contiene un nombre o el otro nombre lo brinca y continua la iteracion
            }
            System.out.println( i + ".- " + nombres[i]);
        }
        
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Maria\" o \"Pato\":"); // \" Para mostrar las comillas
        System.out.println("buscar = " + buscar); //Imprime el nombre que buscamos

        boolean encontrado = false; //Si encuentra el nombre el valor cambia a true
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){ //Los nombres de los arreglos los compara con el nombre ingresado ignorando
                //si está en mayusculas o minusculas
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]); //Imprime todos los nombres que estan antes del buscado
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
        }
    }
}
