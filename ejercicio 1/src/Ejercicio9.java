import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        System.out.println("---Calculadora del año bisiesto---");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el año a consultar bisiesto");
        int consultar = scanner.nextInt();

        if ((consultar % 4 == 0 && consultar % 100 != 0) || (consultar % 100 == 0 && consultar % 400 == 0)) {
            System.out.println("El año " + consultar + " es bisiesto");
        }else{
            System.out.println("El año " + consultar + " no es bisiesto");
        }
    }
}
