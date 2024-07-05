import java.util.Scanner;

public class Ejercicio3 {
    public  static void main(String[] args){
        System.out.println("---Convertir de kilometros a millas---");
        System.out.println("---Ingresa los kilometros---");
        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();

        double mll = 1.60934;
        double total = km / mll;
        System.out.println("Este es el resultado de la conversion: "+ total);
        scanner.close();
    }
}
