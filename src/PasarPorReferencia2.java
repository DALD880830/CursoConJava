class Persona { //lo ideal es crear esta clase en un archivo aparte, persona.java
    private String nombre;//private es el modificador de acceso, String es el tipo y Nombre
    //Al tener el acceso private, solo puede visualizarse en la clase Persona

    public void modificarNombre(String nuevoNombre){ //Método que permite modificar el nombre   (Tipo argumento)
        nombre = nuevoNombre; //aqui se omite this. siempre y cuando no exista otra variable o argumento que lleve el mismo nombre nuevoNombre
        //si el argumento fuera nombre, entonces seria this.nombre = nombre;
    }

    public String leerNombre(){ //Método que permite retornar el valor para que se pueda leer
        return this.nombre; //this. hace referncia a que es un objeto de esta clase
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona(); //Creamos un objeto de la clase persona
        //Este objeto persona y el del método test, apuntan al mismo puntero de la memoria, entonces son el mismo objeto
        persona.modificarNombre("Andrés");//Asignamos un nombre al objeto

        System.out.println("iniciamos el método main");

        System.out.println("persona.nombre = " + persona.leerNombre()); //Se imprime el nombre de la persona
        System.out.println("Antes de llamar al método test");

        test(persona); //Cambiamos el nombre del Objeto

        System.out.println("Después de llamar al método test");

        System.out.println("persona.nombre = " + persona.leerNombre()); //Se imprime el nuevo nombre de la persona

        System.out.println("Finaliza el método main con los datos de la persona modificados!");
    }

    public static void test(Persona persona){ //El objeto persona se pasa por argumento, el método test recibe el objeto persona (Objeto atributo)
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Pepe"); //Modificamos el nombre del objeto
        System.out.println("Finaliza el método test");
    }
}

