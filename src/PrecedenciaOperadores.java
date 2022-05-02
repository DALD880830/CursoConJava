public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3d; //3d es para indicar de que es un 3 double
        //Si no se colocan los parentesis i+j+k/3d, la expresión hará primero la división k/3d, es como poner i+j+(k/3d)
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3d * 10; // Esta expresión suma 45+8+20 luego divide entre 3 y el resultado lo multiplica por 10
        //Si no colocamos parentesis i+j+k/3d*10, la precedencia es hacer la multiplicacion o division, pero toma lo que aparezca primero a la izquierda,
        //entonces en este caso, primero hará la división 20/3 y después multiplicara 6.66*10 y posterior sumará 14+8+ el resultado de la multiplicacion
        System.out.println("promedio = " + promedio);

        promedio = --i + j++ + k / 3d * 10; // (13 + 8) + 66.6 Primero divide k/3 luego el resultado lo multiplica por 10, después decrementa i y lo suma,
        // luego suma el valor de j, sin el post incremento, porque ese va después
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
