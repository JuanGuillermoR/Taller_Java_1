import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion, num1, num2, sum, rest, multi, div;

        do {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Sumar");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");

            opcion = scanner.nextInt();
            if (opcion != 5){
                scanner.nextLine();
                System.out.println("Ingresa el primer número");
                num1 = scanner.nextInt();
                System.out.println("Ingresa el segundo número ");
                scanner.nextLine();
                num2 = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ha elegido la Opción Suma");
                        sum = num1 + num2;
                        System.out.println(num1+"+"+num2+" = "+ sum);
                        break;
                    case 2:
                        System.out.println("Ha elegido la Opción restar");
                        rest = num1 - num2;
                        System.out.println(num1+"-"+num2+" = "+ rest);
                        break;
                    case 3:
                        System.out.println("Ha elegido la Opción multiplicación");
                        multi = num1 * num2;
                        System.out.println(num1+"*"+num2+" = "+ multi);
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        div = num1 / num2;
                        System.out.println(num1+"/"+num2+" = "+ div);
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }

            }else if (opcion == 5){
                System.out.println("saliendo del programa...");
            }
            } while (opcion != 5);


        scanner.close();
    }
}
