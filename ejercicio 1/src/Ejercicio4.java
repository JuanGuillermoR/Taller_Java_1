import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        System.out.println("---Calculadora IMC---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu peso:");
        float peso = scanner.nextFloat();

        System.out.println("Ingresa tu altura:");
        float altura = scanner.nextFloat();
        float resultado = peso/(altura * altura);
        System.out.println("Tu IMC es de: " +resultado);

    }
}
