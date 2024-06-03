package practica;
public class mireloj {
    public static void main(String[] args) throws InterruptedException {
        
        for(int hora = 00; hora < 24; hora++){
        for(int minutos = 00; minutos < 60; minutos++){
        for(int segundos = 00; segundos < 60; segundos++){
        
            System.out.println(hora+":"+minutos+":"+segundos);
            
             Thread.sleep(1000);
          }
         }
       }
    }
}
            
        

  











































 
        /*while(true){
        
        if (horas<23){  
            
            System.out.print("0");
        }
            System.out.print(horas+":");
            
            
            if(minutos<60){
                System.out.print("0");
            }
            System.out.print(minutos+":");
            
            if(segundos<60){
                System.out.print("0");
            }
            System.out.print(segundos);
            
            segundos++;
            
            if(segundos==60){
                segundos=0;
                minutos++;
            }
            if(minutos==60){
                minutos=0;
                horas++;
            }
            if(horas==24){
                horas=0;
            }
        }
        
       
        
       
          
            
            //ralentiza la velocidad de ejecucion del algoritmo
            Thread.sleep(1000);
    }*/
    