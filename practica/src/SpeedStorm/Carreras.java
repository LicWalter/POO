package SpeedStorm;
import java.util.Scanner;

// medida principal =======================

public class Carreras {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("Bienvenido a SpeedStorm");
        System.out.println("=======================");
        Thread.sleep(2000);
        System.out.println("Selecciona la dificultad");
       
        int dificultad;

        
        do{          
            System.out.println("1. Fácil");
            System.out.println("2. Normal");
            System.out.println("3. Difícil");
            System.out.print("---->");
            dificultad = entrada.nextInt();
            System.out.println("=======================");
    
        switch(dificultad){
        
            case 1:
                System.out.println("Has seleccionado la dificultad: Fácil");
                break;
                
            case 2:
                System.out.println("Has seleccionado la dificultad: Normal");
                break;
                
            case 3:
                System.out.println("Has seleccionado la dificultad: Difícil");
                break;    
     
            default:     
                System.out.println("Por favor ingrese, una dificultad dentro de las opciones establecidas");
                break;

            }

        } while(dificultad < 1 || dificultad > 3);  
        
        
        
        do{          
            System.out.println("=======================");
            System.out.println("Seleccione el modo de juego:");
            System.out.println("1. Campaña");
            System.out.println("2. Arcade");
            System.out.println("3. Multijugador / Local");
            System.out.println("4. Configuración");
            System.out.println("5. Salir");
            System.out.print("---->");
            int modo = entrada.nextInt();
            System.out.println("=======================");
    
        switch(modo){
        
            case 1:
                System.out.println("Entrando al modo campaña...");
                break;
                
            case 2:
                System.out.println("Entrando a modo Arcade...");
                break;
                
            case 3:              
                System.out.println("A que modo desea entrar?");
                
                
                System.out.println("1. Multijugador");                
                System.out.println("2. Local");
                System.out.print("---->");
                int MM = entrada.nextInt();
                
                if(MM == 1){
                    System.out.println("Entrando al Modo Multijugador...");
                    System.out.println("=======================");
                }
                
                if(MM == 2){
                    System.out.println("Entrando al Modo Local...");
                    System.out.println("=======================");
                }
                break;
                
            case 4:
                System.out.println("Al ser una BETA, los ajustes predeterminados no pueden ser modificados");
                break;
                
            case 5:
                System.out.println("Saliendo del juego...");
                Thread.sleep(1500);
                break;
                
                
                default:     
                System.out.println("Por favor, ingrese una dentro de las opciones establecidas");
                break;
        }      
        } while(dificultad < 1 || dificultad > 5);
        
     
    
}
}