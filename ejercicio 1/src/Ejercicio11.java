import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        int num1,num2,num3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("---numeros ordenadamente---");
        System.out.println("Ingresa el primer numero");
        num1 = scanner.nextInt();
        System.out.println("Ingresa el primer segundo");
        num2 = scanner.nextInt();
        System.out.println("Ingresa el primer tercer");
        num3 = scanner.nextInt();

        if (num1 < num2 && num1< num3 && num2<num3){
            System.out.println("El orden de los numero es el siguiente: "+ num1 + num2 + num3);
        } else if (num2 < num1 && num2<num3 && num1<num3) {
            System.out.println("El orden de los numero es el siguiente: "+ num2 + num1 + num3);
        } else if (num3<num1 && num3<num2 && num2<num1) {
            System.out.println("El orden de los numero es el siguiente: "+ num3 + num2 + num1);
        } else if (num2<num1 && num2<num3 && num3<num1) {
            System.out.println("El orden de los numero es el siguiente: "+ num2 + num3 + num1);
        }else if (num1<num2 && num1<num3 && num3<num2) {
            System.out.println("El orden de los numero es el siguiente: "+ num1 + num3 + num2);
        }
    }
}
