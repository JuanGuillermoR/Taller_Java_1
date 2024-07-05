import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args){
        System.out.println("---Ingresa tu edad---");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18){
            System.out.println("eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }
        scanner.close();
    }
}
