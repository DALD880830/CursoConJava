public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10, 11, 12};//Arreglo de enteros

        System.out.println("iniciamos el método main");
        for(int i = 0; i < edad.length; i++){ //i empieza en 0; hasta que i sea mayor que el largo del arreglo; i incrementa en 1
            System.out.println("edad[i] = " + edad[i]); //Mostramos cada valor del arreglo, aquí es 10, 11, 12
        }
        System.out.println("Antes de llamar al método test");

        test(edad);//pasamos el arreglo por referencia ya que es un objeto

        System.out.println("Después de llamar al método test");
        for(int i = 0; i < edad.length; i++){ //i empieza en 0; hasta que i sea mayor que el largo del arreglo; i incrementa en 1
            //Al pasarse por referencia, en este arreglo se mantienen los datos modificados en el metodo test
            System.out.println("edad[i] = " + edad[i]); //Se muestran los valores del arreglo que ya se modificó, aquí es 30, 31, 32
        }

        System.out.println("Finaliza el método main con los datos del arreglo modificados!");
    }

    public static void test(int[] edadArr){ //edadArr se convierte en el argumento del método
        System.out.println("Iniciamos el método test");
        for(int i = 0; i < edadArr.length; i++){ //i empieza en 0; hasta que i sea mayor que el largo del argumento del arreglo del metodo test; i incrementa en 1
            edadArr[i] = edadArr[i] + 20;//Los valores del nnuevo arreglo son los del inicio y se le suma 20 a cada uno
        }
        System.out.println("Finaliza el método test");
    }
}

