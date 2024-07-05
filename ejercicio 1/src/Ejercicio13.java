import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        /*
        Desarrolla un programa que calcule el costo de un viaje en taxi basándose en la distancia del viaje
        (en kilómetros) y la tarifa base. Puedes añadir una tarifa adicional por kilómetro recorrido. El
        usuario debe ingresar la distancia del viaje.
         */
        int tarifaBase, km, total;

        System.out.println("---Consultar la tarifa del viaje---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa los km recorridos durante el viaje");
        km = scanner.nextInt();
        tarifaBase = 5700;
        total = tarifaBase+(km*500);
        System.out.println("El viaje tiene un costo de: "+ total +" Esta valor ya incluye la tarifa base: "+tarifaBase);
        scanner.close();
    }
}
