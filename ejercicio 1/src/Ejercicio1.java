import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ejecicio 1");
        System.out.println("---------calculadora---------");
        System.out.println("ingresa el primer numero");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("el número ingresado fue: "+num1);
        scanner.nextLine();

        System.out.println("ingresa el segundo número");
        int num2 = scanner.nextInt();
        System.out.println("el número ingresado fue: "+num2);

        int sum = num1 + num2;
        int rest = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;

        System.out.println("La suma de los dos números es: "+sum);
        System.out.println("La resta de los dos números es: "+rest);
        System.out.println("La multiplicación de los dos números es: "+multi);
        System.out.println("La división de los dos números es: "+div);
        scanner.close();
    }
}