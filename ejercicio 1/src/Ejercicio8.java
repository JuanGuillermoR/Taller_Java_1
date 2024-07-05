import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        System.out.println("---Promedio de un alumno---");
        float note1,note2,note3;
        double total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa la primera nota");
        note1 = scanner.nextFloat();
        System.out.println("ingresa la segunda nota");
        note2 = scanner.nextFloat();
        System.out.println("ingresa la tercera nota");
        note3 = scanner.nextFloat();

        total = (note1+note2+note3)/3;
        System.out.println("el promedio del alumno es: " +total);
    }
}
