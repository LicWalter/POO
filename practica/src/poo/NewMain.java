package poo;
import java.util.*;
public class NewMain {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        cliente cl1 = new cliente();
        
        
        
        System.out.println("Ingrese su nombre");
        cl1.nombre = sc.nextLine();
        
        System.out.println("Ingrese su apellido");
        cl1.apellido = sc.nextLine();

       
        
        System.out.println("Bienvenido "+cl1.nombreCompleto()+", por donde lo podríamos contactar?");
        System.out.println("1. Email / 2. Telefono");
        int choose = sc.nextInt();
        
        
        if(choose == 1){
            
            System.out.println("Ingrese su email");
            
            
        }
        cl1.email=sc.nextLine();
        
        if(choose == 2){
            
            System.out.println("Ingrese su telefono");
            
 
        }cl1.telefono = sc.nextLine();
        
        System.out.println(cl1.mostrarInfo());
    } 
    
}
