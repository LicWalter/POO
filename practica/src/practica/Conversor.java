
package practica;
import java.util.Scanner;
public class Conversor {

    private static int res;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
       int años = 0, meses = 0, semanas = 0, dias = 0;
       String respuesta;
        
       do{
        System.out.println("Ingrese numero de días para hacer la conversión");
        
        int nDias = sc.nextInt();
 
        
        
        while(nDias>=365){
            años = años + 1;    
            nDias = nDias - 365;
        }
        while(nDias>=30){
            meses = meses + 1;
            nDias = nDias - 30;
        }
        while(nDias>=7){
            semanas = semanas + 1;
            nDias = nDias - 7;
        }
        
        
        dias = nDias;
        
        
        System.out.println("Años:"+años);
        System.out.println("Meses: "+meses);
        System.out.println("Semanas: "+semanas);
        System.out.println("Dias: "+dias);
        
          System.out.println("¿Quieres continuar? (si/no):");
            respuesta = sc.next();
        } while (respuesta.equalsIgnoreCase("si"));              
    }
}