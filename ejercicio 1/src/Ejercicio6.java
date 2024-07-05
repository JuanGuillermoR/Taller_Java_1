import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        System.out.println("---Ingresa el numero de un mes para determinar su cantidad de días---");
        Scanner scanner = new Scanner(System.in);
        int mes = scanner.nextInt();
        switch (mes){
            case 1:
                System.out.println("Enero tiene 31 días");
                break;
            case 2:
                System.out.println("Febrero tiene 29 días");
                break;
            case 3:
                System.out.println("marzo tiene 31 días");
                break;
            case 4:
                System.out.println("Abril tiene 30 días");
                break;
            case 5:
                System.out.println("Mayo tiene 31 días");
                break;
            case 6:
                System.out.println("Junio tiene 30 días");
                break;
            case 7:
                System.out.println("Julio tiene 31 días");
                break;
            case 8:
                System.out.println("Agosto tiene 31 días");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 días");
                break;
            case 10:
                System.out.println("Octubre tiene 31 días");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 días");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 días");
                break;
            default:
                System.out.println("Lo siento, hubo un error");
        }
    }
}
