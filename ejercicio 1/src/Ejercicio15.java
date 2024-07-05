import java.util.Scanner;

public class Ejercicio15 {
    /*Implementa un programa que le pida al usuario la calificación de un examen (0-100). Basado en la
    calificación, el programa debe mostrar una letra (A, B, C, D, F), donde A es 90-100, B es 80-89,
    etc. Considera utilizar if o switch.*/
    public static void main(String[] args){
        int calificacion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual fue tu calificación?");
        calificacion = scanner.nextInt();

        if (calificacion >=90 && calificacion<=100){
            System.out.println("tienes una calificación A");
        } else if (calificacion >=80 && calificacion<=89) {
            System.out.println("tienes una calificación B");
        } else if (calificacion >=70 && calificacion<=79) {
            System.out.println("tienes una calificación C");
        } else if (calificacion >=60 && calificacion<=69) {
            System.out.println("tienes una calificación D");
        } else if (calificacion >=50 && calificacion<=59) {
            System.out.println("tienes una calificación E");
        } else if (calificacion >=40 && calificacion<=49) {
            System.out.println("tienes una calificación F");
        } else if (calificacion >=30 && calificacion<=39) {
            System.out.println("tienes una calificación G");
        } else if (calificacion >=20 && calificacion<=29) {
            System.out.println("tienes una calificación H");
        }else if (calificacion >=10 && calificacion<=19) {
            System.out.println("tienes una calificación I");
        }else{
            System.out.println("Calificacón no valida");
        }

    }
}
