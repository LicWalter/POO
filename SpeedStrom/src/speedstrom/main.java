package speedstrom;
import java.util.*;
public class main {
    
    
    /*for (int i = 0; i < 5; i++) {
            misEmpleados[i].mostrarDatos();
        }*/

    public static void main(String[] args) throws InterruptedException {
        
        plantillaCarro[] losCarros = new plantillaCarro[5];
        
        
        losCarros [0] = new carro1 ("Este carro contiene 2 puertas", "Ferrari FXXK", "Azul Rey", "2.5seg", "60/100");
        losCarros [1] = new carro1 ("Este carro contiene 4 puertas", "Toyota Supra", "Negro Mate", "4seg", "40/100");
        losCarros [2] = new carro1 ("Este carro contiene 2 puertas", "Nissan GTR", "Blanco", "2.7seg", "65/100");
        losCarros [3] = new carro1 ("Este carro contiene 4 puertas", "Lamborghini Spyder", "Verde fosfores...", "3.4seg", "40/100");
        losCarros [4] = new carro1 ("Este carro contiene 5 puertas", "Ford Mustang GT500", "Gris", "3.3seg", "27/100");
        
        
        
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("=======================");
        System.out.println("Bienvenido a SpeedStorm");
        System.out.println("=======================");
        Thread.sleep(2000);
        
       
        
        
        while(true){ 
        int modo = 0;
         
            System.out.println("Seleccione el modo de juego:");
            System.out.println("1. Campaña");
            System.out.println("2. Arcade");
            System.out.println("3. Multijugador / Local");
            System.out.println("4. Configuración");
            System.out.println("5. Salir");
            System.out.print("----> ");
            modo = sc.nextInt();
            System.out.println("=======================");
    
        switch(modo){
        
            case 1:
                System.out.println("Entrando al modo campaña...");
                System.out.println("=======================");
                Thread.sleep(1500);
                break;
                
            case 2:
                System.out.println("Entrando a modo Arcade...");
                System.out.println("=======================");
                
                Thread.sleep(1500);
                break;
                
            case 3:              
                System.out.println("A que modo desea entrar?");
                
                
                System.out.println("1. Multijugador");                
                System.out.println("2. Local");
                System.out.print("----> ");
                int MM = sc.nextInt();
                System.out.println("=======================");
                if(MM == 1){
                    System.out.println("Entrando al Modo Multijugador...");
                    System.out.println("=======================");
                    Thread.sleep(1500);
                }
                
                if(MM == 2){
                    System.out.println("Entrando al Modo Local...");
                    System.out.println("=======================");
                    Thread.sleep(1500);
                }
                break;
                
            case 4:
                System.out.println("Esta es una version BETA, por lo tanto, no se pueden modificar las configuraciones");
                System.out.println("=======================");
                
              if(modo==4){
                  modo=0;
              }
              Thread.sleep(1500);
                break;
                
            case 5:
                System.out.println("Saliendo del juego...");
                System.out.println("=======================");
                Thread.sleep(1500);
                System.exit(0);
                break;
                
            case 0:
            
                System.out.println("Exit");
                System.out.println(0);
                break;
                
            default:   
                
                System.out.println("Por favor, ingrese una dentro de las opciones establecidas");
                System.out.println("=======================");
                break;
        }      
               
          if(modo==1 || modo ==2 || modo ==3){
          
          
          System.out.println("Seleccione su carro");
          System.out.println("=======================");
        int seleccion = 0;
        System.out.print("1.");
        losCarros[0].nombreCarros();
        System.out.print("2.");
        losCarros[1].nombreCarros();
        System.out.print("3.");
        losCarros[2].nombreCarros();
        System.out.print("4.");
        losCarros[3].nombreCarros();
        System.out.print("5.");
        losCarros[4].nombreCarros();
        System.out.println("=======================");
        System.out.print("----> ");
        seleccion = sc.nextInt();
        System.out.println("=======================");
        Thread.sleep(1500);
       
       
       switch(seleccion){
       
       
           case 1:
               System.out.println("Haz seleccionado el ");
               losCarros[0].nombreCarros();
               System.out.println("=======================");
               Thread.sleep(1500);
               System.out.println("Sus atributos son: ");
               losCarros[0].mostrarDatos();
               System.exit(0);
               break;
           case 2:
               System.out.println("Haz seleccionado el ");             
               losCarros[1].nombreCarros();
               System.out.println("=======================");
               Thread.sleep(1500);
               System.out.println("Sus atributos son: ");
               losCarros[1].mostrarDatos();
               System.exit(0);
               break;
           case 3:
               System.out.println("Haz seleccionado el ");
               losCarros[2].nombreCarros();
               System.out.println("=======================");
               Thread.sleep(1500);
               System.out.println("Sus atributos son: ");
               losCarros[2].mostrarDatos();
               System.exit(0);
               break;
           case 4:
               System.out.print("Haz seleccionado el ");
               losCarros[3].nombreCarros();
               System.out.println("=======================");
               Thread.sleep(1500);
               System.out.println("Sus atributos son: ");
               losCarros[3].mostrarDatos();
               System.exit(0);
               break;
           case 5:
               System.out.println("Haz seleccionado el ");
               losCarros[4].nombreCarros();
               System.out.println("=======================");
               Thread.sleep(1500);
               System.out.println("Sus atributos son: ");
               losCarros[4].mostrarDatos();
               System.out.println("=======================");
               System.exit(0);
               break;
               
               
           default:
               System.out.println("Elija un carro dentro de las opciones establecidas");
               return;       
          }
        }
      }
   }  
}