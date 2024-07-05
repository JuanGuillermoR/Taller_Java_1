import java.util.Scanner;

public class Ejercicio14 {
    /*Crea un programa que convierta temperaturas entre grados Celsius y Fahrenheit. El usuario debe
    poder elegir si quiere convertir de Celsius a Fahrenheit o viceversa, y luego ingresar la temperatura.
    Utiliza la fórmula C = (F - 32) * 5/9 para Fahrenheit a Celsius y F = C * 9/5 + 32 para Celsius a
    Fahrenheit.*/

    public static void main(String[] args){
        int celsius, fahrenheit, opcion, resultado;
        System.out.println("---Convertir grados---");
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. De Celsius a Fahrenheit");
            System.out.println("2. De Fahrenheit a Celsius");
            System.out.println("3. Salir ");
            System.out.print("Elija una opción: ");

            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese los grados celsius");
                    celsius = scanner.nextInt();
                    resultado = celsius * 9/5 + 32;
                    System.out.println("los grados celsius a Fahrenheit es: "+resultado);
                    break;
                case 2:
                    System.out.println("Ingrese los grados Fahrenheit");
                    fahrenheit = scanner.nextInt();
                    resultado = (fahrenheit -32) * 5/9;
                    System.out.println("los grados celsius a Fahrenheit es: "+resultado);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        }while (opcion!=3);
    }
}
