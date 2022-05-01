public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;//Operador de asignacion, asigna un valor
        int j = i + 4;//Asignamos el valor de i+4 a la variable j
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Operadores combinados o compuestos
        i += 2; // i = i + 2
        System.out.println("i = " + i);//i cambia su valor a 7

        i += 5; // i = i + 5
        System.out.println("i = " + i);//i ya tiene valor de 7 y ahora será de 12
        
        j -= 4; // j = j - 4
        System.out.println("j = " + j);//j tiene el valor del i inicial + 4, entonces es 9, menos el
                                        //operador combinado, j ahora tendrá valor de 5
        
        j *= 3; // j = j * 3;
        System.out.println("j = " + j);//j ya tiene valor de 5 y ahora será 15
        
        String sqlString = "select * from clientes as c";//String inicial
        sqlString += " where c.nombre='Andres' ";//agregramos o concatenamos al string anterior
        sqlString += " and c.activo=1";//volvemos a agregar o concatenar al string
        System.out.println("sqlString = " + sqlString);//Es un ejemplo de hacer un string para una consulta sql
    }
}
