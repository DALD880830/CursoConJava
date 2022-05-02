import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        
        String texto = "Hola que tal!";
        
        Class strClass = texto.getClass();//Retorna instancia del tipo Class, redescubrimos la estructura interna del objeto o clase

        System.out.println("strClass.getName() = " + strClass.getName());//Muestra el nombre de la clase incluyendo el package
        System.out.println("strClass.getName() = " + strClass.getSimpleName());//Muestra el nombre de la clase
        System.out.println("strClass.getName() = " + strClass.getPackageName());//Muestra el package de la clase
        System.out.println("strClass.getName() = " + strClass);//Antepone la palabra class y da el nombre completo incluyendo package
        
        for(Method metodo: strClass.getMethods()){ //Los métodos se obtienen con un arreglo
            System.out.println("metodo.getName() = " + metodo.getName()); //Retorna todos los metodos de la clase String
        }
        
        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();//Clase padre Object
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass());//Nombre de la clase Number padre más el package
        System.out.println("intClass.getSuperclass().getSuperclass() = " + objClass);//Clase padre Object

        for(Method metodo: objClass.getMethods()){ //Muestra todos los métodos de la clase Object
            System.out.println("metodo.getName() = " + metodo.getName());
        }

    }
}
