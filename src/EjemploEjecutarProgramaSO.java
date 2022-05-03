public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime(); //Metodo que permite ejecutar aplicaciones con el metodo exec
        Process proceso; //Cuando se ejecuta el programa, retorna un objeto del tipo Process

        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) { //Obtiene cual es el sistema operativo y se usa cuando es Windows
                proceso = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) { //Si no es Windows y es mac, pasa a aquí
                proceso = rt.exec("textedit");
            }else if (System.getProperty("os.name").toLowerCase().contains("nux") || //Para Linux, puede contener nux o nix
                    System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = rt.exec("gedit");
            }
            else {
                proceso = rt.exec("gedit"); //Si no es Windows y es Linux, se utiliza gedit para abrir el editor
            }
            proceso.waitFor(); //La aplicacion espera a que el proceso sea cerrado para continuar el flujo de la aplicacion
        } catch(Exception e){ //Usamos la excepeción generica
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1); //Salimos de la aplicacion
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
