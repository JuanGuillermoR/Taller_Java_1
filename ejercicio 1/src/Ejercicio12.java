import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        int mes, dia;
        System.out.println("---Descubre tu horoscopo---");
        System.out.println("ingresa tu mes de nacimiento");
        Scanner scanner = new Scanner(System.in);
        mes = scanner.nextInt();
        System.out.println("ingresa tu día de nacimiento");
        dia = scanner.nextInt();

        switch (mes){
            case 1:
                if (dia <= 19){
                    System.out.println("tu signo zodiacal es Capricornio");
                }else{
                    System.out.println("tu signo zodiacal es Acuario");
                }
                 break;
            case 2:
                if (dia <= 18){
                    System.out.println("tu signo zodiacal es Acuario");
                }else{
                    System.out.println("tu signo zodiacal es Piscis");
                }
                break;
            case 3:
                if (dia <= 20){
                    System.out.println("tu signo zodiacal es Piscis");
                }else{
                    System.out.println("tu signo zodiacal es Aries");
                }
                break;
            case 4:
                if (dia <= 19){
                    System.out.println("tu signo zodiacal es Aries");
                }else{
                    System.out.println("tu signo zodiacal es Tauro");
                }
                break;
            case 5:
                if (dia <= 20){
                    System.out.println("tu signo zodiacal es Tauro");
                }else{
                    System.out.println("tu signo zodiacal es Géminis");
                }
                break;
            case 6:
                if (dia <= 20){
                    System.out.println("tu signo zodiacal es Géminis");
                }else{
                    System.out.println("tu signo zodiacal es Cáncer");
                }
                break;
            case 7:
                if (dia <= 22){
                    System.out.println("tu signo zodiacal es Cáncer");
                }else{
                    System.out.println("tu signo zodiacal es Leo");
                }
                break;
            case 8:
                if (dia <= 22){
                    System.out.println("tu signo zodiacal es Leo");
                }else{
                    System.out.println("tu signo zodiacal es Virgo");
                }
                break;
            case 9:
                if (dia <= 22){
                    System.out.println("tu signo zodiacal es Virgo");
                }else{
                    System.out.println("tu signo zodiacal es Libra");
                }
                break;
            case 10:
                if (dia <= 22){
                    System.out.println("tu signo zodiacal es Libra");
                }else{
                    System.out.println("tu signo zodiacal es Escorpio");
                }
                break;
            case 11:
                if (dia <= 21){
                    System.out.println("tu signo zodiacal es Escorpio");
                }else{
                    System.out.println("tu signo zodiacal es Sagitario");
                }
                break;
            case 12:
                if (dia <= 21){
                    System.out.println("tu signo zodiacal es Sagitario");
                }else{
                    System.out.println("tu signo zodiacal es Capricornio");
                }
                break;
            default:
                System.out.println("lo siento, se genero un error");
        }
    }
}
