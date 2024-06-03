package practica;

import java.util.Scanner;

public class Calificacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        String respuesta;

        do{
        
            System.out.println("========================");
            System.out.println("¿Cual fue tu calificacion?");
            System.out.println("De 1-20");
            System.out.print("--------------> ");
            nota = sc.nextInt();

            
            if (nota >= 1 && nota <= 20) {
            
            if (nota >= 19 && nota <= 20) {
                    System.out.println("La nota que obtuvo fue: A");
                } if (nota >= 16 && nota <= 18) {
                    System.out.println("La nota que obtuvo fue: B");
                } if (nota >= 13 && nota <= 15) {
                    System.out.println("La nota que obtuvo fue: C");
                } if (nota >= 10 && nota <= 12) {
                    System.out.println("La nota que obtuvo fue: D");
                } if (nota>=1 && nota<=9) {
                    System.out.println("La nota que obtuvo fue: E");
                } 
            }else{
                    System.out.println("Solamente valores dentro del intervalo(1-20)");
                
                }
                System.out.println("¿Quieres volver a ingresar nota? (si/no): ");
                respuesta = sc.next();
        }while(respuesta.equalsIgnoreCase("si"));
    }
}