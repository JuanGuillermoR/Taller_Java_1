import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        double tip;
        double subtotal;
        double total;

        System.out.println("---Calculadora de propinas---");
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Ingresa el total de la cuenta");
        subtotal = scanner.nextInt();

        System.out.println("Ingresa el porcentaje de la propina");
        tip = scanner.nextInt();

        total = (tip / 100.0)*subtotal;
        System.out.println("la cantidad de propina a dejar es de: " +total);

    }
}
