import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        System.out.println("---Ingresa un número entero cualquiera para su clasificación---");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0){
            System.out.println("el número es negativo");
        } else if (number > 0) {
            System.out.println("el número es positivo");
        }else{
            System.out.println("el número es neutro");
        }
    }
}
